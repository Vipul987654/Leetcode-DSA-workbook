class Solution {
    public int reverse(int x) {
        
        
        int rev =0;
        while ( x!=0)
        {
         int    d = x % 10;
            
            x=x/10;
            if( rev >0 && rev >(Integer.MAX_VALUE - d)/10  || rev <0 && rev< (Integer.MIN_VALUE-d)/10)
           {return 0;} 
           rev= rev *10+d;
        }
        return rev;
    }
}