class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m+n];
        int a = 0;
        for(int i =0;i<m;i++){
            arr[a] = nums1[i];
            a++;
        }
        for(int i=0;i<n;i++){
            arr[a]=nums2[i];
            a++;
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            nums1[i]=arr[i];
        }
        
    }
}