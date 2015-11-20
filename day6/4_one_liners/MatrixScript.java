public class MatrixScript {

	public static void main(String[] args) {
		Matrix myMatrix = new Matrix(4,4);
		myMatrix.fillMatrix(3);
		myMatrix.setRow(3, "95,96,97,8");
		myMatrix.setColumn(2, "5,6,7,8");
		myMatrix.setMatrix("1,2,3,4;5,6,7,8;9,10,11,12;13,14,15,16");
		System.out.println(myMatrix.toString());
	}

}