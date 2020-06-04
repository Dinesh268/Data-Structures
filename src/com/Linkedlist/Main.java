package com.Linkedlist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList list=new LinkedList(1);
list.Insertfront(3);
list.Insertfront(5);
list.Insertfront(8);
list.Shownode();

System.out.println();
list.InsertLast(45);
System.out.println();
list.Shownode();
list.Insertfront(67);
System.out.println();

list.Shownode();
list.sortList();
System.out.println();
list.Shownode();

	}

}
