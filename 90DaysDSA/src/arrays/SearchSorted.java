package arrays;

import java.util.Scanner;

public class SearchSorted {
	static int find(int[] arr, int n, int f) {
		int ans = 0;
		int low = 0, high = n - 1;
		int m = 0;
		while (low <= high) {
			m = (high + low) / 2;
			if (arr[m] == f)
				return m;
			if (arr[low] <= arr[m]) {
				if (f >= arr[low] && f <= arr[m]) {
					high = m - 1;
				} else {
					low = m + 1;
				}
			} else {
				if (f >= arr[m] && f <= arr[m]) {
					low = m + 1;
				} else {
					high = m - 1;
				}
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
		int f = sc.nextInt();
		int n = arr.length;
		System.out.println(find(arr, n, f));
	}

}
