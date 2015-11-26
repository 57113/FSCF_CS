package com.as.cs.excersises;

public class LinkListsTheStack {
	//Declaration of the node and the counter
private Node head;private int counter;
	// The Constructor for the LinkedListsTheStack class
public LinkListsTheStack(){head = new Node(null);counter = 0;}
public void add(Object data){
	//Changes the element number at the end of the list
	Node temp = new Node(data);
	//Creates a new Node called Temporary
	Node Current = head;
	// This sets the "Current" Node to the first node in the array
	while(Current.getNext() != null ){Current = Current.next;}
	//This is a While statement that executes the code in the block as long as current node doesn't equal null
	//The code in the block sets the value of the current to equal the value of the current.next
	Current.setNext(temp);
	//This sets the temp node
	counter++;}
	//This increments the number of elements in the array
public Object get(int index){
	if(index <= 0)
		return null;
	Node current = head.getNext();
	for(int i = 1;i < index; i ++);{
}
}
	public static void main(String[] args) {
	
	}
	private class Node{
	//Declaration of the class called Node
		private Node next;
	//gives a reference to the next node if it exists, if not it will be set to null
		private Object data;
	//The data you required is in this node
	//This is the constructor for the Node
		public Node (Object _data){next = null;data = _data;}
	//This is another Node constructor for the node that points to the next node
		public Node(Object _data, Node _next){next = _next;data = _data;}	
	//The Getters and Setters
		public Object getData() {return data;}
		public void setData(Object _data) {data = _data;}
		public Node getNext() {return next;}
		public void setNext(Node _next) {next = _next;}
	}
	}

	


