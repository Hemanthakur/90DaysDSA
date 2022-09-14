package arrays;

public class MissingNumber {

	public static void main(String[] args) {
		int arr[]= {1,2,3,5,6,7,8,9,10};
		System.out.println(missing(arr));
	}
	public static int missing(int arr[]) {
		int miss=0;
		int n=arr.length;
		int sum=((n+1)*(n+2))/2;
		for(int i=0;i<n;i++) {
			miss+=arr[i];
		}
		miss=sum-miss;
		return miss;
	}
}
