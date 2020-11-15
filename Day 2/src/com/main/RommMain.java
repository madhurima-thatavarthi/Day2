package com.main;

import java.util.Scanner;

import com.pojo.Room;

public class RommMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Room room=new Room();
		System.out.println("Room no=");
		int num1=sc.nextInt();
		System.out.println("Room type is=");
		String str=sc.nextLine();
		System.out.println("Room Area is=");
		String str1=sc.nextLine();
		System.out.println("Account number=");
		boolean bn=sc.nextBoolean();
		room.setRoomNo(num1);
		room.setRoomType(str);
		room.setRoomArea(str1);
		room.setAcMachine(bn);
		room.displayData();
		
		room=null;
		sc.close();

	}

}
