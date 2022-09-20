package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Distribution {
	public static int calculate(int arr[], int m) {
		int n = arr.length;
		if (m == 0 || n == 0)
			return 0;
		if (n < m)
			return -1;
		int res = Integer.MAX_VALUE;
		int cur = 0;
		for (int i = 0; i+m-1<n; i++) {
			cur = arr[i + m - 1] - arr[i];
			if (res > cur) {
				res = cur;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3,4,7,9,11,13,25};
		System.out.print("No of student:");
		int m = sc.nextInt();
		Arrays.sort(arr);
		System.out.println(calculate(arr, m));
	}

}
