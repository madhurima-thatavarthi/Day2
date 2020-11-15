package com.main;

import java.util.Scanner;
import com.pojo.Vowels;

public class VowelsMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vowels vowels = new Vowels();
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		vowels.setStr(str);
		vowels.display();

		vowels = null;
		sc.close();

	}

}
