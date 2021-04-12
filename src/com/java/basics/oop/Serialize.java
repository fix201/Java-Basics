package com.java.basics.oop;

import java.io.Serializable;

/**
 * Using Serializable
 * Serialization is the process of encrypting your java objects into finally codes
 * 
 * @author Incognito
 *
 */

public class Serialize implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3535008279551271654L;
	Integer id;
	String name;

	public Serialize(Integer id, String name) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serialize other = (Serialize) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}