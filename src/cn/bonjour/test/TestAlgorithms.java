package cn.bonjour.test;

import cn.bonjour.algorithm.FastSorting;

public class TestAlgorithms {

	public static void main(String[] args) {
		int[] arr = {-1,-4,1,-3,11,9,-9,10,98};
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println("\n"+FastSorting.partition(arr, 0, arr.length-1));
		System.out.println("\n------Fast sorting------");
		FastSorting.doFastSorting(arr,0,arr.length-1);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}

}
