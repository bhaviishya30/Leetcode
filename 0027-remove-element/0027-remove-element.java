class Solution {
    public int removeElement(int[] nums, int n) {
    int j = 0;
    for(int i = 0;i<nums.length;i++){
        if(nums[i]!=n){
            nums[j]=nums[i];
            j++;
        }
    }
    return j;
    }
}