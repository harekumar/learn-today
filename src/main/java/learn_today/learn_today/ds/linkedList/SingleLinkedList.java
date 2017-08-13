package learn_today.learn_today.ds.linkedList;

public class SingleLinkedList {
	Node head;
	
	public static void main(String args[]) {
		
		SingleLinkedList sl = new SingleLinkedList();
		sl.createList("front");
		sl.printList();
	}
	
	private void createList(String cond) {
		
		switch(cond.toLowerCase()) {
			case "front":
				insertAtBeginnning(1);
				insertAtBeginnning(10);
				insertAtBeginnning(11);
				insertAtBeginnning(13);
				insertAtBeginnning(15);
				break;
			case "back":
				insertAtBack(1);
				insertAtBack(14);
				insertAtBack(12);
				insertAtBack(11);
				insertAtBack(10);
				insertAtBack(1);
				break;
			default:
				break;
		}

	}
	
	private void insertAtBack(int d) {
		Node n = new Node(d);
		if(head == null) {
			head = n;
			return;
		}
		
		Node node = head;
		while(node != null) {
			if(node.getNext() == null)  {
				node.setNext(n);
				break;
			}
			node = node.getNext();
		}
	}
	
	private void insertAtBeginnning(int d) {
		Node n = new Node(d);
		if(head == null) {
			head = n;
			return;
		} else {
			n.setNext(head);
			head = n;
		}
		
	}
	
	private void printList() {
		Node n = head;
		while (n != null) {
			System.out.println(n.getData());
			n = n.getNext();
		}
	}
}
