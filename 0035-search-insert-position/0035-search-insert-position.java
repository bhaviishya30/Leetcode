class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        boolean flag = false;
      for(;i<nums.length;i++){
        if(nums[i]==target){
            flag = true;
            return i;
        }
      }
      if(flag==false){
        for(int j=0;j<nums.length;j++){
            if(nums.length>1){
            if(target>nums[j]&& target<nums[j+1]){
                return j+1;
            }else if(target<nums[j]){
                return 0;
            }else if(target>nums[nums.length-1]){
                return nums.length;
            }
          }else{
            if(target<nums[j]){
                return 0;
            }else{
                return 1;
            }
          }
         }
      }

      return  i; 
    }
}