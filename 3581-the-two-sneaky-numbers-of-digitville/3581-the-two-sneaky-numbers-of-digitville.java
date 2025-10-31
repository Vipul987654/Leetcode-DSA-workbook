class Solution {
    public int[] getSneakyNumbers(int[] nums) 
    {  int []ans=new int[2];
      int i=0;
        Set<Integer>set=new HashSet<>();
        for(int x :nums){
            if(set.contains(x))
            { ans[i]=x;
                i++;  
           } 
           else set.add(x);

        }
        return ans;
    }
}