class Solution {
    public void reverseString(char[] s) {
        int j = 0;
        int i = s.length-1;
        while(j<i){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i--;
            j++;
        }
        
    }
}