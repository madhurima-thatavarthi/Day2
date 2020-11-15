package com.pojo;

public class Smallest {
    private int a;
    private int b;
    private int c;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
    public void display() {
    	if(a<b && a<c)
    		System.out.println("Smallest number is ="+a);
    	else if(b<a && b<c)
    		System.out.println("Smallest number is ="+b);
    	else
    		System.out.println("Smallest number is ="+c);
    		
    }
}
