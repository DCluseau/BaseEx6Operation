package BaseEx6Operation;

//import java.util.ArrayList;

public class Operation {
	/*
	 * ArrayList<Double> tabNb = new ArrayList<Double>();
	 * 
	 * Operation(double[] tabNb){ for(int i = 0; i < tabNb.length; i++) {
	 * this.tabNb.add(tabNb[i]); } }
	 */
	
	public int add(int nb1, int nb2) {
		return nb1 + nb2;
	}
	
	public int sub(int nb1, int nb2) {
		return nb1 - nb2;
	}
	
	public int mul(int nb1, int nb2) {
		return nb1 * nb2;
	}
	
	public double div(double nb1, double nb2) {
		// Return a double number to avoid false result
		return (double) nb1 / nb2;
	}
}
