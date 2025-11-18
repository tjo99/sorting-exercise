import java.util.*;

public class NumStringSorter {
	public static void main(String[] args) {
		//number sort
		ArrayList<Integer> nums = new ArrayList<Integer>();
		Random rn = new Random();
		
		//randomly generate three numbers to sort
		int n1 = rn.nextInt(100);
		System.out.println("First number: " + n1);
		nums.add(n1);
		
		int n2 = rn.nextInt(100);
		System.out.println("Second number: " + n2);
		nums.add(n2);
		
		int n3 = rn.nextInt(100);
		System.out.println("Third number: " + n3);
		nums.add(n3);
		
		//sort the numbers
		Collections.sort(nums);
		
		//print result
		System.out.println("Sorted number list: " + nums);
		System.out.println();
		
		//character sort
		ArrayList<Character> chars = new ArrayList<Character>();
		Random rc = new Random();

		//randomly generate three letters to sort
		char c1 = (char) (rc.nextInt(26) + 'a');
		System.out.println("First letter: " + c1);
		chars.add(c1);
		
		char c2 = (char) (rc.nextInt(26) + 'a');
		System.out.println("Second letter: " + c2);
		chars.add(c2);
		
		char c3 = (char) (rc.nextInt(26) + 'a');
		System.out.println("Third letter: " + c3);
		chars.add(c3);

		//sort the letters
		Collections.sort(chars);

		//print result
		System.out.println("Sorted letter list: " + chars);
	}
}