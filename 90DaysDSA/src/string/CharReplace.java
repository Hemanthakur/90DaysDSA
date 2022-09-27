package string;

import java.util.HashMap;
import java.util.Map;

public class CharReplace {
	 public static int characterReplacement(String s, int k) {
	     Map<Character,Integer> map=new HashMap<>();
	        int st=0,n=0;
	        int max=0;
	        for(int i=0;i<s.length();i++){
	            char c=s.charAt(i);
	            map.put(c,map.getOrDefault(c,0)+1);
	          System.out.println(map);
	            max=Math.max(max,map.get(c));
	        System.out.println(max);
	        if(i-st+1-max>k){
	            char l=s.charAt(st);
	            map.put(l,map.get(l)-1);
	            st++;
	        }
	        n=Math.max(n,i-st+1);
	        System.out.println(n);
	        }
	    return n;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ABAB";
		int k=1;
		System.out.println(characterReplacement(s,k));
	}

}
