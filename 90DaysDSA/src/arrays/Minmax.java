package arrays;
/*Min and Max of an array */
public class Minmax {

	public static void main(String[] args) {
		int [] arr= {22, 14, 8, 17, 35, 3};
		compare(arr);
	}
	public static void compare(int [] arr) {
		int min=arr[0],max=arr[0];
		if(arr== null ||arr.length==0)return;
		if(arr.length==1)System.out.println("min and max is "+min);
		else {
		for(int i=0;i<arr.length;i++) {
			min=Math.min(min, arr[i]);
			max=Math.max(max, arr[i]);
		}
		System.out.println("min:"+min+" max:"+max);
		}
		
	}
}
