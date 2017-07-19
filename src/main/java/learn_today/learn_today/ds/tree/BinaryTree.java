package learn_today.learn_today.ds.tree;

import java.util.LinkedList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class BinaryTree extends AbstractTreeProperties{

	private Node root;
	
	public BinaryTree(int d) {
		root = new Node();
		root.setData(d);
		root.setChildren(new LinkedList<Node>());
	}

	@Override
	public void insert(Integer d) {
		insert(d, root);
	}
	
	
	public Node insert(Integer d, Node node) {
	
		if(node.getChildren().size() <= 1) {
			Node n = new Node();
			n.setData(d);
			n.setChildren(new LinkedList<Node>());
			
			List<Node> ln = node.getChildren();
			ln.add(n);
			
			System.out.println("Adding " + d + " to the parent node " + node.getData());
			node.setChildren(ln);
		} else {
			insert(d, node.getChildren().get(0));
		}
		return node;
	}

	@Override
	public void traversePreOrder() {
		
	}

	@Override
	public void traversePostOrder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void traverseInOrder() {
		// TODO Auto-generated method stub
		
	}
}
