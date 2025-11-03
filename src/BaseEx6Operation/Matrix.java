package BaseEx6Operation;

/**
 * Class which takes two matrix and does operations with them. The result goes into another matrix.
 */
public class Matrix {
	/** Attributes
	 * tabMatrix1 : first matrix
	 * tabMatrix2 : second matrix
	 * finalMatrix : matrix where the two others matric are added
	 */
	
	int[][] tabMatrix1;
	int[][] tabMatrix2;
	int[][] finalMatrix;
	
	/**
	 * 
	 * @param tabMatrix1 : first matrix to be attributed
	 * @param tabMatrix2 : second matrix to be attributed
	 */
	Matrix(int[][] tabMatrix1, int[][] tabMatrix2, int[][] finalMatrix){
		this.tabMatrix1 = tabMatrix1;
		this.tabMatrix2 = tabMatrix2;
		this.finalMatrix = finalMatrix;
	}
	
	/**
	 * Function to add two matrix (tabMatrix1 and tabMatrix2) which result in another matrix (finalMatrix)
	 */
	public void addMatrix() {
		for(int i = 0; i < this.tabMatrix1.length ; i ++) {
			for(int j = 0; j < this.tabMatrix1[i].length; j++) {
				this.finalMatrix[i][j] = this.tabMatrix1[i][j] + this.tabMatrix2[i][j];
			}
		}
	}
	
	/**
	 * Function to substract two matrix (tabMatrix1 and tabMatrix2) which result in another matrix (finalMatrix)
	 */
	public void subMatrix() {
		for(int i = 0; i < this.tabMatrix1.length ; i ++) {
			for(int j = 0; j < this.tabMatrix1[i].length; j++) {
				this.finalMatrix[i][j] = this.tabMatrix1[i][j] - this.tabMatrix2[i][j];
			}
		}
	}
	
	/**
	 * Function to multiply two matrix (tabMatrix1 and tabMatrix2) which result in another matrix (finalMatrix)
	 */
	public void mulMatrix() {
		for(int i = 0; i < this.tabMatrix1.length ; i ++) {
			for(int j = 0; j < this.tabMatrix1[i].length; j++) {
				this.finalMatrix[i][j] = this.tabMatrix1[i][j] * this.tabMatrix2[i][j];
			}
		}
	}
	
	/**
	 * Function to display the three matrix
	 * @param ope : operator to display
	 */
	public void displayMatrix(String ope) {
		
		for(int i = 0; i < this.tabMatrix1.length; i++) {
			String display = "";
			for(int j = 0; j < this.tabMatrix1[i].length; j++) {
				display += " " + tabMatrix1[i][j];
			}
			System.out.println(display);
		}
		System.out.println(ope);
		for(int i = 0; i < this.tabMatrix2.length; i++) {
			String display = "";
			for(int j = 0; j < this.tabMatrix2[i].length; j++) {
				display += " " + tabMatrix2[i][j];
			}
			System.out.println(display);
		}
		System.out.println("=");
		for(int i = 0; i < this.finalMatrix.length; i++) {
			String display = "";
			for(int j = 0; j < this.finalMatrix[i].length; j++) {
				display += " " + finalMatrix[i][j];
			}
			System.out.println(display);
		}
		System.out.println("-----------------");
	}
}
