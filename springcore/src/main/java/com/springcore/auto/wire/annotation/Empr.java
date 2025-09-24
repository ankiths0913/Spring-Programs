
package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Empr {
	@Autowired
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Empr() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empr(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Empr [address=" + address + "]";
	}
	
	

}