package com.pojo;

public class Vowels {
	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public void display() {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u'|| str.charAt(i) == 'A'|| str.charAt(i) == 'E'|| 
					str.charAt(i) == 'I'|| str.charAt(i) == 'O'|| str.charAt(i) == 'U') {
				count++;
			}
		}
		System.out.println("Number of vowels in the string = " + count);
	}
}
