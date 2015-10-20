package com.as.cs.excersises;
import java.util.*;
public class SalesCalculator {

	public static void main(String[] args) {
		revenue();
	}
@SuppressWarnings("resource")
static void revenue(){
	double price;
	int quantity;
	double finalPrice = 0;
	Scanner sc=new Scanner(System.in);
	System.out.print("Please enter the Price of the product");
	price = sc.nextDouble();
	System.out.print("Please enter the Quantity of the product");
	quantity = sc.nextInt();
	if (quantity>= 120){
		finalPrice = price * 0.85;
		System.out.println("£" + finalPrice);
	}
	else if(quantity<100){
		finalPrice = price * 0.9;
		System.out.println("£" + finalPrice);
	}
	else if(quantity<100){
		finalPrice = price * 0.9;
		System.out.println("£" + finalPrice);
	}
}

}
