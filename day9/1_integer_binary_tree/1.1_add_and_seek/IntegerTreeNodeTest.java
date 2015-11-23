public class IntegerTreeNodeTest {
	
	public static void main(String[] args) {
		IntegerTreeNode treeRoot = new IntegerTreeNode(6);	
		// treeRoot.toStringLol();
		
		treeRoot.add(5);
		treeRoot.add(3);
		treeRoot.add(2);
		treeRoot.add(1);
		// treeRoot.toStringLol();
		// System.out.println("");
		System.out.println(treeRoot.depth());
		// System.out.println(treeRoot.toString());
		
		// System.out.println(treeRoot.contains(5));
		// System.out.println("Max val = " + treeRoot.getMax());
		// System.out.println("Min val = " + treeRoot.getMin());
	}
	
	
}