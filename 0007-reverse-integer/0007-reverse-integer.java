class Solution {
    public int reverse(int x) {
     
       return rev(x,0);
     
        
    }
    public static int rev(int x, long r){
        if(x==0){
              if(r>Integer.MAX_VALUE || r<Integer.MIN_VALUE){
                return 0;
            }
            return (int)r;
        }
      
        return rev(x/10,r*10+x%10);
        
        
    }
}