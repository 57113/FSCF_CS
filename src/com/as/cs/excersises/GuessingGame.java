package com.as.cs.excersises;
import java.util.Scanner;
public class GuessingGame {
	public static void main(String[] args) {
		number();
}
public static void number(){
 int number = (int)Math.random()* 100;
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
		int guess = sc.nextInt() ;
		if (guess < number)
			System.out.println("To Low, Try again");
		if (guess > number)
			System.out.println("To High, Try again");
		if (guess == number)
			System.out.println("Spot on Genuis!");
}
}

