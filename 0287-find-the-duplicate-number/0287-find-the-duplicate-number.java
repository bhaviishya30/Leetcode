class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int freq[]=new int[n];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>=2)
            return i;
        }
        return -1;
    }
}