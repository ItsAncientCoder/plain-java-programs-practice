package com.plain.java.programs;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;

public class ConvertIntArrayToIntegerArray {

	public static void main(String[] args) {

		int[] mInt = new int[] {1,2,3,4};
		Integer[] mInteger = new Integer[mInt.length];
		List<Integer> wrapper = new AbstractList<Integer>() {
			@Override
			public int size() {
				return mInt.length;
			}

			@Override
			public Integer get(int i) {
				return mInt[i];
			}
		};

		wrapper.toArray(mInteger);
		System.out.println(wrapper);
		Integer[] what = Arrays.stream( mInt ).boxed().toArray( Integer[]::new );
		for(Integer i: what) {
			System.out.println(i);
		}
	}
}
