package com.stack;

import java.util.Arrays;

public class Stack {
private int arr[];
private int top;
private int size;

public Stack(int size) {
	// TODO Auto-generated constructor stub
top=-1;
this.size=size;
arr=new int[this.size];
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
public int peek()
{
	if(!isEmpty()) {
		System.out.println("peek element is"+arr[top]);
		return arr[top];
		
	}
		else {
			System.exit(1);
		}
	return -1;
}

//pop 
public int pop()
{
	if(isEmpty())
	{
		System.out.println("underflow");
	System.exit(1);
	}
	System.out.println("Removing"+peek());
	int topitem=peek();
	 arr[top--]=0;
	 return topitem;
	 
}
public void push(int x)
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

