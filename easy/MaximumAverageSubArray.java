/*
 * Problem link - https://leetcode.com/problems/maximum-average-subarray-i/description/
 */
public class MaximumAverageSubArray {
    /*
     * tc - O(n)
     * sc - O(1)
     */
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = 0.0;
        int sum = 0;

        // calculate sum of first k elements
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        maxAvg = (double) sum / k;

        for (int i = 1; i <= nums.length - k; i++) {
            double currAvg = 0.0;
            // first subtract the previous element which was removed from window
            sum -= nums[i - 1];
            // then add the new element which was added to window
            sum += nums[i + k - 1];
            // now calculate the new average and then compare it will maxAvg
            currAvg = (double) sum / k;
            maxAvg = Math.max(maxAvg, currAvg);
        }
        return maxAvg;
    }
}