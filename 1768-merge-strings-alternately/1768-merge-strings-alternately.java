class Solution {
    public String mergeAlternately(String word1, String word2) {
     char[] arr1 = word1.toCharArray();
     char[] arr2 = word2.toCharArray();
     char[] ans = new char[arr1.length+arr2.length];
     int a = 0;
     
     for(int i = 0;i<arr1.length || i<arr2.length;i++){
        if(i<arr1.length){
            ans[a]=arr1[i];
            a++;
        }
        if(i<arr2.length){
            ans[a]=arr2[i];
            a++;
        }
     }
     

     String st = new String(ans);
     return st;

     

    }
}