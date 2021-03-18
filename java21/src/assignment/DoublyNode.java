package assignment;

public class DoublyNode {
		int data;
		DoublyNode prev;
		DoublyNode next;
		public DoublyNode(int data,DoublyNode next){
			this.data=data;
			this.prev=null;
			this.next=null;
		}
		public DoublyNode(int data){
		 this.data=data;
		}
}

