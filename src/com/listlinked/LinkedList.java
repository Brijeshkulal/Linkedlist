package com.listlinked;

public class LinkedList {
	Node head;
	Node tail;
	
	public void insert(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
			tail = node;
			}
		else {
			tail.next = node;
			tail = node;
		}
	}
	
	public void insertInbtwn(int data) {
		Node node = new Node(data);
		Node temp = head.next;
		head.next = node;
		node.next = temp;
		}
	 
	 /* Delete the first node
		public void pop() {
		Node toDelete = head;
		head = head.next;
		toDelete = null;
	}*/
	
	public void popLast() {
		Node temp = head;
		while(temp.next.next != null){
			temp = temp.next;
		}
        temp.next = null;
	}
	
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}
