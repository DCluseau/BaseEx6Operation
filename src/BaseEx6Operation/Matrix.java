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
			for(int j = 0; j < this.tabMatrix1[i].length; j++) {
				this.FinalMatrix[i][j] = this.tabMatrix1[i][j] + this.tabMatrix2[i][j];
			}
		}
	}
	
	public void displayMatrix() {
		System.out.println("--------------------------------------------------");
		System.out.println("---------------- Matrix --------------------------");
		System.out.println("--------------------------------------------------");
		for(int i = 0; i < this.tabMatrix1.length; i++) {
			String display = "";
			for(int j = 0; j < this.tabMatrix1[i].length; j++) {
				display += " " + tabMatrix1[i][j];
			}
			System.out.println(display);
		}
		System.out.println("+");
		for(int i = 0; i < this.tabMatrix2.length; i++) {
			String display = "";
			for(int j = 0; j < this.tabMatrix2[i].length; j++) {
				display += " " + tabMatrix2[i][j];
			}
			System.out.println(display);
		}
		System.out.println("=");
		for(int i = 0; i < this.FinalMatrix.length; i++) {
			String display = "";
			for(int j = 0; j < this.FinalMatrix[i].length; j++) {
				display += " " + FinalMatrix[i][j];
			}
			System.out.println(display);
		}
	}
}
