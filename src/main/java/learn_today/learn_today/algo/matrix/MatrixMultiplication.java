package learn_today.learn_today.algo.matrix;

import java.util.Scanner;

/**
 * Matrix multiplication: 
 * @author fchk15052
 *
 */
public class MatrixMultiplication {

	
	public static void main(String args[]) {
		Scanner in1 = new Scanner(System.in);
		
		System.out.println("Enter the no of rows of matrix1");
		int m1Rows = in1.nextInt();
		int m1Cols = in1.nextInt();
		
		System.out.println("Enter the no of rows of matrix2");
		int m2Rows = in1.nextInt();
		int m2Cols = in1.nextInt();
		
		if(m1Rows != m2Cols) {
			System.out.println("M1 rows should must be equal to the M2 cols.");
		}
		
		
		
		MatrixMultiplication m = new MatrixMultiplication();
		int[][] matrix1 = m.getInput(m1Rows, m1Cols, in1);
		
		int[][] matrix2 = m.getInput(m2Rows, m2Cols, in1);
		
		in1.close();
		m.multiply(matrix1, matrix2);
		
	}
	
	private int[][] multiply(int[][] matrix1, int[][] matrix2) {
		
		System.out.println("Multiplying matrix");
		
		int noOfRows = matrix1.length;
		int noOfCols = matrix2[0].length;
		int common = matrix1[0].length;
		
		int[][] newMatrix = new int[noOfRows][noOfCols];
		
		for(int i=0; i<noOfRows; i++) {
			for(int j=0; j<noOfCols; j++) {
				int sum = 0;
				
				for(int k=0; k<common; k++) {
					sum += matrix1[i][k] * matrix2[k][j];
				}
				newMatrix[i][j] = sum;
			}
		}
		
		System.out.println("Result: ");
		printMatrix(newMatrix);
		return newMatrix;
	}
	
	private int[][] getInput(int noOfRows, int noOfCol, Scanner in) {
		
		int[][] matrix = new int[noOfRows][noOfCol];
		System.out.println("Kindly enter the elements of a Matrix:- NoOfRows " + noOfRows + " NoOfCols " + noOfCol );
		for(int i=0; i<noOfRows; i++) {
			for(int j=0; j<noOfCol; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
		printMatrix(matrix);
		
		return matrix;
	} 
	
	private void printMatrix(int[][] matrix) {
		
		int rowsSize = matrix.length;
		int colSize = matrix[0].length;
		
		System.out.println("You have entered: ");
		for(int i=0; i<rowsSize; i++) {
			for(int j=0; j<colSize; j++) {
				System.out.print(matrix[i][j] + "  ");
			}
			
			int x = 3 * 3;
			
			System.out.println("");
		}
	}
}
