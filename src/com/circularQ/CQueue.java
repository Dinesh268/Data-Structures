package com.circularQ;

import java.util.Arrays;

public class CQueue {
private int []q;
private int size;
private int total;
private int front;
private int rear;

public CQueue()
{
	size=100;
	total=0;
	front=0;
	rear=0;
	q=new int[size];
			
	
}

public CQueue(int size)
{
	this.size=size;
	total=0;
	front=0;
	rear=0;
	q=new int[this.size];
	
}
public void enqueue(int item)
{
	if(isFull())
	{
		
		System.out.println("queue is full");
		System.exit(1);
	}
	else {
		total++; 
		q[rear]=item;
		rear=(rear + 1)%size;
		System.out.println("element enqueued is"+item);
		
	}
	

}
public int dequeue() {
	if(isEmpty())
	{   System.out.println("queue is empty cant dequeue");
	System.exit(1);
		return 0;
	}else {
	int item=q[front];
	q[front]=0;
	total--;
	front=(front+1)%size;//this is bcz front is pointing to 0th index and next time it has to pont to 1st and so on
	System.out.println("item dequeued"+item);
    return item;
	}
}

public boolean isFull(){
	if(size==total)
	{
		System.out.println("Q is full");
		return true;
	}
	else {
		return false;
	}
}
public boolean isEmpty(){
	if(total==0)
	{
		System.out.println("Queue is empty");
		return true;
	}
	else {
		return false;
	}
}
public void display() {
	System.out.println(Arrays.toString(q));
	
}
}
