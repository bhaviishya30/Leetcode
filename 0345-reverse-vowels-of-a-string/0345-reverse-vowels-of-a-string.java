class Solution {
    public String reverseVowels(String s) {
        char ans[] = s.toCharArray();
        int i = 0;
        int j = ans.length-1;
        while(i<j){
            while(i<j && "aeiouAEIOU".indexOf(ans[i]) == -1){
                i++;
            }
            while(i<j && "aeiouAEIOU".indexOf(ans[j]) == -1){
                j--;
            }
            char temp = ans[i];
            ans[i] = ans[j];
            ans[j]=temp;
            i++;
            j--;
        }
        String sb = new String(ans);
        return sb;
      
    }
}