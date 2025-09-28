/* class Solution {
    public boolean isIsomorphic(String s, String t)
     {
       if(s.length()!=t.length())
       return false;    

       Map <Character,Character>map=new HashMap<>();

       for(int i=0;i<s.length();i++)
       {
          char key= s.charAt(i);
          char val= t.charAt(i);

            if(!map.containsKey(key))
            {
                if(!map.containsValue(val))
                      map.put(key,val);
              }
        else{
            char  x = map.get(key);
            if(x !=val)
                return false;
            }
       }
       return true;
    }
}*/
import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> mapST = new HashMap<>();
        Map<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // Check s -> t mapping
            if (mapST.containsKey(c1)) {
                if (mapST.get(c1) != c2) {
                    return false;
                }
            } else {
                mapST.put(c1, c2);
            }

            // Check t -> s mapping (to prevent two keys mapping to same value)
            if (mapTS.containsKey(c2)) {
                if (mapTS.get(c2) != c1) {
                    return false;
                }
            } else {
                mapTS.put(c2, c1);
            }
        }

        return true;
    }
}
