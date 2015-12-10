package com.as.decexcersises;
import java.util.ArrayList;
public class asterixEx {

	public static void main(String[] args) {

test();
	}
public static void test(){
	ArrayList<String> testlist = new ArrayList<String>();
	testlist.add( "CaptainAmerica" );
	testlist.add( "BlackWidow" );
	testlist.add( "IronMan" );
	testlist.add( "Hawkeye" );
	testlist.add( "Thor" );
	testlist.add( "ScarlettWitch" );
	testlist.add( "PeggyCarter" );
	testlist.add( "Hulk" );
	int i = 0;
	while(i < testlist.size()){
	String temp = testlist.get(i);
	if(temp.length()==4){
		System.out.println("****" + temp);
		/**testlist.add(i - 1,"****");
		temp = testlist.get(i -1);
		System.out.println(temp);*/
	}
	else
	System.out.println(temp);
	i ++;
	}
	
}

	

}