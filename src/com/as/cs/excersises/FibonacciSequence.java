package com.as.cs.excersises;

public class FibonacciSequence {

	public static void main(String[] args) {
		fibSeq();
	}
public static void fibSeq (){
	int numberOne = 0;
	int numberTwo = 1;
	int output = numberOne + numberTwo;
	while (output< 99999999)
		numberOne = numberTwo;
	    numberTwo = output;
	    output = numberOne + numberTwo;
	    System.out.print(output);
	
			
	
}
}
