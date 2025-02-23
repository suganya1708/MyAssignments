package week1.day4;

public class ReverseString {

	public static void main(String[] args) {

		String Name = "Testleaf";
		char arr[] = Name.toCharArray();
		for (int i = arr.length-1; i >=0; i--) {
			System.out.print(arr[i]);
			
		}
	}

}
