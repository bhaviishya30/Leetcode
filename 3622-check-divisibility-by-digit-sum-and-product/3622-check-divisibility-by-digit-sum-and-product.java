class Solution {
    public boolean checkDivisibility(int n) {
        int rem=0;
        int sum = 0;
        int pro=1;
        int num=n;
        while(num>0){
        rem = num%10;
        sum=sum+rem;
        pro=pro*rem;
        num=num/10;
       }
       if(n%(sum+pro)==0){
        return true;
       }else{
         return false;
       }
        
    }
}