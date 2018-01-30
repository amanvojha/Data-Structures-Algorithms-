
public class LinkedListMain {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		ll.addFirst(1);
		ll.addFirst(4);
		ll.addFirst(6);
		ll.addFirst(9);
		
		ll.addLast(22);
		ll.addLast(11);
		
		ll.deleteByKey(22);
		
		ll.print();
		
	}
}
