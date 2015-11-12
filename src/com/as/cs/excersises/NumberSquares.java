package com.as.cs.excersises;
import java.util.Scanner;
public class NumberSquares {
	public static void main(String[] args) {
		int[] userList = {};
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	for (int a = 0; a == 9; a++){
		System.out.print("Please enter a number");
		 userList[a] = sc.nextInt();
	}
		printArray(userList);
	}	
public static void printArray(int[] array){
	for(int i = 0; i < array.length;i++){
	System.out.println(array[i] + " ");	
	}
}
}
