class Solution {
    public boolean isPowerOfTwo(int n)
     {  
        if(n<=0)  return false; // base case which i forgot to consider ;

         if (n==1){
             return true;
         }
           // check if subproblem is furthur divisible or not ;
         if(n%2==0){
               return isPowerOfTwo(n/2); // recursive call;

        }
       // if condition fails then return false ;
        else 
        return false;


    }
}