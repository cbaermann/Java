package com.coding.dll;
public class DLL {
    public Node head;
    public Node tail;
    
    public DLL() {
        this.head = null;
        this.tail = null;
    }
    
    public void push(Node newNode) {
        if(this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        
        Node lastNode = this.tail;
        lastNode.next = newNode;
        newNode.previous = lastNode;
        this.tail = newNode;
    }
    
    public void printValuesForward() {
        Node current = this.head;
        while(current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }
    
    public void printValuesBackward() {
    	Node current = this.tail;
    	while(current != null) {
    		System.out.print(current.value);
    		current = current.previous;
    	}
    }
    
    public Node pop() {
    	if(this.tail == null) {
    		System.out.print("No values");
    	}
    	Node lastNode = this.tail;
    	this.tail = lastNode.previous;
    	System.out.println(lastNode.value);
    	return lastNode;
    }
    
}