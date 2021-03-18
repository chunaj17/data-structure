package dstack_and_dqueue;

public class Dqueue {
	private int capacity = 2;
    int queueArr[];
    int head = 0;
    int tail = -1;
    int Size = 0;
    public Dqueue(){
        queueArr = new int[this.capacity];
    }
    public void enqueue(int item) {
         
        if (isQueueFull()) {
            System.out.println("Queue is full, increase capacity...");
            increaseCapacity();
        }
        tail++;
        if(tail >= queueArr.length && Size != queueArr.length){
            tail = 0;
        }
        queueArr[tail] = item;
        Size++;
        System.out.println("Adding: " + item);
    }
    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Underflow ! Unable to remove element from Queue");
        } else {
            head++;
            if(head > queueArr.length-1){
                System.out.println("removed: "+queueArr[head-1]);
                head = 0;
            } else {
                System.out.println("removed: "+queueArr[head-1]);
            }
            Size--;
        }
    }
    public boolean isQueueFull(){
        boolean status = false;
        if (Size == queueArr.length){
            status = true;
        }
        return status;
    }
    public boolean isQueueEmpty(){
        boolean status = false;
        if (Size == 0){
            status = true;
        }
        return status;
    }
     
    private void increaseCapacity(){
        //create new array with double size as the current one.
        int newCapacity = this.queueArr.length*2;
        int[] newArr = new int[newCapacity];
        //copy elements to new array, copy from rear to front
        int tmpFront = head;
        int index = -1;
        while(true){
            newArr[++index] = this.queueArr[tmpFront];
            tmpFront++;
            if(tmpFront == this.queueArr.length){
                tmpFront = 0;
            }
            if(Size == index+1){
                break;
            }
        }
        //make new array as queue
        this.queueArr = newArr;
        System.out.println("New array capacity: "+this.queueArr.length);
        //reset head & tail values
        this.head = 0;
        this.tail = index;
    }
}
