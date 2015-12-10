package com.as.friendsContact;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
public class DataReader {
public void fileReader(){
}
	public static void main(String[] args) throws FileNotFoundException {
	Scanner scanner = new Scanner(new File("data.csv"));
	scanner.useDelimiter(",");
	while (scanner.hasNext()){
		System.out.print(scanner.next() + ",");
	}
scanner.close();
	}
}
