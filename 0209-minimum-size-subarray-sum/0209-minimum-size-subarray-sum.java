class Solution {
    public static int minSubArrayLen(int target, int[] nums) 
    {
        int p1 = 0, p2 = 0;
        int sum = 0;
        int len = nums.length;
        int min_len = Integer.MAX_VALUE;

        if (nums == null || len == 0)
            return 0;

        while (p2 < len) {
            // Expand the window by moving p2 and adding to sum
            sum += nums[p2++];

            // Shrink the window from p1 while sum >= target
            while (sum >= target) {
                min_len = Math.min(min_len, p2 - p1);
                sum -= nums[p1++];
            }
        }

        return min_len == Integer.MAX_VALUE ? 0 : min_len;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;

        int result = 0;
        try {
            result = minSubArrayLen(target, nums);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.print(result); // Expected output: 2
    }
}
