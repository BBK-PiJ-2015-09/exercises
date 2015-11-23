public class IntegerTreeNodeTest {
	
	public static void main(String[] args) {
		IntegerTreeNode treeRoot = new IntegerTreeNode(2);
		treeRoot.add(3);
		treeRoot.add(4);
		treeRoot.add(-10);
		treeRoot.add(0);
		treeRoot.add(1000000);
		
		treeRoot.contains(2);
		
		treeRoot.print();
		treeRoot.getRight().print();
		treeRoot.getRight().getRight().print();
		// tree.add(5);
		
		System.out.println(treeRoot.contains(5));
		
		System.out.println("Max val = " + treeRoot.getMax());
		
		System.out.println("Min val = " + treeRoot.getMin());
	}
	
	
}