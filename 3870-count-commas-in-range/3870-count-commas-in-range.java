class Solution {
    public int countCommas(int n) {
        if(n<1000){
            return 0;
        }
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i;
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<1000){
                continue;
            }else{
                count++;
            }
        }
        return count+1;
        
    }
}