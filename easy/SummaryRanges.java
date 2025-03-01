import java.util.ArrayList;
import java.util.List;

/*
 * Problem link - https://leetcode.com/problems/summary-ranges/description/
 */
public class SummaryRanges {

    /*
     * tc - O(n), since we are iterating over array only once
     * sc - O(n), if all elements are out of range, then we will store each element
     * in the list
     */
    public List<String> summaryRanges(int[] nums) {
        List<String> rangeList = new ArrayList<String>();
        if (nums.length > 0) {
            int start = nums[0], end = nums[0];
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] + 1 == nums[i + 1]) {
                    end = nums[i + 1];
                } else {
                    String summary = (start == end) ? "" + start : "" + start + "->" + end;
                    rangeList.add(summary);
                    start = nums[i + 1];
                    end = nums[i + 1];
                }
            }
            String summ = (start == end) ? "" + start : "" + start + "->" + end;
            rangeList.add(summ);
        }
        return rangeList;
    }
}
