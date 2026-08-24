class Solution {
    public int smallestNumber(int n, int t) {
        int dig=0;
        int rem=0;
        int pro=1;
       for(int i=n;i<500;i++) {
        pro=1;
        dig=i;
          while(dig>0){
          rem = dig%10;
          pro=pro*rem;
          dig=dig/10;
          }
        
          if(pro%t==0){
           return i;
         }
       }
         
         return -1;
    }
}