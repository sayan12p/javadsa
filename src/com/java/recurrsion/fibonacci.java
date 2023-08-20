package com.java.recurrsion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fibonacci {

	public static int fibofN(int n) {
		if(n<=1) return n;
		int[] visited=new int[n+1];
		Arrays.fill(visited, -1);
		if(visited[n]!=-1) {return visited[n];}
		else {
			visited[n]=fibofN(n-1)+fibofN(n-2);
			return visited[n];
		}
		
	}
	public static void main(String[] args) {
		System.out.print(fibofN(3));
	}
}
