public class MatrixScript {

	public static void main(String[] args) {
		Matrix myMatrix = new Matrix(10,10);
		myMatrix.fillMatrix(3);
		myMatrix.setRow(7, "95,96,97,8,8,8,8,8,8,8");
		myMatrix.setColumn(2, "5,6,7,8,8,8,8,8,8,8");
		System.out.println(myMatrix.toString());
		
	}

}