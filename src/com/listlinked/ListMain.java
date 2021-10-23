package com.listlinked;

public class ListMain {
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.insertAtEnd(56);
		linkedList.insertAtEnd(70);
		System.out.println("Original list: ");
		linkedList.display();
		
		linkedList.insertInbtwn(30);
		System.out.println("updated list: ");
		linkedList.display();
		
		linkedList.popLast();
		System.out.println("After deleting the Last node");
		linkedList.display();
		
		System.out.println("The searched element is: 30");
		linkedList.searchNode(30);
		}
}