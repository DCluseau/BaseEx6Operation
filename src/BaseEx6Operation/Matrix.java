package BaseEx6Operation;


public class Matrix {
	int[][] tabMatrix1;
	int[][] tabMatrix2;
	int[][] FinalMatrix;
	
	Matrix(int[][] tabMatrix1, int[][] tabMatrix2){
		this.tabMatrix1 = tabMatrix1;
		this.tabMatrix2 = tabMatrix2;
		this.FinalMatrix = tabMatrix1;
	}
	
	public void addMatrix() {
		for(int i = 0; i < this.tabMatrix1.length ; i ++) {
			for(int j = 0; j < this.tabMatrix1[i].length; i++) {
				this.FinalMatrix[i][j] = this.tabMatrix1[i][j] + this.tabMatrix2[i][j];
			}
		}
	}
	
	public void displayMatrix() {
		for(int i = 0; i < this.FinalMatrix.length; i++) {
			String display = "";
			for(int j = 0; j < this.FinalMatrix.length; j++) {
				display += " " + FinalMatrix[i][j];
			}
			System.out.println(display);
		}
	}
	
	
}
