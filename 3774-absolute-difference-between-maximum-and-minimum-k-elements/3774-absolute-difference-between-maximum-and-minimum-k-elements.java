class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int max=0;
        int min=0;
        int mi=0;
        int mx=0;
        for(int i=0;i<nums.length;i++){
            if(mi==k)break;
           min+=nums[i]; 
           mi++;
        }
        for(int i=nums.length-1;i>=0;i--){
            if(mx==k)break;
            max+=nums[i];
            mx++;
        }
        return max-min;
    }
}