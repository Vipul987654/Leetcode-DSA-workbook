class Solution {
public:
    int canCompleteCircuit(vector<int>& gas, vector<int>& cost)
     {  int totdiff=0, diff=0,fuel=0,index=0;

     for(int i=0;i< gas.size();i++){
            diff= gas[i]-cost[i];
            totdiff +=diff;
            fuel +=diff;

            if(fuel <0){
                    index=i+1;
                    fuel=0;
            }



     }
      return totdiff <0 ? -1:index;  
    }
};