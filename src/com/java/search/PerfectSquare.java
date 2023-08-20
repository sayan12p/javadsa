package com.java.search;

public class PerfectSquare {

	public static boolean checkperfectsquare(long  a) {
		if(a==1) return true;
		long s=0;
		long e=a-1;
		while(s<=e) {
			long mid=(s+e)/2;
			if (mid*mid==a) return true;
			if(mid*mid>a) e=mid-1;
			else s=mid+1;
		}
		return false;
	}
	public static void main(String args[]) {
		long a= 9811;
		System.out.print(checkperfectsquare(a));
	}
}
