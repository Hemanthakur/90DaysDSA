package arrays;

public class Permutation {

	static void nextper(int[]arr) {
		int n=arr.length;
		if(n==0||arr==null)return;
		int k=n-2;
		for(int i=n-1;i>0;i--) {
			if(arr[i]<=arr[i-1])k--;
			else {
				break;
			}
		}
		if(k==-1) {
			reverse(arr,0,n-1);
			return;
		}
		
		for(int i=n-1;i>0;i--) {
			if(arr[i]>arr[k]) {
				int temp=arr[k];
				arr[k]=arr[i];
				arr[i]=temp;
				break;
			}
		}
		reverse(arr,k+1,n-1);
		for(int a:arr) {
		System.out.print(a+" ");
		}
	}
	static void reverse(int [] arr,int s,int l) {
		while(s<l) {
			int temp=arr[s];
			arr[s]=arr[l];
			arr[l]=temp;
			s++;
			l++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3};
		
		nextper(arr);
	}

}
