package com.demo.microservices.limitsservice.bean;

public class LimitConfiguration {

	private int minimum;
	private int maximum;
	
	 public LimitConfiguration() {
		// TODO Auto-generated constructor stub
	}
	 

	public LimitConfiguration(int minimum, int maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}


	public int getMinimum() {
		return minimum;
	}


	public int getMaximum() {
		return maximum;
	}


	 
}
