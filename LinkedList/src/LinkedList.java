
public class LinkedList {
	
	Node head;
	
	class Node 
	{
		private int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			next = null;
		}
		
	}
	
	public void addFirst(int data)
	{
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}
	
	public void addLast(int data)
	{
		Node new_node = new Node(data);
		new_node.next = null;
		
		Node last = head;
		
		while(last.next!=null)
		{
			last = last.next;
		}
		
		last.next = new_node;
		return;
	}
	
	public void insertBetween(Node prev , int data)
	{
		Node new_node = new Node(data);
		
		new_node.next = prev.next;
		prev.next = new_node;
		
		return;
		
	}
	
	public void deleteByKey(int key)
	{
		Node temp = head;
		Node prev = null;
		
		while(temp.data!=key)
		{
			prev = temp;
			temp = temp.next;
		}
		
		prev.next = temp.next;
		return;
	}
	
	public void print()
	{
		Node pr = head;
		while(pr != null)
		{
			System.out.print(pr.data + " ");
			pr = pr.next;
		}
	}
}
