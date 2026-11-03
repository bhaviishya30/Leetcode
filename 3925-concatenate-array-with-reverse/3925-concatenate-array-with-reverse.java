class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length*2;
        int arr[] = new int[n];
        int a=0;
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
            a++;
        }
        for(int i=nums.length-1;i>=0;i--){
            arr[a]=nums[i];
            a++;
        }
        return arr;
        
    }
}