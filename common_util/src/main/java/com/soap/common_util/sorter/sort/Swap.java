package com.soap.common_util.sorter.sort;

public class Swap{

	protected void swap(int[] data, int i, int j) {
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}

}