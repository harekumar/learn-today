package learn_today.learn_today.ds.linkedList;

public class SingleLinkedList extends AbstractLinkedListProperties {
	Node head;

	public static void main(String args[]) {

		SingleLinkedList sl = new SingleLinkedList();
		sl.createList("front");
		sl.print();
	}

	private void createList(String cond) {

		switch (cond.toLowerCase()) {
		case "front":
			insertAtFront(1);
			insertAtFront(10);
			insertAtFront(11);
			insertAtFront(13);
			insertAtFront(15);
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

	/**
	 * Method to print the data of the linkedList. It should iterate till the node
	 * is not null & print the content of that node.
	 * 
	 * Time Complexity: O(n)
	 */
	@Override
	public void print() {
		Node n = head;
		while (n != null) {
			System.out.println(n.getData());
			n = n.getNext();
		}
	}

	/**
	 * 
	 * @param d
	 * @return true or false
	 * 
	 *         Time complexity: O(n)
	 */
	@Override
	public boolean insertAtBack(int d) {
		Node n = new Node(d);

		/*
		 * If the head is empty then create the very first node & terminate
		 */
		if (head == null) {
			head = n;
			return true;
		}

		/*
		 * Iterate till the end & insert a new node at the position
		 */
		Node node = head;
		while (node != null) {
			if (node.getNext() == null) {
				node.setNext(n);
				break;
			}
			node = node.getNext();
		}
		return true;
	}

	/**
	 * 
	 * @param d
	 * @return true or false
	 * 
	 *         * Time Complexity: O(1)
	 */
	@Override
	public boolean insertAtFront(int d) {
		Node n = new Node(d);
		if (head == null) {
			head = n;
		} else {
			n.setNext(head);
			head = n;
		}
		return true;
	}

	/***
	 * @param d
	 * @return true or false
	 * 
	 * It should insert new node at the given position in linked list.
	 * Time Complexity: O(n)
	 */
	@Override
	public boolean insertAtPos(int d, int pos) {
		Node n = new Node(d);
		return false;
	}

	@Override
	public boolean delete(Node n) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAtPos(int pos) {
		// TODO Auto-generated method stub
		return false;
	}
}
