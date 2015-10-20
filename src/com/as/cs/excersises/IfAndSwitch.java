package com.as.cs.excersises;
import java.util.*;
public class IfAndSwitch {

	public static void main(String[] args) {
		
		checkEligibility();
	}
@SuppressWarnings("resource")
static void checkEligibility(){
	int age;
	Scanner sc=new Scanner(System.in);
	System.out.print("What is your age");
	age=sc.nextInt();
	if(age>=18)
		System.out.println("You are able to get married");
		else
			System.out.println("You are to young");
}
}
