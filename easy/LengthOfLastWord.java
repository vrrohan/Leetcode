/*
 * Problem link - https://leetcode.com/problems/length-of-last-word/
 */
public class LengthOfLastWord {
    /*
     * tc - O(n) - worst case if only single word in whole sentence + spaces are
     * present
     * sc - O(1)
     */
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int length = 0, i = s.length() - 1;
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        return length;
    }
}
