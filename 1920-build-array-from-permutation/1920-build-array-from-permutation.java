class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        int a=0;
        int in = 0;
        for(int i=0;i<nums.length;i++){
            in=nums[i];
            int num=nums[in];
            ans[a]=num;
            a++;

        }
        return ans;
    }
}