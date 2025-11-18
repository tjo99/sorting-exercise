import java.util.*;

public class NumStringSorter {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		Random rn = new Random();
		
		int n1 = rn.nextInt(100);
		System.out.println("First number: " + n1);
		nums.add(n1);
		
		int n2 = rn.nextInt(100);
		System.out.println("Second number: " + n2);
		nums.add(n2);
		
		int n3 = rn.nextInt(100);
		System.out.println("Third number: " + n3);
		nums.add(n3);
		
		Collections.sort(nums);
		
		System.out.println("Sorted number list: " + nums);
		System.out.println();
	}
}