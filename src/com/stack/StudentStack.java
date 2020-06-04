package com.stack;

import java.util.Arrays;

public class StudentStack {
    private Student arr[];
	private int top;
	private int size;

	public StudentStack(int size) {
		// TODO Auto-generated constructor stub
	top=-1;
	this.size=size;
	arr=new Student[this.size];
	}

	public boolean isFull() {
		return top==size-1;
	}
	public boolean isEmpty()
	{
		return top==-1;
	}

	public int size()
	{
		return top+1;
	}

	//custom function to retun the top lement in the stack
	public Student peek()
	{
		if(!isEmpty()) {
			System.out.println("peek element is"+arr[top]);
			return arr[top];
			
		}
			else {
				System.exit(1);
			}
		return null;
	}

	//pop 
	public Student pop()
	{
		if(isEmpty())
		{
			System.out.println("underflow");
		System.exit(1);
		}
		System.out.println("Removing"+peek());
		Student topitem=peek();//getting top item into temporory variable
		arr[top--]=null;//deleteing its postion
		return topitem;//returning the element
	}
	public void push(Student x)
	{
		if(isFull())
		{
			System.out.println("Overflow");
			System.exit(1);
		}
		System.out.println("pushing"+x);
		arr[++top]=x;
	}
	public void display()
	{
		System.out.println(Arrays.toString(arr));
	}


	
	
	}



