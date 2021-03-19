package assignment;

public class Doubly_impTest {
public static void main(String []arg){
Doubly_imp done = new Doubly_imp ();
done.addToHead(1);
done.addToHead(2);
done.addToHead(3);
done.addToTail(5);
done.addToTail(7);
done.InsertAfter(2, 8);
done.removeHead();
done.removeTail();

done.DeleteAfter(8);
done.DisplayList();

done.forwardTraverse();
done.backwardTraverse();
done.findNode(5);
done.findNode(10);
done.findNode(15);
done.findNode(8);
done.findNode(2);
//done.emptylist();
System.out.println("***************************");
System.out.println("*    thank you sir!!!!    *");
System.out.println("***************************");
}
}
