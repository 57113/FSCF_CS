package com.as.cs.excersises;
import java.util.*;
public class OddOrEven {

	public static void main(String[] args) {
		checkOddEven();
	}
@SuppressWarnings("resource")
static void checkOddEven(){
	int num1;
	int num2 = 2;
	Scanner sc=new Scanner(System.in);
	System.out.print("Please enter your number");
	num1 = sc.nextInt();
		int result = num1%num2;
		if(result<= 0)
		System.out.println("The Number Is Even");
		else
			System.out.println("The Number Is Odd");
}
}
