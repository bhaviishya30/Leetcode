class Solution {
    public int sumOfSquares(int[] nums) {
        int sum=0;
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            int pro=1;
            if(n%(i+1)==0){
                pro=nums[i]*nums[i];
                sum=sum+pro;
            }
        }
        return sum;
    }
}