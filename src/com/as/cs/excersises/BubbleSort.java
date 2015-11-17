package com.as.cs.excersises;
import java.util.Arrays;
public class BubbleSort {
	public static void main(String[] args) {
	bubbleSort();	
	}
	public static void bubbleSort(){
		System.out.println(System.currentTimeMillis());
		
		int i ;
		int temp;
		int checkArray[] = {2,67,23,67,45,23,23,12,78,45,21,21312,213123,2545,213123,453,21312,4355,121334,2343423,3423123};
		for (i = 0; i < checkArray.length - 1; i++){
			for (i = 0; i < checkArray.length - 1; i++){
				if(checkArray[i]>checkArray[i+1]){
					temp = checkArray[i];
					checkArray[i] = checkArray[i+1];
					checkArray[i+1] = temp;
					}
			}
			System.out.println(Arrays.toString(checkArray));
			System.out.println(System.currentTimeMillis());
		}
	}
}