public class Target {
	private Matrix matrix;
	private int size;
	private int targetRow;
	private int targetColumn;
	private int targetDepth;
	
	public Target(int size) {
		this.size = size;
		matrix = new Matrix(size, size, size);
	}
	
	public void init() {
		matrix.fillMatrix(0);
		int rand1 = (int) Math.abs(size * Math.random());
		int rand2 = (int) Math.abs(size * Math.random());
		int rand3 = (int) Math.abs(size * Math.random());
		matrix.setElement(rand1, rand2, rand3, 1);
		targetRow = rand1;
		targetColumn = rand2;
		targetDepth = rand3;
	}
	
	public Matrix getMatrix() {
		return matrix;
	}
	
	public Result fire(int guessRow, int guessColumn, int guessDepth) {
		if (guessRow >= size || guessRow < 0 || guessColumn >= size || guessColumn < 0 || guessDepth >= size || guessDepth < 0 ) {
			return Result.OUT_OF_RANGE;
		} else if (guessRow < targetRow) {
			return Result.FAIL_LEFT;
		} else if (guessRow > targetRow) {
			return Result.FAIL_RIGHT;
		} else if (guessColumn > targetColumn) {
			return Result.FAIL_HIGH;
		} else if (guessColumn < targetColumn) {
			return Result.FAIL_LOW;
		} else if (guessDepth < targetDepth) {
			return Result.FAIL_SHORT;
		} else if (guessDepth > targetDepth) {
			return Result.FAIL_LONG;
		} else {
			return Result.HIT;
		}
	}
	
	public void play() {
		System.out.println("Here they come! Try to bring the plane down!");
		Result result = Result.OUT_OF_RANGE;
		Boolean again = true;
		String str = "";
		while(again == true) {
			System.out.print("Enter a row coordinate: ");
			str = System.console().readLine();
			int row = Integer.parseInt(str);
			System.out.print("Enter a column coordinate: ");
			str = System.console().readLine();
			int column = Integer.parseInt(str);
			System.out.print("Enter a depth coordinate: ");
			str = System.console().readLine();
			int depth = Integer.parseInt(str);
			result = fire(row, column, depth);

			if (result == Result.OUT_OF_RANGE) {
				System.out.println("That shot is way out of range. Try harder!");
			} else if (result == Result.FAIL_LEFT) {
				System.out.println("You missed! The target is to the right!");
			} else if (result == Result.FAIL_RIGHT) {
				System.out.println("You missed! The target is to the left!");
			} else if (result == Result.FAIL_HIGH) {
				System.out.println("You missed! The target is lower!");
			} else if (result == Result.FAIL_LOW) {
				System.out.println("You missed! The target is higher!");
			} else if (result == Result.FAIL_SHORT) {
				System.out.println("You missed! The target is further!");
			} else if (result == Result.FAIL_LONG) {
				System.out.println("You missed! The target is nearer!");
			} else if (result == Result.HIT) {
				System.out.println("You hit it! Well done!");
				System.out.print("Would you like to play again? (y/n) ");
				str = System.console().readLine();
				if (str.equals("y")) {
					again = true;
				} else {
					again = false;
				}
			}
		}
	}
}