class Solution 
{
    public List<String> removeAnagrams(String[] words)
     {
        List<String>list=new ArrayList<>();
        list.add(words[0]);
        for(int i=1;i<words.length;i++){
            String curr=words[i];
            String prev=list.get(list.size()-1);
            if(!isAnagram(curr,prev)){
                list.add(words[i]);
            }
        }
        return list;
    }
    public boolean isAnagram(String s1,String s2){
        char [] arr1=s1.toCharArray();
        char [] arr2=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2))
          return true;
        else
         return false;
    }
}