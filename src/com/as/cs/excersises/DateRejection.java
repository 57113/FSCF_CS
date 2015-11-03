package com.as.cs.excersises;
import java.util.Scanner;
public class DateRejection {

	public static void main(String[] args) {
	userDate();

	}
public static void userDate(){
	int errorCount = 0;
	System.out.print("Please Enter A Day");
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	int day = sc.nextInt() ;
	System.out.print("Please Enter A Month");
	int month= sc.nextInt() ;
	System.out.print("Please Enter A Year");
	int year= sc.nextInt() ;
	if (day < 31)
		System.out.print("Please Enter A Valid Date");
	errorCount = errorCount + 1;
	if (month < 12)
		System.out.print("Please Enter A Valid Date");
	errorCount = errorCount + 1;
	if (errorCount ==0)
	System.out.print(day + "/" + month + "/" +year);
}
}
