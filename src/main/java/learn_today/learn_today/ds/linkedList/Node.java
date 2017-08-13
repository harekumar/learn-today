package learn_today.learn_today.ds.linkedList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Node {
	
	private int data;
	private Node next;
	private Node prev;
	
	public Node(int d) {
		this.data = d;
		this.next = null;
		this.prev = null;
	}
	
}
