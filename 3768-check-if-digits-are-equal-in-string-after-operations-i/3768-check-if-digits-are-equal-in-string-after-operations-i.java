class Solution {
    public boolean hasSameDigits(String s) {
       
        StringBuilder sb = new StringBuilder(s);

       
        while (sb.length() > 2) {
           
            StringBuilder nextSb = new StringBuilder();
            
           
            for (int i = 0; i < sb.length() - 1; i++)
             {
               
                int digit1 = Character.getNumericValue(sb.charAt(i));
                int digit2 = Character.getNumericValue(sb.charAt(i + 1));
                
                
                nextSb.append((digit1 + digit2) % 10);
            }
           
            sb = nextSb;
        }

       
        if (sb.length() < 2) {
            return true; 
        }

       
        return sb.charAt(0) == sb.charAt(1);
    }
}