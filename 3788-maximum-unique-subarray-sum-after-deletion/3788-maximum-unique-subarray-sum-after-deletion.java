class Solution {
    public int maxSum(int[] nums) 
    {   int bigNeg=Integer.MIN_VALUE;
        Set <Integer> mySet= new HashSet<>();
        int res=0;
        for(int num:nums){
            if(num>0)
            {
                mySet.add(num);
            }
            else{
                bigNeg= Math.max(bigNeg, num);
            }

        }
        for(int x:mySet)
        res += x;

        return res== 0?bigNeg:res;
    }
}