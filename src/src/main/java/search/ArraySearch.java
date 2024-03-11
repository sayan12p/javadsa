package com.java.search;

public class ArraySearch {
public static int returnindex(int[] a,int target,int low,int high) {
	while (low<high  ) {
		int mid=(low+high)/2;
		if(a[mid]==target) {return mid;}
		if(a[mid]<target) {
			return returnindex(a, target,low,mid);
		}
		if(a[mid]>target) {return returnindex(a, target, mid+1,high);}
		}
	return -1;
}
	
	public static void main(String args[]) {
		int[] a= {1,2,3,4,5};
		System.out.print(returnindex(a, 3, 0, 4));
	}
}
