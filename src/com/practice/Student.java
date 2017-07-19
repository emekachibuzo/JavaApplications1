package com.practice;

public class Student {
	
	public String grade(int gd)
	{
		if((gd>=80) && (gd <=100))
		{
			return "A";
		}
		else if((gd>=70) && (gd <80))
		{
			return "B";
		}
		else if((gd>=60) && (gd <70))
		{
			return "C";
		}
		else if((gd>=50) && (gd <60))
		{
			return "D";
		}
		else if((gd>=0) && (gd <50))
		{
			return "F";
		}
		else
		{
			return "Wrong score";
		}
	}
	
	public boolean getStatus(int gd)
	{
		String g = grade(gd);
		if((g.equals("F")) || (g.equals("Wrong score")))
		{
			return false;
		}
		else
		{
			return true;
		}
	}

}
