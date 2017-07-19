package learn_today.learn_today.problems.ib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * For a given number find all the factors.
 */
public class Factors {
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);	
		System.out.println("Please enter the number to find it's factors");
		int num = in.nextInt();
		in.close();
		
		Factors f = new Factors();
		ArrayList<Integer> fl = f.findFactors(num);
		
		System.out.println("Factors are: " + fl);
	}
	
	// 1, 2, 4, 5, 10, 20, 25, 50, 100
	public ArrayList<Integer> findFactors(int num) {
		ArrayList<Integer> factorsList = new ArrayList<Integer>();
		
		for(int i=1; i <= Math.sqrt(num); i++) {
			if(num % i == 0) {
				factorsList.add(i);
				
				if(num/i != i)
					factorsList.add(num/i);
			}
			
		}
		
		Collections.sort(factorsList);
		
		return factorsList;
	}
}
