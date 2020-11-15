package com.pojo;

public class Bike extends Cycle {

	public String define_me() {

		return "a cycle with an engine.";

	}

	public Bike() {

		System.out.println("Hello I am a Bike I am " + define_me());

		String temp = define_me();

		System.out.println("My ancestor is a cycle who is " + temp);

	}
}
