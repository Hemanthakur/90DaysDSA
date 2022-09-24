package arrays;

public class SumSortedArray {
	static boolean pairInSortedRotated(int [] arr,int N,int X) {
		int i;
			 for ( i = 0; i < N - 1; i++) {
        if (arr[i] > arr[i + 1])
            break;
			 }	
			 int l = (i + 1) % N;
			 int r = i;
			while(l!=r) {
				if(arr[l]+arr[r]==X) {
					return true;
				}
				if(arr[l]+arr[r]<X) {
					l=(l+1)%N;
				}else {
					r=(N+r-1)%N;
				}
			}
		        return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int arr[] = { 21, 25, 6,8, 9, 10 };
		        int X = 16;
		        int N = arr.length;
		  
		        if (pairInSortedRotated(arr, N, X))
		            System.out.print("true");
		        else
		            System.out.print("false");
		    }
}
