package com.as.cs.excersises;

public class TestingStrings {

	public static void main(String[] args) {
	String firstName = "Booker ";
	String lastName = "DeWitt ";
	String fullName = firstName.concat(lastName);
	String anotherName = firstName;
	String str = "Random stuff";
	String subStringOne = str.substring(4,6);
	String one ="abcs";
	String two ="abc";

	String s1 = new String("abc");
		String s2="abc";
		String s3="abc";
		if(s1==s2)
			System.out.println("S1==S2");
		if(s1==s3)
			System.out.println("S1==S3");
		if(s2==s3)
			System.out.println("S2==S3");
	System.out.println(fullName);
	System.out.println("Is first name equal to another name : " +firstName.equals(anotherName));
	System.out.println("Is first name equal to last name : " + firstName.equals(lastName));
	System.out.println(subStringOne);
	System.out.println("one " + one.toString());;
	System.out.println("Two " + two.toString());	
	}

}
