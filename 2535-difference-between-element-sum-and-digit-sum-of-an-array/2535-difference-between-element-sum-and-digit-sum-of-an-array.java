class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int sum2=0;
        for(int i=0;i<nums.length;i++){
            int ele=nums[i];
            while(ele>0){
                int last=ele%10;
                 sum2=sum2+last;
                ele=ele/10;

            }
        }
        return sum-sum2;
        
    }
}