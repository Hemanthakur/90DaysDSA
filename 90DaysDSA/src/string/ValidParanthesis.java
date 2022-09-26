package string;

import java.util.Stack;

public class ValidParanthesis {
	static boolean valid(String s) {
		if(s.length()%2!=0)return false;
		Stack<Character> st=new Stack<>();
		for(char c:s.toCharArray()) {
			if(c=='('||c=='['||c=='{') {
				st.push(c);
			}
			else {
				if(st.isEmpty())return false;
				if(c==')' && st.peek()!='(')return false;
				if(c==']' && st.peek()!='[')return false;
				if(c=='}' && st.peek()!='{')return false;
				st.pop();
			}
		}
		return st.isEmpty();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "({[{}]})";
		System.out.println(valid(s));
	}

}
