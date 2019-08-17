package com.plain.java.programs;

public class ReverseArray {

	public static void main(String[] args) {
		int[] nums = new int[] {1, 4, 3, 2};
		int[] revNums = new int[nums.length];
		int j = nums.length-1;
		for(int i = 0; i<nums.length; i++) {
			revNums[i] = nums[j--];
		}
		for(int a: revNums) {
			System.out.println(a);
		}
	}

}
