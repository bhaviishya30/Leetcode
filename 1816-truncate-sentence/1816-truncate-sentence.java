class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder sc = new StringBuilder();
        int c = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                c++;
            }
            if(c==k){
                break;
            }
            sc.append(s.charAt(i));
        }
        String sb = new String(sc);
        return sb;
    }
}