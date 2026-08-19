class Solution {
    public int dominantIndex(int[] nums) {
        int max=Integer.MIN_VALUE;
        int index=0;
        boolean flag = true;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
                index=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i==index){
                continue;
            }
            if(nums[i]*2>max){
                flag=false;
            }
        }
        if(!flag){
            return -1;
        }else{
            return index;
        }
    }
}