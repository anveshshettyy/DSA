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

        // Arrays.sort(nums);
        // for(int i=1; i<nums.length; i++) {
        //     if(nums[i] == nums[i-1] ) return true;
        // }
        // return false;


        HashSet <Integer> hash = new HashSet<>();
        for(int num:nums) {
            if(hash.contains(num)) return true;
            hash.add(num);
        }
        return false;
    } 
}