package assignment;
public class Doubly_imp {
	 DoublyNode head, tail;
	  int size = 0;
public Doubly_imp() {
	    head =  null;
	    
	  }
public boolean findNode(int data){
	DoublyNode fNode = head;
	if(fNode == null){
		return false;
	}else{
	for(;fNode !=null ;fNode = fNode.next){
		if(fNode.data == data){
			System.out.println(data+" found");
			return true;
		}
	}
	}
	System.out.println(data+" not found ");
return false;
}
public boolean checkifEmpty() {
	if(head == null){
		System.out.println(" list is empty");
		return true;
	}else{
		System.out.println("not empty");
	    return false;
	  }}
public void addToHead(int data) {
		 DoublyNode newHead = new DoublyNode(data);  
		  if (head == null) {
		      head = newHead;
		    } else {
		      newHead.next = head;
		      head.prev = newHead;
		      head = newHead;
		    }
		  System.out.println("added = "+newHead.data);
		  }
public void addToTail(int data) {
	DoublyNode newTail = new DoublyNode(data);
	if (head == null) {
		head = newTail; 
		newTail.next = null;
		System.out.println("added tail= "+newTail.data);
		} else {
			DoublyNode tail = head;
			while (tail.next != null) {
				tail = tail.next;}
			  tail.next = newTail;
			  newTail.next = null;
			  System.out.println("added tail= "+newTail.data);
			}
	}
public DoublyNode InsertAfter (int insertafter,int el){
	DoublyNode n = new DoublyNode(el);
	DoublyNode tmp = this.head;
	for(;tmp != null;tmp = tmp.next ){
		if(tmp.data == insertafter){
			
  	if(tmp.next != null){
  		tmp.next.prev = n;
  		n.next=tmp.next;
  		}
  	tmp.next = n;
  	n.prev = tmp;
  	break;
  	}
		System.out.println("inserted after node= " +insertafter+" "+ "node wiz data = " +n.data );
		}
	return null;
	}

public void removeHead() {
	if (head == null) return; else {
		System.out.println("removed head = "+head.data);
		head = head.next; 
		head.prev = null; 
		}
	}
public void removeTail() {
	if (head == null) return; else {
		DoublyNode node = head;
		while (node.next.next != null) {
			node = node.next;
			}
		System.out.println("removed = "+node.next.data);
		node.next = null; 
		}
  }
public DoublyNode DeleteAfter(int el){
	DoublyNode D = this.head;
	for(; D != null;D = D.next){
		if (D.data == el){ 
			D = D.next;	
			break;
			}
		}
	if(D != null){
		if(D.next != null){
			D.next.prev = D.prev;
			D.prev.next =D.next;	
			}else {
				D.prev.next = null;
				}
		System.out.println("deleted node wiz data = "+ D.data + " after node wiz data =  "+el);
		}
	return null;
	}
public void DisplayList() {
	DoublyNode node = head; 
	for (;node != null;node = node.next) {
		System.out.println(node.data + " "); 
		}
}
public void emptylist(){
	System.out.println("after emptylist()  list will be empty......the list elements are set to null");
	this.head = null;
	this.tail = null;
	DisplayList();
}
public void forwardTraverse(){
	DoublyNode node = this.head;
	System.out.println("forward traversing:");
	while (node != null){
		System.out.print(node.data+" | ");
	    node = node.next;
	}
System.out.println();
}
public void backwardTraverse(){
	DoublyNode node = head;
	System.out.println("backward traversing:");
	while (node != null && node.next!= null){
	node = node.next;
	}
	tail = node;
   while(tail != null){
	  System.out.print(tail.data+" | ");
	  tail = tail.prev;
   }
   System.out.println();
}

}


