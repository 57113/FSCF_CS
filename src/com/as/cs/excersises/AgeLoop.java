package com.as.cs.excersises;
import java.util.*;

public class AgeLoop {

	public static void main(String[] args) {
	age();
	}
public static void age(){
	int age;
	int x;
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.print("How Old Are You");
	age = sc.nextInt();
	x = age;
	while (x <999){
	 System.out.println("Congratulations on being " + age);
	}
		
}
}
