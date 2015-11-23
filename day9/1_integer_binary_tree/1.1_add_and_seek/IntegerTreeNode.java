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

	public String print() {
		String string = "";
		string += "[" + value + " ";
		if (left == null) {
			string += "L: [] ";
		} else {
			string += "L: [" + left.getValue() + "] ";
		}
		if (right == null) {
			string += "R: [] ";
		} else {
			string += "R: [" + right.getValue() + "] ";
		}
		string += "]";
		return string;
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

}