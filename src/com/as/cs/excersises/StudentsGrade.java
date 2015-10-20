package com.as.cs.excersises;
import java.util.*;
public class StudentsGrade {

	public static void main(String[] args) {
grades();
	}
@SuppressWarnings("resource")
static void grades(){
	int quiz;
	int midTerm;
	int finalScore ;	
	Scanner sc=new Scanner(System.in);
	System.out.print("What was the Quiz score");
	quiz=sc.nextInt();
	System.out.print("What was the Midterm score");
	midTerm=sc.nextInt();
	System.out.print("What was the Final score");
	finalScore=sc.nextInt();
	int score = quiz+ midTerm+finalScore % 3;
	if (score>= 90){
		System.out.println("A Grade");
	}
	else if (score>=70){
		System.out.println("B Grade");
	}
	else if (score>=50){
		System.out.println("C Grade");
	}
	else if (score<=50){
		System.out.println("F Grade");
	}
}
}
