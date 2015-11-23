public class IntegerTreeNode {
	int value;
	IntegerTreeNode left;
	IntegerTreeNode right;

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

	public void print() {
		System.out.println("--------------");
		System.out.println("Value: " + value);
		if (left == null) {
			System.out.println("Left: null");
		} else {
			System.out.println("Left: " + left.getValue());
		}
		if (right == null) {
			System.out.println("Right: null");
		} else {
			System.out.println("Right: " + right.getValue());
		}
	}

}