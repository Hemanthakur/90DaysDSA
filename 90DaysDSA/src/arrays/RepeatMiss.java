package arrays;

public class RepeatMiss {
	static void solve(int [] arr,int n) {
		int miss=0,repeat=0;
		int s=(n*(n+1))/2;
		int as=0,ass=0,sv=0,ssv=0;
		for(int i:arr) {
			as+=i;
		}
		sv=s-as;
		int sum=(n*(n+1)*(2*n+1))/6;
		for(int a:arr) {
			ass=ass+(a*a);
		}
		ssv=sum-ass;
		int ans=sv+ssv;
		repeat=ans/2;
		System.out.println("repeat:"+repeat);
		miss=(as+repeat)-s;
		System.out.println("miss:"+miss);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {3};
		int n=arr.length;
		solve(arr,n);
	}

}
