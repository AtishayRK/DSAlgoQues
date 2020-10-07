//Given an unsorted array of integers, find the length of longest increasing sub
//sequence. 
//
// Example: 
//
// 
//Input: [10,9,2,5,3,7,101,18]
//Output: 4 
//Explanation: The longest increasing subsequence is [2,3,7,101], therefore the 
//length is 4. 
//
// Note: 
//
// 
// There may be more than one LIS combination, it is only necessary for you to r
//eturn the length. 
// Your algorithm should run in O(n2) complexity. 
// 
//
// Follow up: Could you improve it to O(n log n) time complexity? 
// Related Topics Binary Search Dynamic Programming 
// 👍 5558 👎 124


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int max = 1;

        for(int i=1;i<dp.length;i++) {
            int maxval=0;
            for (int j = 0; j < i; j++) {
                if(nums[i] > nums[j]) {
                    maxval = Math.max(dp[j],maxval);
                }
            }
            dp[i] = maxval+1;
            max = Math.max(dp[i],max);
        }
        return max;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
