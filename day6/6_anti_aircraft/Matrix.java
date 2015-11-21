// A 2D Matrix //////
public class Matrix {
	
	// Fields ///////////
	private int[][][] matrix;
	private int rows;
	private int columns;
	private int depths;
	
	// Constructor //////
	public Matrix(int rows, int columns, int depths) {
		this.rows = rows;
		this.columns = columns;
		this.depths = depths;
		matrix = new int[rows][columns][depths];
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				for(int k = 0; k < depths; k++) {
					matrix[i][j][k] = 0;
				}
			}
		}
	}

	// Getters //////////
	public int[][][] getMatrix() {
		return matrix;
	}

	// Setters //////////
	public void setElement(int row, int column, int depth, int value) {
		if (validReference(row, column, depth)) {
			matrix[row][column][depth] = value;
		}
	}

	public void fillMatrix(int value) {
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				for(int k = 0; k < depths; k++) {
					setElement(i, j, k, value);
				}
			}
		}
	}

	// Validators ///////
	private boolean validReference(int row, int column, int depth) {
		if (valid(row, rows) && valid(column, columns) && valid(depth, depths)) {
			return true;
		} else {
			return false;
		}
	}

	private boolean valid(int item, int set) {
		if (item < set && item >= 0) {
			return true;
		} else {
			printOutOfBounds();
			return false;
		}
	}

	// Alerts ///////////
	private void printOutOfBounds() {
		System.out.println("The coordinates must be within the matrix!");
	}

	// Printing /////////
	private void prettyPrintSleepFlush() {
		prettyPrint();
		sleep();
		flush();
	}

	public void prettyPrint() {
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				for(int k = 0; k < depths; k++) {
					System.out.print(matrix[i][j][k]);
				}
			}
			System.out.println("");
		}
	}

	private void sleep() {
		try {
		  Thread.sleep(200);
		} catch (InterruptedException ie) {
		    // Handle any exceptions
		}
	}

	public void flush() {
		try {
			Runtime.getRuntime().exec("clear");
		} catch (final Exception e) {
			// Handle any exceptions
		}

		final String ANSI_CLS = "\u001b[2J";
        final String ANSI_HOME = "\u001b[H";
        System.out.print(ANSI_CLS + ANSI_HOME);
        System.out.flush();
	}

}
