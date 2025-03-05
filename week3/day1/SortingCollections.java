package week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingCollections {

	public static void main(String[] args) {

		String[] arr = {"HCL", "CTS", "WIPRO", "ASPIRE"};
		List<String> list = new ArrayList<>(Arrays.asList(arr));
		Collections.sort(list);
		Collections.reverse(list);
		
		for (String e : list) {
			System.out.println(e + ",");
			
		}
	}

}
