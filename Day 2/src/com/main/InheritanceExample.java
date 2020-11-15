package com.main;

import com.pojo.Bark;

public class InheritanceExample {
	public static void main(String[] args){

		Bark bark=new Bark();;

		bark.walk();
		bark.eat();
		bark.barking();
		
		bark=null;
		}
}
