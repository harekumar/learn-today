package learn_today.learn_today.ds.tree;

import java.util.LinkedList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BinarySearchTree extends AbstractTreeProperties{
	private Node root;
	
	public BinarySearchTree(Integer d) {
		root = new Node();
		root.setData(d);
		root.setParent(null);
		root.setChildren(new LinkedList<Node>());
	}

	@Override
	public void insert(Integer data) {
		root = insert(data, root);
	}

	private Node insert(Integer d, Node node) {
		if(node == null) {
			node = new Node(d);
		} else {
			if(d <= node.getData()) {
				if(node.getChildren().get(0) != null) {
					insert(d, node.getChildren().get(0));
				} else {
					new Node(d);
				}
			} else {
				Node n = insert(d, node.getChildren().get(1));
			}
		}
		// TODO
		return node;
	}
	
	@Override
	public void traversePreOrder() {
		// TODO Auto-generated method stub
		
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
