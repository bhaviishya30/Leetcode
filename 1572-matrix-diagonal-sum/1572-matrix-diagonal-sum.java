class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int n=mat.length;
      for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat.length;j++){
            if(i==j){
                sum=sum+mat[i][j];
            }
        }
      }
      int sum2=0;
      for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat.length;j++){
            if(i+j == n-1){
                if(i==j){
                    continue;
                }
               sum2=sum2+mat[i][j];
            }
        }
      }
      int sum3 = sum+sum2;
      return sum3;
        
    }
}