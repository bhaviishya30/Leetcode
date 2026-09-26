class Solution {
    
    public int missingNumber(int[] arr) {
    int len=arr.length;
    int nth_sum = len*(len+1)/2;
    int tolsum=0;
    for(int i=0;i<arr.length;i++){
       tolsum+=arr[i];
    }
    int missing = nth_sum-tolsum;
    return missing;
    }
}