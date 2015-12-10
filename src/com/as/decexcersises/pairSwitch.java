package com.as.decexcersises;
import java.util.ArrayList;
public class pairSwitch {
	public static void main(String[] args) {
test();
	}
public static void test(){
	ArrayList<String> testlist = new ArrayList<String>();
	testlist.add( "Captain America" );
	testlist.add( "Black Widow" );
	testlist.add( "Iron Man" );
	testlist.add( "Hawkeye" );
	testlist.add( "Thor" );
	testlist.add( "Scarlett witch" );
	testlist.add( "Peggy Carter" );
	testlist.add( "Hulk" );
	testlist.toArray();
	int i = 0;
	System.out.println("*****This is the original array list*****");
	System.out.println(testlist);
	System.out.println("*****This is the Pair Switched array list*****");
	while(i < testlist.size()){
	String temp = testlist.get(i);
	String temp1= testlist.get(i+1);
	testlist.set(i, temp);
	testlist.set(i + 1, temp1);
	System.out.println(temp1);
	System.out.println(temp);
	i ++;
	i ++;

	}
}
}
