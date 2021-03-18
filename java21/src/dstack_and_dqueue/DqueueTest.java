package dstack_and_dqueue;

public class DqueueTest {
	public static void main(String a[]){
        Dqueue queue = new Dqueue();
        queue.enqueue(4);
        queue.dequeue();
        queue.enqueue(56);
        queue.enqueue(2);
        queue.enqueue(67);
        queue.dequeue();
        queue.enqueue(24);
        queue.enqueue(98);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(435);
        queue.dequeue();
        queue.dequeue();
        System.out.println("***************************");
        System.out.println("*    thank you!!!!        *");
        System.out.println("***************************");
    }

}
