class Solution {
    public int peakIndexInMountainArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
                index=i;
            }
        }
        return index;

        
    }
}