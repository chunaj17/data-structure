package dstack_and_dqueue;

public class DstackTest {
  public static void main(String args[]) {
	  Dstack myStack = new Dstack(2); 
	  myStack.push(5);
	  myStack.push(8);
	  myStack.push(2);
	  myStack.push(9);
	  System.out.println(myStack.isEmpty()); // will print false
	  System.out.println(myStack.isFull()); // will print true
	  System.out.println(myStack.peek()); // will print 9
	  System.out.println(myStack.pop()); // will print 9
	  System.out.println(myStack.peek()); // will print 2
	  System.out.println("***************************");
	  System.out.println("*    thank you!!!!        *");
	  System.out.println("***************************");
}
}
