class Solution
 {
    public int numWaterBottles(int numBottles, int numExchange) 
    {
         int Drunk= numBottles;
         while(numBottles>=numExchange){
            int  modulo = numBottles%numExchange;

            numBottles=numBottles/numExchange;
            Drunk +=numBottles;
            numBottles +=modulo;
         }
         return Drunk;
    }
}