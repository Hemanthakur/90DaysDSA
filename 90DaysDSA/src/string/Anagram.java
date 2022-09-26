package string;

public class Anagram {
	static boolean isAnagram(String s,String t) {
		if(s.length()!=t.length())return false;
		int [] cnt=new int[26];
		for(int i=0;i<s.length();i++) {
			cnt[s.charAt(i)-'a']++;
			cnt[t.charAt(i)-'a']--;
		}
		for(int i=0;i<cnt.length;i++) {
			if(cnt[i]!=0)return false;
		}
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "anagram";
		 String t = "nagarmm";
		 System.out.println(isAnagram(s,t));
	}

}
