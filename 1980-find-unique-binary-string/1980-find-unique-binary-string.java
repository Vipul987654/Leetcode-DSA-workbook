class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int len = nums.length;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<nums.length;i++){
            if(nums[i].charAt(i)=='0'){
                sb.append("1");
            }
            else {
                sb.append("0");
            }

        }
        return sb.toString();
    }
}