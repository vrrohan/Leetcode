/*
 * Problem link - https://leetcode.com/problems/plus-one/description/
 */
public class PlusOne {
    /*
     * tc - O(n) + O(n) [if need to create extra array of +1 size to copy elements]
     * ~ O(2n) == O(n)
     * sc - O(1)
     */
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            // add carry to number - initially it is 1
            int sum = digits[i] + carry;
            // if sum>9 - it means carry will be 1 again or else it will be 0
            carry = (sum > 9) ? 1 : 0;
            // we will check if sum>9, we will add only 0 to array , since we are adding
            // only 1 to it
            digits[i] = (sum > 9) ? 0 : sum;
        }

        // after adding every index, if carry is still 1 - we will create a separate new
        // array of +1 length
        if (carry > 0) {
            int[] newArray = new int[digits.length + 1];
            // add carry to the first index of new array
            newArray[0] = carry;
            // copy everything from old array to new array
            for (int i = 0; i < digits.length; i++) {
                newArray[i + 1] = digits[i];
            }
            return newArray;
        }
        return digits;

    }
}
