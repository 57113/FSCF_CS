package com.as.cs.excersises;

public class TheStack {
private int maxSize;
private long[] stackArray;
private int top;
public void Stack(int maxSize){
	this.maxSize=maxSize;
	this.top=1;
	stackArray=new long[maxSize];
}
public void push(long j){
	String result = top==stackArray.length-1?"Stack is Full":
		pushItem(j);
msgBox(result);
}
public String pushItem(long j){
	stackArray[++top]=j;
	return "Item Added To The Stack";
}
public void pop(){
	msgBox(top==-1?"Stack Is Empty":popItem());
}
public String popItem(){
	return "Item At The Top : " + stackArray[top--] + " Removed";
}
public void msgBox(String message){
	System.out.println(message);
}
public boolean isEmpty(){
	return(top==-1);
}
public boolean isFull(){
	return (top==stackArray.length-1);
}
}
