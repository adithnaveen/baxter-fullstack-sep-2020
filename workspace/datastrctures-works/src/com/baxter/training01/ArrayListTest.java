package com.baxter.training01;

import java.util.ArrayList;

// <1.5 
public class ArrayListTest {
	public static void main(String[] args) {

		ArrayList<Integer> intList = new ArrayList<Integer>();

		intList.add(324);
		intList.add(34);

		for (Integer temp : intList) {
			System.out.println(temp);
		}

	}

	private static void old_way() {
//		old_way();
		ArrayList list = new ArrayList();

		list.add("hello");
		list.add(true);
		list.add(new Object());
		list.add(34.5);

		for (Object temp : list) {

			if (temp instanceof Integer) {

			} else if (temp instanceof String) {

			}

			System.out.println(temp);

		}

		System.out.println(list);
	}
}
