package com.as.cs.excersises;

public class Calculator {//calculator class
	private float numOne;//attribute/variable declaration of float type called numOne
	private float numTwo;//attribute/variable declaration of float type called numTwo
	public Calculator(){//This is the start 
		}
	public float getNumTwo() {
		return numTwo;
		}
	public void setNumTwo(float numTwo) {
		this.numTwo = numTwo;
		}
	public float getNumOne() {
		return numOne;
	}
	public void setNumOne(float numOne) {
		this.numOne = numOne;
	}
	public float add(){
		return numOne + numTwo;
	}
	public float subtract(){
		return numOne - numTwo;	
	}
	public float divide(){
		return numOne /numTwo;	
	}
	public float multiple(){
		return numOne*numTwo;
	}
}

