class Solution 
{
    public int smallestNumber(int n) 
    {  int setNumber=1;  // 1,11,111,1111,11111...  1,3,7,15,...

        while(setNumber <n){
            setNumber=2*setNumber+1;
        }
        return setNumber;
    }
}