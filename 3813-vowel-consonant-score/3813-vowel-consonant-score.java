class Solution {
    public int vowelConsonantScore(String s) {
        int c=0;
        int v=0;
        for(int i=0;i<s.length();i++){
            if("aeiou".indexOf(s.charAt(i)) != -1){
               v++;
            }if("aeiou1234567890 ".indexOf(s.charAt(i)) == -1){
                c++;
            }
        }
        int ans=0;
        if(c>0){
         ans = v/c;
        }
        return ans;
    }
}