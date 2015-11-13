public class Matrix {

	private int[][] matrix;
	
	public Matrix(int width, int height) {
		matrix = new int[width][height];
		for(int i = 0; i < width; i++) {
			for(int j = 0; j < height; j++) {
				matrix[i][j] = 1;
			}
		}
	}

	public void setElement(int width, int height, int value) {
		if (width > 0 && height > 0 && width <= matrix.length && height <= matrix[0].length) {
			matrix[width][height] = value;
		} else {
			System.out.println("The coordinates must be within the matrix!");
		}
	}

}