public class IntegerTreeNodeTest {
	
	public static void main(String[] args) {
		IntegerTreeNode treeRoot = new IntegerTreeNode(2);
		treeRoot.add(3);
		treeRoot.add(4);
		
		treeRoot.contains(2);
		
		treeRoot.print();
		treeRoot.getRight().print();
		treeRoot.getRight().getRight().print();
		// tree.add(5);
		
		System.out.println(treeRoot.contains(5));
	}
	
	
}