package com.java.search;

public class SearchInSortedMatrix {

	public static boolean searchElement(int [][]m, int target) {
        // Write your code here.
		int i=0; int n=m.length;
		int  j= n-1;
		while(i<n && j>=0) {
			if(m[i][j]==target) return true;
			else if(m[i][j]>target) j--;
			else i++;
		}
		return false;
    }
	public static void main(String args[]) {
		int[][] m=new int[][] {{1, 3, 7}, {10, 12, 15}, {19, 20, 21}};
		System.out.println(searchElement(m, 2));
	}
}
