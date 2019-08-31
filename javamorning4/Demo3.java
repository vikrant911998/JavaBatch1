package javamorning4;

import java.util.ArrayList;

public class Demo3 {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		Integer integer1 = new Integer(4);
		
		Integer integer[] = new Integer[5];
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(51);
		list.add(17);
		list.add(21);
		list.add(12);
		
		for(int i:list) {
			System.out.println(i);
		}
	}

}
