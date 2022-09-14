package arrays;
import java.util.*;
public class Reverse {
	public static void reverseArray(int[] arr) {
		int temp;
		int start=0,end=arr.length-1;
		while(start<end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	static void printArray(int[] arr) {
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  arr[]={1,2,3,4,5,6,7};
	    int n=arr.length;
	    printArray(arr);
		reverseArray(arr);
		printArray(arr);
	}

}
