class Solution {
  

         public String makeFancyString(String s) {
       
        StringBuilder fancyString = new StringBuilder();

       
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

         
            if (fancyString.length() >= 2 && fancyString.charAt(fancyString.length() - 1) == currentChar && 
                  fancyString.charAt(fancyString.length() - 2) == currentChar) {
                   continue;
            } 
            else
             {
               
                fancyString.append(currentChar);
            }
        }

       
        return fancyString.toString();
        
    }
}