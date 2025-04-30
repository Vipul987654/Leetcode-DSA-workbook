class Solution {
    public int findNumbers(int[] nums)
     {  int  no_of_even=0;
          if(nums.length==0)
          return 0;
        for(int i=0;i<nums.length;i++){
            no_of_even=helper(nums[i],no_of_even);
        }
        return no_of_even;
     }
     int helper(int n,int no_of_even){
            int count=0;
            while(n>0){
                n=n/10;
                count++;
            }
            if(count%2==0){
               no_of_even++; 
            }
            return no_of_even;
        }
    
}