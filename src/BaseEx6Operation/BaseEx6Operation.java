package BaseEx6Operation;

import java.util.ArrayList;
import java.util.Arrays;

public class BaseEx6Operation {
	public static void main(String[] args) {
		// Part 6.1
		Operation ope = new Operation();
		System.out.println(ope.add(2, 5));
		
		// Part 6.2
		int lenTriangle = 7;
		int starNb = 1;
		String tempStar;
		ArrayList<String> starTab = new ArrayList<>();
		int spaceNb = 0;
		for(int i = 0; i < lenTriangle; i++) {
			tempStar = "";
			spaceNb = lenTriangle - i + 1;
			for(int j = 0; j < spaceNb; j++) {
				tempStar += " ";
			}
			for(int j = 0; j < starNb; j++) {
				tempStar += "*";
			}
			starTab.add(tempStar);
			starNb += 2;
		}
		
		for(int i = 0; i < starTab.size(); i++) {
			System.out.println(starTab.get(i));
		}
		
		// Part 6.3
		int[] tabNb = {0,1,0,0,10,42,0};
		int max1 = 0;
		int max2 = 0;
		Arrays.sort(tabNb);
		for(int i = 0; i < tabNb.length; i++) {
			if(i == 0) {
				max1 = tabNb[i];
				max2 = max1;
			}else{
				if(max1 < tabNb[i]) {
					max2 = max1;
					max1 = tabNb[i];
				}
			}
		}
		System.out.println("Somme des deux nombres les plus élevés : " + ope.add(max1, max2));
		
		// Part 6.4
	}
}
