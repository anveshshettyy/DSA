class Solution {
    public boolean containsDuplicate(int[] nums) {
        // for(int i=0; i<nums.length; i++) {
        //     for(int j=i+1; j<nums.length; j++) {
        //         if(nums[i] == nums[j]) {
        //             return true;
        //         }
        //     }
        // }
        // return false;
        
        // long n = 1000000000;
        // long[] hash = long[n];
        // for(int i=0; i<nums.length;  i++) {
        //     if(nums[i] < 0) {
        //         hash[n + nums[i]]++;
        //     } else {
        //         hash[nums[i]]++;
        //     }
        //     if(hash[nums[i]] != 0) {
        //         return true;
        //     }
        // }
        // return false;

        Arrays.sort(nums);

        for(int i=1; i<nums.length; i++) {
            if(nums[i] == nums[i-1] ) return true;
        }
        return false;
    } 
}