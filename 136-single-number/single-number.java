class Solution {
    public int singleNumber(int[] nums) {
        int unique = nums[0];
        for(int i=1; i<nums.length; i++) {
            int a = nums[i];
            unique ^= a;
        }
        return unique;

        // HashMap<Integer, Integer> hash = new HashMap<>();
        // int count = 0;

        // for(int i: nums) {
        //     hash.
        // }

    }
}