package com.main;

import java.util.Scanner;

import com.pojo.MiddleChar;

public class MiddleCharMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MiddleChar middlechar = new MiddleChar();
		System.out.print("Enter word: ");
		String str = sc.nextLine();
		middlechar.setStr(str);
		middlechar.display();

		middlechar = null;
		sc.close();
	}

}
