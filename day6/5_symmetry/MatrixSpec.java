public class MatrixSpec {

	public static void main(String[] args) {		
		MatrixChecker checker = new MatrixChecker();

		int[] array = {1,3,3,3,3,3};
		System.out.println(checker.isSymmetrical(array));

		Matrix myMatrix = new Matrix(4,4);
		myMatrix.setMatrix("1,2,3,4;2,6,7,8;3,7,11,12;4,8,12,16");
		System.out.println(checker.isSymmetrical(myMatrix));
		
		myMatrix = new Matrix(5,4);
		myMatrix.setMatrix("1,1,1,1;0,1,1,1;0,0,1,1;0,2,0,1;0,0,0,0");
		System.out.println(checker.isTriangular(myMatrix));

	}

}