package arrays;

public class StockBuySell {
	static int maxProfit(int[] arr) {
		if(arr.length==0)return 0;
		int max=0;
		int profit=0;
		int min=arr[0];
		for(int i:arr) {
			min=Math.min(min, i);
			profit=i-min;
			max=Math.max(max, profit);
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,1,2,6,5,3};
		System.out.println(maxProfit(arr));
	}

}
