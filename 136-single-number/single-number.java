class Solution {
    public int singleNumber(int[] nums) {
        int uni = nums[0];
        // HashSet<Integer> hash = new HashSet<>();
        // for(int i:nums) {
        //     nums
        // }
        // return uni;

        for(int i=1; i<nums.length; i++) {
            int a = nums[i];
            // int b = nums[i-1];
            uni ^= a;
        }
        return uni;
    }
}