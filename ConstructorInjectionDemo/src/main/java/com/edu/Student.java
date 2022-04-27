package com.edu;

public class Student {
	private int sid;
	private String sname;
	private float sfees;
	public Student(int sid, String sname, float sfees) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfees = sfees;
	}
	
	public void studentDisplay()
	{
		System.out.println("student id: "+sid);
		System.out.println("student name: "+sname);
		System.out.println("student fees: "+sfees);
	}

}
