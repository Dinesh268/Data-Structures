package com.stack;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student student1=new Student("dinesh",101);
Student student2=new Student("kapil",102);
Student student3=new Student("mohan",103);
	
StudentStack stack=new StudentStack(5);
	stack.push(student1);
	stack.push(student2);
	stack.push(student3);
	stack.display();
	stack.pop();
	stack.peek();
	stack.display();
	}

}
