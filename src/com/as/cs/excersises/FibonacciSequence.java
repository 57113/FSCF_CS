package com.as.cs.excersises;

public class FibonacciSequence {

	public static void main(String[] args) {
		fibSeq();
	}
public static void fibSeq (){
	double numberOne = 0;
	double numberTwo = 1;
	double output = numberOne + numberTwo;
	int lineCounter = 0;
	System.out.println(numberOne);
	lineCounter = lineCounter +1;
	System.out.println(numberTwo);
	lineCounter = lineCounter +1;
	while (lineCounter <95){
		numberOne = numberTwo;
	    numberTwo = output;
	    output = numberOne + numberTwo;
	    System.out.println(output);
	    lineCounter = lineCounter +1;
}
	
			
	
}
}
