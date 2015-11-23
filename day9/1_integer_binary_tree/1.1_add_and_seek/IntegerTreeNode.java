public class IntegerTreeNode {
	private int value;
	private IntegerTreeNode left;
	private IntegerTreeNode right;

	public IntegerTreeNode(int newNumber) {
		value = newNumber;
		left = null;
		right = null;
	}
	
	public int getValue() {
		return value;
	}

	public IntegerTreeNode getRight() {
		return right;
	}

	public void add(int newNumber) {
		if (newNumber > this.value) {
			if (right == null) {
				right = new IntegerTreeNode(newNumber);
			} else {
				right.add(newNumber);
			}
		} else {
			if (left == null) {
				left = new IntegerTreeNode(newNumber);
			} else {
				left.add(newNumber);
			}
		}
	}
	
	public boolean contains(int n) {
		if (n == this.value) {
			return true;
		} else if (n > this.value) {
			if (right == null){
				return false;
			} else {
				return right.contains(n);
			} 
		} else {
			if (left == null) {
				return false;
			} else {
				return left.contains(n);
			}
		}
	}
	
	public int getMax() {
		if (right == null) {
			return value;
		} else {
			return right.getMax();
		}
	}
	
	public int getMin() {
		if (left == null) {
			return value;
		} else {
			return left.getMin();
		}
	}

	public void toStringLol() {
		System.out.print("[");
		System.out.print(value);
		if (left != null) {
			System.out.print(" L");
			left.toStringLol();
		} else {
			System.out.print(" L[]");
		}

		if (right != null) {
			System.out.print(" R");
			right.toStringLol();
		} else {
			System.out.print(" R[]");
		}
		System.out.print("]");
	}
	
	public int depth() {
		if (left == null) {
			if (right == null) {
				return 0;
			} else {
				return right.depth() + 1;
			}
		} else if (right == null || left.depth() >= right.depth()) {
			return left.depth() + 1;
		} else {
			return right.depth() + 1;
		}
	}

}