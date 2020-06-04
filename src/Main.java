//import com.sun.tools.classfile.StackMap_attribute.stack_map_frame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
IntStack intStack=new IntStack();
if(!intStack.isFull()) {
	intStack.push(1);
	intStack.push(2);
	intStack.push(3);
	intStack.push(4);
}

	
if(!intStack.isempty())
{
System.out.println(intStack.pop());
}
else {
	System.out.println("empty");
}

}
}

