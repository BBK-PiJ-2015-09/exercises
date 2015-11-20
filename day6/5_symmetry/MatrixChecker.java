public class MatrixChecker {
	
	public boolean isSymmetrical(int[] array) {
		boolean symmetrical = true;
		int i = 0;
		while (symmetrical && i < array.length/2) {
			if (array[i] == array[array.length-i-1]) {
				i++;
			} else {
				symmetrical = false;
			}
		}
		return symmetrical;
	}

	public boolean isSymmetrical(Matrix matrix) {
		boolean symmetrical = true;
		if (matrix.getRows() != matrix.getColumns()) {
			symmetrical = false;
		} else {
			int[][] array = matrix.getMatrix();
			for(int i = 0; i < array.length; i++) {
				for(int j = 0; j < array[i].length; j++) {
					if(array[i][j] != array[j][i]) {
						symmetrical = false;
					}
				}
			}
		}
		return symmetrical;
	}
	
	public boolean isTriangular(Matrix matrix) {
		boolean triangular = true;
		int[][] array = matrix.getMatrix();
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				if(i > j && array[i][j] != 0) {
					triangular = false;
				}
			}
		}
		return triangular;
	}

}