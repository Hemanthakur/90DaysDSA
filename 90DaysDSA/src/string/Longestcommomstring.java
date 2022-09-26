package string;

import java.util.Arrays;

public class Longestcommomstring {
	static String isLong(String [] strs) {
		Arrays.sort(strs);
		
		StringBuilder sb=new StringBuilder();
		char [] f=strs[0].toCharArray();
		char [] l=strs[strs.length-1].toCharArray();
		
		for(int i=0;i<f.length;i++) {
			if(f[i]!=l[i])break;
			sb.append(f[i]);
		}
		
		
		return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] strs = {"flower","flow","flowing"};
		System.out.println(isLong(strs));
	}

}
