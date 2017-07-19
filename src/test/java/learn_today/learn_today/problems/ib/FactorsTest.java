package learn_today.learn_today.problems.ib;

import java.util.ArrayList;

import junit.framework.TestCase;

public class FactorsTest extends TestCase{
	
	private int num = 100000000;
	
	public void testFactors() {	
		Factors f = new Factors();
		
		ArrayList<Integer> expected = f.findFactors(num);
		
		ArrayList<Integer> actual = findFactors(num);
		
		assertEquals(expected, actual);
	}
	
	private ArrayList<Integer> findFactors(int num) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=1; i<= num/2; i++) {
			if(num%i == 0)
				al.add(i);
		}
		al.add(num);
		return al;
	}
}
