package learn_today.learn_today.ds.tree;

public class TestTree {

	public static void main(String[] args) {
		
		/*
		 * 									12
		 * 
		 * 					10								50
		 * 
		 		9						100			1					13
		 		
		 	0		10000			109		110
		 		
		 */
		
		
		BinarySearchTree bt = new BinarySearchTree(12);
		bt.insert(10);
		bt.insert(50);
		bt.insert(9);
		bt.insert(100);
		bt.insert(1);
		bt.insert(13);
		
		bt.insert(90);
		bt.insert(10000);
		bt.insert(109);
		bt.insert(110);
		
		bt.insert(1110);
		bt.insert(1000);
		bt.insert(1090);
		bt.insert(1010);
		
		System.out.println(bt.toString());
	}
}
