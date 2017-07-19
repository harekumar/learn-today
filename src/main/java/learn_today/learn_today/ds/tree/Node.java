package learn_today.learn_today.ds.tree;

import java.util.LinkedList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Node {
	
	private Integer data;
	private Node parent;
	private List<Node> children;
	
	public Node(Integer d) {
		this.data = d;
		this.parent = null;
		this.children = new LinkedList<Node>();
	}
}
