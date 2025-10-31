package BaseEx6Operation;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Main class
 */
public class BaseEx6Operation {
	/**
	 * Constructor (empty)
	 */
	BaseEx6Operation(){
		
	}
	/**
	 * Main program
	 * @param args : args are not used in this program
	 */
	public static void main(String[] args) {
		System.out.println("--------------------------------------------------");
		System.out.println("---------------- Part 6.1-------------------------");
		System.out.println("----------------- Operations ---------------------");
		System.out.println("--------------------------------------------------");
		
		/** 
		 * Create object Operation
		 */
		Operation ope = new Operation();
		
		/** 
		 * Adding numbers 2 and 5
		 */
		System.out.println(ope.add(2, 5));
		
		System.out.println("--------------------------------------------------");
		System.out.println("---------------- Part 6.2-------------------------");
		System.out.println("---------------- Triangle -----------------------");
		System.out.println("--------------------------------------------------");
		
		/**
		 * Number of lines of the triangle
		 */
		int lenTriangle = 7;
		/**
		 * Number of stars in the line
		 */
		int starNb = 1;
		/**
		 * Temporary string for displaying stars
		 */
		String tempStar;
		/**
		 * List of strings representing the triangle (one line = one cell)
		 */
		ArrayList<String> starTab = new ArrayList<>();
		/**
		 * Number of spaces before the stars
		 */
		int spaceNb = 0;
		
		/**
		 * Filling the list
		 */
		for(int i = 0; i < lenTriangle; i++) {
			tempStar = "";
			
			/**
			 * Counting the number of spaces before the stars
			 * Operation is :
			 * number of spaces = number of lines - line number + 1
			 */
			spaceNb = lenTriangle - i + 1;
			for(int j = 0; j < spaceNb; j++) {
				tempStar += " ";
			}
			
			/**
			 * Once the cell is filled with the spaces, add stars
			 */
			for(int j = 0; j < starNb; j++) {
				tempStar += "*";
			}
			
			/**
			 * Adding the line in the list
			 */
			starTab.add(tempStar);
			
			/**
			 * Adding 2 to the number of stars (there are two stars added in each lines
			 */
			starNb += 2;
		}
		
		/**
		 * Display the triangle
		 */
		for(int i = 0; i < starTab.size(); i++) {
			System.out.println(starTab.get(i));
		}
		
		System.out.println("--------------------------------------------------");
		System.out.println("---------------- Part 6.3-------------------------");
		System.out.println("---------------- Adding max numbers---------------");
		System.out.println("--------------------------------------------------");
		
		/**
		 * Create simple list of integers
		 */
		int[] tabNb = {0,1,0,0,10,42,0};
		/**
		 * Variables to stock the two highest numbers
		 */
		int max1 = 0;
		int max2 = 0;
		/**
		 * Ordering the list
		 */
		Arrays.sort(tabNb);
		/**
		 * With the list ordered, accessing the two highest numbers is very easy
		 */
		max1 = tabNb[tabNb.length - 1];
		max2 = tabNb[tabNb.length - 2];
		
		/**
		 * Display the sum of the two highest numbers
		 */
		System.out.println("Somme des deux nombres les plus élevés : ");
		System.out.println(max1 + " + " + max2 + " = " + ope.add(max1, max2));
		
		System.out.println("--------------------------------------------------");
		System.out.println("---------------- Part 6.4 ------------------------");
		System.out.println("---------------- Matrix --------------------------");
		System.out.println("--------------------------------------------------");
		
		/**
		 * Initiating simple lists to make the two Matrix
		 */
		int[][] tabMatrix1 = {{1, 4, -9},{4, 8, 80}};
		int[][] tabMatrix2 = {{70, 41, 4},{-50, -8, 77}};
		/**
		 * Initiating Matrix object
		 */
		Matrix matrixFinal = new Matrix(tabMatrix1, tabMatrix2);
		
		/**
		 * Adding matrix 1 and matrix 2
		 */
		matrixFinal.addMatrix();
		
		/**
		 * Displaying the three matrix
		 */
		matrixFinal.displayMatrix();
	}
}
