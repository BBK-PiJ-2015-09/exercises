// A 2D Matrix //////
public class Matrix {
	
	// Fields ///////////
	private int[][] matrix;
	private int rows;
	private int columns;
	
	// Constructor //////
	public Matrix(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		matrix = new int[rows][columns];
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				matrix[i][j] = 1;
			}
		}
	}

	// Getters //////////
	public int[][] getMatrix() {
		return matrix;
	}
	
	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	// Setters //////////
	public void setElement(int row, int column, int value) {
		if (validReference(row, column)) {
			matrix[row][column] = value;
			prettyPrintSleepFlush();
		}
	}

	public void setRow(int row, String values) {
		String[] strArray = commaSplit(values);
		int[] intArray = toInt(strArray);
		if (valid(row, rows) && intArray.length == columns) {
			for(int i = 0; i < intArray.length; i++) {
				setElement(row, i, intArray[i]);
			}
		} else {
			printOutOfBounds();
		}
	}
	
	public void setColumn(int column, String values) {
		String[] strArray = commaSplit(values);
		int[] intArray = toInt(strArray);
		if (valid(column, columns) && intArray.length == columns) {
			for(int i = 0; i < intArray.length; i++) {
				setElement(i, column, intArray[i]);
			}
		} else {
			printOutOfBounds();
		}
	}

	public void fillMatrix(int value) {
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				setElement(i, j, value);
			}
		}
	}

	public void setMatrix(String values) {
		String [] rowsArray = semicolonSplit(values);				
		for(int i = 0; i < rowsArray.length; i++) {
			setRow(i, rowsArray[i]);
		}
	}

	// Validators ///////
	private boolean validReference(int row, int column) {
		if (valid(row, rows) && valid(column, columns)) {
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

	// Type conversion //
	private String[] commaSplit(String values) {
		return values.split(",");
	}

	private String[] semicolonSplit(String values) {
		return values.split(";");
	}

	private int[] toInt(String[] strArray) {
		int[] intArray = new int[strArray.length];
		for(int i = 0; i < strArray.length; i++) {
			intArray[i] = Integer.parseInt(strArray[i]);
		}
		return intArray;
	}

	public String toString() {
		String str = "[";
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				str += matrix[i][j];
			}
			str += ";";
		}
		return str + "]";
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

	private void prettyPrint() {
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println("\n\n");
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