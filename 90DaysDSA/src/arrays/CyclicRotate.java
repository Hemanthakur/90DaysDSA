package arrays;

import java.util.Scanner;

public class CyclicRotate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] arr= {1,2,3,4,5};
		int n=arr.length;
		int k=1;
		rotate(arr,n,k);
	}

	static void rotate(int [] arr,int n,int k) {
	       int x = arr[n-1], i;
	       for (i = arr.length-1; i > 0; i--)
	          arr[i] = arr[i-1];
	       arr[0] = x;
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}
}
