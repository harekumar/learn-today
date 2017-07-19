package learn_today.learn_today.ds.arrays;

import java.util.Objects;

public class TArray1 {

	public static void main(String args[]) {
		
		int[] arr123 = new int[] {10,20,30,40,50,60,70};
		
		System.out.println(arr123.hashCode());
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(1);
	}
}
