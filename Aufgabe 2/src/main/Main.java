package main;

import matrix.MatrixTools;

public class Main {

	public static void main(String[] args) {

		System.out.println("Matrix erstellt:");
		int[][] arr = MatrixTools.createMatrix(3, 4);
		MatrixTools.printMatrix(arr);
		System.out.println("-------- \n Matrix Transponiert");
		arr = MatrixTools.getTransposedMatrix(arr);
		MatrixTools.printMatrix(arr);
		System.out.println("-------- \n Matrix Symmetrisch: \n "+MatrixTools.isSymmetric(arr));
		System.out.println("-------- \n Matrix Spur: \n "+MatrixTools.matrixSpur(arr));
		int[][] arr2 = MatrixTools.createMatrix(3, 3);
//		int[][] arr3 = MatrixTools.matrixMul(arr, arr2);
		MatrixTools.printMatrix(arr2);
		
		

		int[][] arr3 = {{1,1,1},{1,1,1},{1,1,1}};
		System.out.println("----");
		MatrixTools.printMatrix(arr3);
		System.out.println("----");
		int[][] arr3T = MatrixTools.getTransposedMatrix(arr3);
		MatrixTools.printMatrix(arr3T);
		

		System.out.println("-------- \n Matrix Symmetrisch: \n "+MatrixTools.isSymmetric(arr3));
		
		
		
	}

}
