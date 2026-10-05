class Solution {
    
    public int missingNumber(int[] arr) {
     int n = arr.length;
     int nth = n*(n+1)/2;
     int sum=0;
     for(int i=0;i<arr.length;i++){
        sum=sum+arr[i];
     }
     int missing = nth-sum;
     return missing;
    }
}