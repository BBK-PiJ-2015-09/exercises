class Hailstone {
	int[] result = new int[10];
	int resultLength = 10;
	int count = 0;

	public int[] get(int n) {
		stones(n);
		result = clean(result);
		return result;
	}

	private int stones(int n) {
		sizeCheck();
		result[count] = n;
		count++;
		if (n == 1) {
			return n;
		} else if (n % 2 == 0) {
			return stones(n / 2);
		} else {
			return stones((3 * n) + 1);
		}
	}

	private void sizeCheck() {
		if (resultLength == count + 1) {
			result = embiggen(result);
			resultLength *= 2;
		}
	}

	private int[] embiggen(int[] oldArray) {
		int[] newArray = new int[resultLength * 2];
		return copy(oldArray, newArray, resultLength);
	}

	private int[] clean(int[] oldArray) {
		int[] newArray = new int[count];
		return copy(oldArray, newArray, count);
	}

	private int[] copy(int[] oldArray, int[] newArray, int size) {
		for(int i = 0; i < size; i++) {
			newArray[i] = oldArray[i];
		}
		return newArray;
	}

}
