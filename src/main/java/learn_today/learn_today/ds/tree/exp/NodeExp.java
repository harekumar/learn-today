package learn_today.learn_today.ds.tree.exp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class NodeExp {
	
	int data;
	NodeExp left;
	NodeExp right;
	
	public NodeExp(int d) {
		this.data = d;
		this.left = this.right = null;
	}
}
