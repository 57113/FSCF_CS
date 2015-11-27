package com.as.cs.excersises;

import java.util.Scanner;

public class Arrays3d {

	public static void main(String[] args) {
		
data();
	}
@SuppressWarnings("resource")
public static void data(){
	int employee[][][] = new int[100][52][7];
	System.out.println("**ENTER DATA**");
	Scanner sc=new Scanner(System.in);
	employee[1][50][3] = sc.nextInt();
	
		System.out.println(employee[1][50][3]);
	}
	
	
	
	
	
	
	
}

