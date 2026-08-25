class Solution {
    public int maxArea(int[] h) {
        int maxarea=0;
        int i=0;
        int j=h.length-1;
        while(i<j){
            
        
              int  width = j-i;
                int hei = Math.min(h[i],h[j]);
               int  area = hei*width;
                maxarea=Math.max(maxarea,area);
                if(h[i] < h[j]){
                i++;
                }
                else{ j--;
                }
             }
         return maxarea;

            }
        }
       
        