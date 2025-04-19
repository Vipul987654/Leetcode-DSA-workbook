class Solution 
{
    public List<String> summaryRanges(int[] nums) 
    {   int n=nums.length;
       int count =0;
      List<String> res=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int start=nums[i];
            while(i+1<n && nums[i]+1==nums[i+1])
            {
            i++;
             }
           if(start!=nums[i])
           {
           // res.add(toString(start)+"->"+toString(nums[i]));
           res.add(start + "->" + nums[i]);
              }
        else
            {
           // res.add(toString(start));
           res.add(String.valueOf(start));
          
             }}
      return res;
    }
}