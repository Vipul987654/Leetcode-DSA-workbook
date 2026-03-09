class Solution {
    public int lengthOfLongestSubstring(String s)
     {
        int maxLength=0;
        Map<Character,Integer> visitedCharacters=new HashMap<>();
        for(int right = 0, left = 0 ; right < s.length() ; right++)
        {
            if(visitedCharacters.containsKey(s.charAt(right))   // checking if the map contains the character already or not;
            && visitedCharacters.get(s.charAt(right))>=left)   //checking if the duplicate char is in the  sliding window range;
                                                               
            {
                left=visitedCharacters.get(s.charAt(right))+1;  // shifting the left pointer to one more next to the previously occured character ;
            }
            maxLength = Math.max(maxLength,right-left+1);  // calc max 
            visitedCharacters.put(s.charAt(right),right);  // update the latest index of occurence  of the character;
        }
        return maxLength;
    }
}