class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int c=0;
        for(int i=0;i+k<=arr.length;i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
               sum=sum+arr[j];
            }
            int average = sum/k;
            if(average>=threshold){
                c++;
            }
        }
        return c;
        
    }
}