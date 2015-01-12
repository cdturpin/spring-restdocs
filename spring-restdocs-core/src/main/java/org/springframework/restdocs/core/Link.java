/*
 * Copyright 2014-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.restdocs.core;

import org.springframework.core.style.ToStringCreator;

/**
 * Representation of a link used in a Hypermedia-based API
 * 
 * @author Andy Wilkinson
 */
public class Link {

	private final String rel;

	private final String href;

	/**
	 * Creates a new {@code Link} with the given {@code rel} and {@code href}
	 * 
	 * @param rel The link's rel
	 * @param href The link's href
	 */
	public Link(String rel, String href) {
		this.rel = rel;
		this.href = href;
	}

	/**
	 * Returns the link's {@code rel}
	 * @return the link's {@code rel}
	 */
	public String getRel() {
		return rel;
	}

	/**
	 * Returns the link's {@code href}
	 * @return the link's {@code href}
	 */
	public String getHref() {
		return href;
	}

	@Override
	public int hashCode() {
		int prime = 31;
		int result = 1;
		result = prime * result + href.hashCode();
		result = prime * result + rel.hashCode();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Link other = (Link) obj;
		if (!href.equals(other.href)) {
			return false;
		}
		if (!rel.equals(other.rel)) {
			return false;
		}
		return true;
	}

	public String toString() {
		return new ToStringCreator(this).append("rel", this.rel)
				.append("href", this.href).toString();
	}

}
