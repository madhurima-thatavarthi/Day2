package com.pojo;

public class MiddleChar {
	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public void display() {
		int position;
		int length;
		if (str.length() % 2 == 0) {
			position = str.length() / 2 - 1;
			length = 2;
		} else {
			position = str.length() / 2;
			length = 1;
		}
		System.out.println("Middle character in the word is = " + str.substring(position, position + length));
	}
}
