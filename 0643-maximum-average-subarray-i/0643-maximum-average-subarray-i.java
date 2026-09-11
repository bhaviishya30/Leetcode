class Solution {
    public double findMaxAverage(int[] nums, int k) {
       double max = Integer.MIN_VALUE;
       int sum=0;
       for(int i=0;i+k<=nums.length;i++){
        sum=0;
        for(int j=i;j<i+k;j++){
            sum+=nums[j];
        }
        double average = (double)sum/k;
        max=Math.max(max,average);
       }
        return max;
    }
}