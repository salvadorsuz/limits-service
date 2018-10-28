package com.in28minutes.microservices.limitsservice.beans;

public class LimitConfiguration {
	
	private int maximun;
	
	private int minimun;
	
	public int getMaximun() {
		return maximun;
	}
	
	public void setMaximun(int maximun) {
		this.maximun = maximun;
	}
	
	public int getMinimun() {
		return minimun;
	}
	
	public void setMinimun(int minimun) {
		this.minimun = minimun;
	}
}
