class Solution 
{
    public int maximumLength(int[] nums) 
    {      int even_count=0;
           int odd_count=0;
           for(int i=0;i<nums.length;i++)
           {
                if(nums[i]%2==0 )  { even_count++;}
                else {  odd_count++;}
             }

          int altParity=1;
          int prevParity=nums[0]%2;

          for(int num :nums)
          {
            int currParity=num %2;
            if(currParity!=prevParity)
               {
                altParity ++;
                 prevParity=currParity;}
          }

          return  Math.max(odd_count, Math.max(even_count, altParity));
        }
     
    }
