package com.training.java11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortTest {

	public void sortOnEmpAsc() {

		new Comparator<Emp>() {

			@Override
			public int compare(Emp o1, Emp o2) {
				return o1.getEmpId() - o2.getEmpId();
			}
		};

	}

	public void sortOnEmpDesc() {
		ArrayList<Emp> list = new ArrayList<Emp>();

		Collections.sort(list, (o1, o2) -> o2.getEmpId() - o1.getEmpId());

	}

}
