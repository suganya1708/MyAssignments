package week3.day1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Intersection {

	public static void main(String[] args) {

		List<Integer>list= new ArrayList<Integer>();
		list.add(3);
		list.add(2);
		list.add(11);
		list.add(4);
		list.add(6);
		list.add(7);
		
		List<Integer>list1= new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(8);
		list1.add(4);
		list1.add(9);
		list1.add(7);
		
		List<Integer> Intersection = findIntersection(list, list1);
		
		
		System.out.println("Intersection: " +Intersection);
		
		
		
		
	}

	private static List<Integer> findIntersection(List<Integer> list, List<Integer> list1) {

		List<Integer> intersection = new ArrayList<Integer>();

		for (Integer e : list) {
			if (list1.contains(e)) {
				intersection.add(e);
				
			}
			
		}

	

		
		
		return intersection;
	}

}
