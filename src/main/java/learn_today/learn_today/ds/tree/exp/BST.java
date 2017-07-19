package learn_today.learn_today.ds.tree.exp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BST {
	
	private NodeExp root;
	
	public BST(int d) {
		root = new NodeExp(d);
	}
	
	public void insert(int d) {
		insert(root, d);
	}
	
	private NodeExp insert(NodeExp node, int d) {
		
		if(node == null) {
			node = new NodeExp(d);
			return node;
		} else {
			if(d < node.data) {
				node.left = insert(node.left, d);
			} else {
				node.right = insert(node.right, d);
			}
		}
		return node;

	}
	
	public static void main(String args[]) {
		BST t = new BST(10);
		t.insert(11);
		t.insert(4);
		t.insert(40);
		t.insert(50);
		t.insert(5);
		
		System.out.println(t.toString());
	}
}
