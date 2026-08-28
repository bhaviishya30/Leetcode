class Solution {
    public boolean isPalindrome(int x) {
      int last =0;
     int n = x;
     int reverse = 0;
      while(n>0){
        last = n%10;
        reverse = reverse*10+last;
        n=n/10;
      }
      if(reverse==x){
        return true;
      }else{
        return false;
      } 
        
    }
}