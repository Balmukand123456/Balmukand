package com.sapient.beans;

public class Camera extends Product {
	public Camera(int pid, String pname, double price,String lens) {
		super(pid, pname, price);
	this.lens = lens;
	}

	private String lens;

	@Override
	public String isExpensive() {
		if(getPrice() >= 10000)
			return "costlier";
		else
		return "average";
	}

}
