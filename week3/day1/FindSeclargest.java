package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.mongodb.client.ListIndexesIterable;

public class FindSeclargest {

	public static void main(String[] args) {

		int[] arr= {3,2,11,4,6,7};
		List<Integer> list = new ArrayList<>();
		for (int n : arr) {
			list.add(n);
			
		}
		Collections.sort(list);
		int SecLargest =list.get(list.size()-2);
		System.out.println("Sec largest number :" + SecLargest);
		
			
		}
	}


