package com.pojo;

public class Room {
	int roomNo;
	String roomType;
	String roomArea;
	boolean acMachine;
	

	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public String getRoomArea() {
		return roomArea;
	}
	public void setRoomArea(String roomArea) {
		this.roomArea = roomArea;
	}
	public boolean isAcMachine() {
		return acMachine;
	}
	public void setAcMachine(boolean acMachine) {
		this.acMachine = acMachine;
	}
	void setData(int rno, String rt, String area, boolean ac) {
		roomNo = rno;
		roomType = rt;
		roomArea = area;
		acMachine = ac;
	}
	public void displayData() {
		System.out.println("The room number is = "   + roomNo);  
		System.out.println ("The room type is"  + roomType);   
		System.out.println ("The room area is "   + roomArea);   
		String s = (acMachine)  ? "yes " : "no";   
		System.out.println ("The A/c Machine needed "  + s);
	}

}
