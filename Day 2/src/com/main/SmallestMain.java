package com.main;

import java.util.Scanner;
import com.pojo.Smallest;

public class SmallestMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Smallest smallest = new Smallest();
		System.out.print("Enter first number:");
		int num1 = sc.nextInt();
		System.out.print("Enter second number:");
		int num2 = sc.nextInt();
		System.out.print("Enter third number:");
		int num3 = sc.nextInt();
		smallest.setA(num1);
		smallest.setB(num2);
		smallest.setC(num3);
		smallest.display();
		
		smallest=null;
		sc.close();

	}

}
