package com.as.cs.excersises;

public class CalculatorController {//controller class
	public static void main(String[] args) {//main method
		Calculator CalculatorOne = new Calculator();//Constructer creates a new object of Calculator class called CalculatorOne
		CalculatorOne.setNumOne(Float.parseFloat(args[0]));// assigns the value of numOne, converts it into a float type then stores it in the 1st level of the array
		CalculatorOne.setNumTwo(Float.parseFloat(args[1]));// assigns the value of numTwo, converts it into a float type then stores it in the 2nd level of the array
		System.out.println("Addition =  " + CalculatorOne.add()); //Displays the value that is produced in the attribute add in the Calculator class
		System.out.println("Subtract =  " + CalculatorOne.subtract());//Displays the value that is produced in the attribute subtract in the Calculator class
		System.out.println("Multiple =  " + CalculatorOne.multiple());//Displays the value that is produced in the attribute multiple in the Calculator class
		System.out.println("Divide =  " + CalculatorOne.divide());//Displays the value that is produced in the attribute divide in the Calculator class
	}

}
