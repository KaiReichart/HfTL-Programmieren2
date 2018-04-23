package matrix;

public class MatrixTools {
	
	public static int [][] createMatrix(int m, int n) {
		if(m <=  0 || n <= 0) {
			return null;
		}
		
		int [][] arr = new int[m][n]; 
		
		for(int i = 0; i < m; i++) {
			for(int a = 0; a < n; a++) {
				arr[i][a] = (int)(Math.random() * 10 + 1);
			}
		}
		return arr;
	}
	public static void printMatrix(int[][] m) {
		if(m == null || m[0] == null) {
			return;
		}
		for(int i = 0; i < m.length; i++) {
			if(m[i] == null) {
				return;
			}
		}
		for(int i = 0; i < m.length; i++) {
			for(int a = 0; a < m[i].length; a++) {
				System.out.print("|"+m[i][a]);
			}
			System.out.print("\n");
		}
	}
	public static int[][] getTransposedMatrix(int[][] m){
		if(m == null) {
			return null;
		}
		for(int i = 0; i < m.length; i++) {
			if(m[i] == null) {
				return null;
			}
		}
		
		for(int i = 0; i < m.length; i++) {
			if(m[i] == null || m[0].length != m[i].length) {
				return null;
			}
		}
		
		int [][] newMat = new int [m[0].length][m.length];
		
		for(int i = 0; i < m.length; i++) {
			for(int a = 0; a < m[i].length; a++) {
				newMat[a][i] = m[i][a];
			}
		}
		return newMat;
	}
	public static boolean isSymmetric(int[][] m) {
		if(m == null) {
			return false;
		}
		for(int i = 0; i < m.length; i++) {
			if(m[i] == null || m[i].length != m.length) {
				return false;
			}
		}
		int[][] mT = getTransposedMatrix(m);
		
		if(mT == null) {
			return false;
		}
		
		for(int i = 0; i < m.length; i++) {
			for(int a = 0; a < m[i].length; a++) {
				if(m[i][a] != mT[i][a]) {
					return false;
				}
			}
		}
		
		return true;
		
		
//		return (mT == null || m != mT)?false:true;
	}
	public static int matrixSpur(int[][] m) {
		if(m == null) {
			return 0;
		}
		for(int i = 0; i < m.length; i++) {
			if(m[i] == null) {
				return 0;
			}
		}
		for(int i = 0; i < m.length; i++) {
			if(m.length != m[i].length) {
				return 0;
			}
		}
		
		int spur = 0;
		for(int i = 0; i < m.length; i++) {
			spur += m[i][i];
		}
		return spur;
	}
	
	public static int[][] matrixMul(int[][] a, int[][] b){
		if(a == null || b == null) {
			return null;
		}
		
		
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] == null || a[0].length != a[i].length) {
				return null;
			}
		}
		for(int i = 0; i < b.length; i++) {
			if(b[i] == null || b[0].length != b[i].length) {
				return null;
			}
		}
		
		
		
		if(a[0].length != b.length) {
			return null;
		}
		
		int[][] newMat = new int[a[0].length][b.length];
		
		for(int i = 0; i < a[0].length; i++) {
			for(int j = 0; j < b.length; j++) {
				
				for(int x = 0; x < b.length; x++) {
					newMat[i][j] += a[i][x]*b[x][j];
				}
			}
		}
		
		return newMat;
	}
}
