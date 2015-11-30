// With Ginestra - #24
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

	public IntegerTreeNode getLeft() {
		return left;
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

	public void rebalance() {
		int root = value;
		if (rightDepth() > leftDepth()) {
			value = right.getMin();
			right.remove(value);
			add(root);
			rebalance();
		} else if (leftDepth() > rightDepth()) {
			value = left.getMax();
			left.remove(value);
			add(root);
			rebalance();
		}
	}

	private int leftDepth() {
		if (left == null) {
			return 0;
		} else {
			return left.depth();
		}
	}

	private int rightDepth() {
		if (right == null) {
			return 0;
		} else {
			return right.depth();
		}
	}

	public void remove(int n) {
		if (this.value == n) {
			if (left == null && right == null) {
				this.value = 0;
			} else if (left == null) {
				this.value = right.getMin();
				if (right.singleValueTree()) {
					right = null;
				} else {
					right.remove(right.getMin());
				}
			} else {
				this.value = left.getMax();
				if (left.singleValueTree()) {
					left = null;
				} else {
					left.remove(left.getMax());
				}
			}
		} else {
			if (left != null) {
				if (left.getValue() == n && left.singleValueTree()) {
					left = null;
				} else {
					left.remove(n);
				}
			} 
			if (right != null) {
				if (right.getValue() == n && right.singleValueTree()) {
					right = null;
				} else {
					right.remove(n);
				}
			}
		}
	}

	public boolean singleValueTree() {
		if (getMin() == getMax()) {
			return true;
		} else {
			return false;
		}
	}

	public void print() {
		System.out.println("-----");
		System.out.println("Value: " + value);
		if ( left != null) {
			System.out.println("Left: " + left.getValue());
		} else {
			System.out.println("Left: null");
		}
		if (right != null) {
			System.out.println("Right: " + right.getValue());
		} else {
			System.out.println("Right: null");
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

	public String toString() {
		if ( right == null && left == null) {
			return "[" + value + " L[] R[]]";
		} else if ( right == null ) {
			return "[" + value + " L" + left.toString() + " R[]]";
		} else if ( left == null) {
			return "[" + value + " L[] R" + right.toString() + "]";
		} else {
			return "[" + value + " L" + left.toString() + " R" + right.toString() + "]";
		}
	}

	public String toStringSimple() {
		if ( right == null && left == null) {
			return "[" + value + "]";
		} else if ( right == null ) {
			return "[" + value + " " + left.toStringSimple() + "]";
		} else if ( left == null) {
			return "[" + value + " " + right.toStringSimple() + "]";
		} else {
			return "[" + value + " " + left.toStringSimple() + " " + right.toStringSimple() + "]";
		}
	}

	// Sergio's method
	public int getDepth() {
		int leftDepth = 0;
		if (left != null) {
			leftDepth = left.getDepth();
		}
		int rightDepth = 0;
		if (right != null) {
			rightDepth = right.getDepth();
		}
		if (leftDepth > rightDepth) {
			return 1 + leftDepth;
		} else {
			return 1 + rightDepth;
		}
	}

	public int depth() {
		if (left == null) {
			if (right == null) {
				return 1;
			} else {
				return right.depth() + 1;
			}
		} else if (right == null) {
			return left.depth() + 1;
		} else if (left.depth() > right.depth()) {
			return left.depth() + 1;
		} else {
			return right.depth() + 1;
		}
	}

}