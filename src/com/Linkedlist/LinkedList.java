package com.Linkedlist;


//import com.sun.org.apache.bcel.internal.classfile.Node;

public class LinkedList {
private Node head;

public LinkedList(int item) {
	head=new Node();
	head.value=item;
	head.link=null;
	//till here we have constructed 1head and 1 node with vale and link set to null
}

public LinkedList() {
	// TODO Auto-generated constructor stub
}

public boolean Insertfront(int item)//inserting at the front
{
	Node n=new Node();//creating a new node
	n.value=item;
	n.link=head;//palcing the node in between head an 1st node
	//make our new node n pointing to the same point where head is pointing
	head=n;//point the head to the node n
	return true;
}
public boolean InsertLast(int item)
{
	Node n=new Node();//creating the new node
	Node new_node;//Temp variable to traversal till last node in the list
	new_node =head; //reference of head is given  to newnode(newnode is pinting to head)
	while(new_node.link!=null)
	{
		new_node=new_node.link;
	}
    n.value=item;
    n.link=null;
    //now 2nd block of the last node sould contain the address of new node
    //now this n we have to link to the last node for which new_node pointing
    new_node.link=n;//new_node has the address of last node giing its link to the last node
     return true;
}
 
public void Shownode()
{
	Node z=head;//getting the address/reference of the head to z now z is poinint to head
	while(z!=null)//2nd block of last node always has null we have to iterate till then.
	{
		System.out.print(" "+z.value);
		z=z.link;//now z points to 3rd node by taking its link
	}
}

public boolean deleteItem(int item)
{
	 if(head.value==item)//if the value is existed in first node
	 {
		 head=head.link;//head points to the seond node(shift pointer of head to next node
		  return true;
	 }else //if we dont find the key in first node we need to aterate through whole list
	 {
		Node x=head;//take first node reference
		Node y=head.link;//taking 2nd node reference
		 while(true)
		 {
			 if(y==null || y.value==item)//y becomes null at last node or y.value =item
			 {
				 break;
			 }else {
				//if dont get item match keep on updating the y(trversing node)
			  x=y;//x containing the address of next node (y=y.link)
			 y=y.link;//y travesal to its next node
			 }
		 }
		 
		 if(y!=null)//y.value==item will come here t.i we successfully fond the item
		 {
			 
			 x.link=y.link;//make x pointing to the same node where y is poinitg here the node between the nodes x and y will be removed
	 return true;
	 }else {
		 return false;
	       }
    }
	 
}

public void sortList()
{
	int c=0;
	Node a=head.link;
	while(a.link!=null) {
		Node b=head.link;
	while(b.link!=null)
	{
		if(b.value<b.link.value) {
			c=b.value;
			b.value=b.link.value;
			b.link.value=c;
		}
		b=b.link;
	}
	a=a.link;
	}
}

class Node  //child classof th parent class
{
	private int value;
	private Node link;
}
}
