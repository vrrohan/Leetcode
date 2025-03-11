import java.util.Stack;

/*
 * Leetcode Problem link - https://leetcode.com/problems/valid-parentheses/description/
 */
public class ValidParenthesis {

	/*
	 * tc - O(n)
	 * sc - O(n)
	 */
	public boolean isValid(String s) {
        if(s.length()==1) return false;
		else {
			boolean isValidParanthesis = true;
			Stack<Character> st = new Stack<Character>();
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[') {
					st.push(s.charAt(i));
				} else if(s.charAt(i)==')' && !st.isEmpty() && st.peek()=='(') {
					st.pop();
				} else if(s.charAt(i)=='}' && !st.isEmpty() && st.peek()=='{') {
					st.pop();
				} else if(s.charAt(i)==']' && !st.isEmpty() && st.peek()=='[') {
					st.pop();
				} else {
					isValidParanthesis = false;
					break;
				}
			}
			return (st.size()==0 && isValidParanthesis) ? isValidParanthesis : false;
		}
}
