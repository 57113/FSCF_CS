package com.as.cs.excersises;

import java.util.Scanner;

public class IQrejection {

	public static void main(String[] args) {
		
iq();
	}
public static void iq(){
	int iq = 0;
	int errors = 0;
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.print("What is your IQ");
	iq = sc.nextInt();
	while(iq <200){
		System.out.println("What an IQ! " + iq);
		if (iq<50);
		System.out.println("To Low IQ");
		errors = errors + 1;
		if(iq >200);
		System.out.println("Your not fooling anyone with that IQ");
		errors = errors + 1;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
