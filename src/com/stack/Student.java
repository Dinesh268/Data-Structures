package com.stack;

//import com.sun.beans.introspect.PropertyInfo.Name;

public class Student {
private String name;
private int  id;

public Student(String name,int id) {
	// TODO Auto-generated constructor stub
this.name=name;
this.id=id;
}

@Override
public String toString() {
	return "Student [name=" + name + ", id=" + id + "]";
}

}
