package string;

import java.util.HashSet;

public class LongestSubstringwithoutRepeat {
	static int lengthOfLongestSubstring(String s) {
		HashSet<Character> hs=new HashSet<>();
		int i=0,j=0,max=0;
		while(j<s.length()) {
			if(!hs.contains(s.charAt(j))) {
				hs.add(s.charAt(j));
				j++;
				max=Math.max(hs.size(),max);
				
			}else {
				hs.remove(s.charAt(i));
				i++;
			}
		}
		return max;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="pwwkew";
		System.out.println(lengthOfLongestSubstring(s));
	}

}
