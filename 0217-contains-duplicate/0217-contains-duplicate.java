class Solution 
{
    public boolean containsDuplicate(int[] nums)
     {
        HashSet<Integer> Hashset= new HashSet<>();
        for(int i :nums)
        {
            if(Hashset.contains(i))
            return true;
            else{
                Hashset.add(i);
            }
            
        }
        return false;
    }
}