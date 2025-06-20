class Solution 
{
    public String largestGoodInteger(String num)
    {
        char maxChar = ' '; 
        for (int i = 0; i <= num.length() - 3; i++)
         {
          
            char c1 = num.charAt(i);
            char c2 = num.charAt(i + 1);
            char c3 = num.charAt(i + 2);

            // Check if all three characters are the same
            if (c1 == c2 && c2 == c3) {
                // If this good integer's digit is greater than the current maxChar, update maxChar
                if (c1 > maxChar) {
                    maxChar = c1;
                }
            }
        }

        if (maxChar == ' ') {
            return ""; 
        } else {
        
            return new String(new char[]{maxChar, maxChar, maxChar});
        }
    }
}