package week1.day4;

public class OddIndexToUpperCase {
	private static char toupper;

	public static void main(String[] args) {
		String test ="testleaf";
		char a[] = test.toCharArray();
		
		int len = a.length;
		
		//length = 1
		// index starts from 0
		for (int i = 0; i < a.length; i++) {
			if(i%2 == 0)
			{
				a[i] = Character.toUpperCase(a[i]);
				
			}
		}
		System.out.println(a);
		
		}

}