package com.as.decexcersises;
import java.util.ArrayList;
public class ArrayLists {

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
	//System.out.println(x);
	int i = 0;
	while(i < testlist.size()){
	String temp = testlist.get(i);
	System.out.println(temp);
	i ++;
	}
}
}
