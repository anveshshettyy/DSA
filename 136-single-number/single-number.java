class Solution {
    public int singleNumber(int[] nums) {
        int uni = nums[0];
        for(int i=1; i<nums.length; i++) {
            int a = nums[i];
            uni ^= a;
        }
        return uni;
    }
}