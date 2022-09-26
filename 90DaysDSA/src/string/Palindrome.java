package string;

public class Palindrome {
	static boolean isPalindrome(String s) {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(s.charAt(i))||Character.isLetter(s.charAt(i))) {
				sb.append(s.charAt(i));
			}
		}
		System.out.println(sb);
		int n=sb.length()-1;
		for(int i=0;i<sb.length()/2;i++) {
			if(sb.charAt(i)!=sb.charAt(n-i))return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String si="0A man, a plan, a canal: Panama0";
		String s=si.toLowerCase();
		System.out.println(isPalindrome(s));
	}

}
