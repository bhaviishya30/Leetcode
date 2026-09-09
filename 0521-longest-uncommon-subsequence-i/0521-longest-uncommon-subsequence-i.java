class Solution {
    public int findLUSlength(String a, String b) {
        if(a.equals(b)){
            return -1;
        }
        char[] arr = a.toCharArray();
        char arr1[] = b.toCharArray();
        int count = 0;
        int count1 = 0;
        for(int i=0;i<arr.length;i++){
            count++;
        }
        for(int i=0;i<arr1.length;i++){
            count1++;
        }
        if(count>=count1){
            return count;
        }else{
            return count1;
        }
        
    }
}