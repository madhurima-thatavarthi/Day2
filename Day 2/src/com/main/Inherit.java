package com.main;

import com.pojo.A;
import com.pojo.B;

public class Inherit {

	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		a.sleep();
		b.read();
		
		a=null;
		b=null;

	}

}
