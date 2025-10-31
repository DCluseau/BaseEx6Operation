package BaseEx6Operation;

/**
 * Class to do operations on two numbers
 */
public class Operation {
	/**
	 * Constructor (empty)
	 */
	Operation(){
		
	}
	/**
	 * Function to add two numbers
	 * @param nb1 : first number to add
	 * @param nb2 : second number to add
	 * @return : addition of the two numbers in arguments
	 */
	public int add(int nb1, int nb2) {
		return nb1 + nb2;
	}
	
	/**
	 * Function to substract two numbers
	 * @param nb1 : first number to substract
	 * @param nb2 : second number to substract
	 * @return : substraction of the two numbers in arguments
	 */
	public int sub(int nb1, int nb2) {
		return nb1 - nb2;
	}
	
	/**
	 * Function to multiply two numbers
	 * @param nb1 : first number to multiply
	 * @param nb2 : second number to multiply
	 * @return : multiplication of the two numbers in arguments
	 */
	public int mul(int nb1, int nb2) {
		return nb1 * nb2;
	}
	
	/**
	 * Function to divide two numbers
	 * @param nb1 : first number to divide
	 * @param nb2 : second number to divide
	 * @return : division of the two numbers in arguments
	 */
	public double div(double nb1, double nb2) {
		/** 
		 * Return a double number to avoid false result
		 */
		return (double) nb1 / nb2;
	}
}
