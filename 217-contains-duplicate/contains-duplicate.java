class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> hashMap = new HashSet<>();

        for(int i:nums) {
            if(hashMap.contains(i)) return true;

            hashMap.add(i);
        }
        return false;
    } 
}