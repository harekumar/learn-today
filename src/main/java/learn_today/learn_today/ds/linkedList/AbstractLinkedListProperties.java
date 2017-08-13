package learn_today.learn_today.ds.linkedList;

public abstract class AbstractLinkedListProperties {
	
	public abstract void print();
	public abstract boolean insertAtBack(int d);
	public abstract boolean insertAtFront(int d);
	public abstract boolean insertAtPos(int d, int pos);
	public abstract boolean delete(Node n);
	public abstract boolean deleteAtPos(int pos);
}
