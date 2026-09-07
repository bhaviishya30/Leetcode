class Solution {
    public int maxFreqSum(String s) {
        int vfre = 0;
        int cfre=0;
        int vmax = Integer.MIN_VALUE;
        int cmax = Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            vfre=0;
            cfre=0;
            for(int j=i;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j) && "aeiou".indexOf(s.charAt(i)) != -1){
                    vfre++;
                }
                if(s.charAt(i)==s.charAt(j) && "aeiou".indexOf(s.charAt(i)) == -1){
                    cfre++;
                }
            }
            vmax = Math.max(vmax,vfre);
            cmax= Math.max(cmax,cfre);
        }
        return vmax+cmax;
        
    }
}