package com.Queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    IntQ q=new IntQ(5);
    q.enqueue(12);
    q.enqueue(23);
    q.enqueue(45);
    q.enqueue(60);
    q.display();
    q.dequeue();
    q.display();
    q.dequeue();
    q.display();
    q.dequeue();q.dequeue();
    q.display();
    q.dequeue();
    
	}

}
