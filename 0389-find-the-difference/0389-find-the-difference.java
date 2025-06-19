/*class Solution
 {
    public char findTheDifference(String s, String t)
     {
        int sum=0;
        for(char c :t.toCharArray()){
            sum+=c;
        }
        for(char c:s.toCharArray())
       {
            sum-=c;
            }
            return (char)(sum);

    }
}   */
class Solution
 {
    public char findTheDifference(String s, String t)
     {
        int XOR=0;
        for(char c :t.toCharArray())
        {
            XOR^=c;   
        }
        for(char c:s.toCharArray())
       {  XOR^=c; 
           
            }

            return (char)(XOR);

    }
}