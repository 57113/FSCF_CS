package com.as.cs.excersises;
import java.util.Scanner;
public class PrimeNumberCheck {

public static void main(String[] args) {
	prime();

}
public static void prime (){
	System.out.print("Please enter a number that you would like to check to see if its prime : ");
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	int numOne = sc.nextInt();
	if(numOne / numOne == 1){
		System.out.print("Your number is an Prime number");		
	}
	if(numOne / numOne <1){
		System.out.print("Your number is not an Prime number");
	}
}
}
