class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int c=0;
       for(int i=0;i<nums.length;i++){
        c=0;
        for(int j=i;j<nums.length;j++){
            if(nums[i]==nums[j]){
                c++;
            }
        }
        if(c>nums.length/3 && !arr.contains(nums[i])){
            arr.add(nums[i]);
        }
       }
        return arr;

    }
}