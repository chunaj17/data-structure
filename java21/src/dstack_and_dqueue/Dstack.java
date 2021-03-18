package dstack_and_dqueue;

public class Dstack {
	    private int maxSize;
	    private int[] stackArray;
	    private int top;
public Dstack(int size) {
	maxSize = size;
  stackArray = new int[maxSize];
     top = -1;
}
public void push(int value) {
    if (!isFull()) { // Checks for a full stack
        top++;
        stackArray[top] = value;
    } else {
        resize(maxSize * 2);
        push(value);
    }
}
public int pop() {
     if (!isEmpty()) { // Checks for an empty stack
          return stackArray[top--];
     }
    if (top < maxSize / 4) {
         resize(maxSize / 2);
         return pop();
    } else {
         System.out.println("The stack is already empty");
         return -1;
    }
}
public int peek() {
    if (!isEmpty()) { // Checks for an empty stack
         return stackArray[top]; 
    } else {
        System.out.println("The stack is empty, cant peek");
        return -1;
    }
}
private void resize(int newSize) {
     int[] transferArray = new int[newSize];

     for (int i = 0; i < stackArray.length; i++) {
         transferArray[i] = stackArray[i];
         stackArray = transferArray;
     }
     maxSize = newSize;
}
 public boolean isEmpty() {
     return (top == -1);
 }
 public boolean isFull() {
    return (top + 1 == maxSize);
 }
}

