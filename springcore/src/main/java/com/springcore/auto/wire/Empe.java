package com.springcore.auto.wire;

public class Empe {
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Empe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empe(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Empe [address=" + address + "]";
	}
	
	

}
