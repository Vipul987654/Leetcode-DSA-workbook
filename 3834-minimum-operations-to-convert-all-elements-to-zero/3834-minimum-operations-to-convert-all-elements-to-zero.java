class Solution {
    public int minOperations(int[] nums) 

    { Stack<Integer>stk=new Stack<>();
    int count=0;
    for(int x:nums){
        while(!stk.isEmpty()&&stk.peek()>x){
            stk.pop();
            count++;
        }
        if((x!=0)  &&(stk.isEmpty()||stk.peek()!=x)){
            stk.push(x);
        }
    } 
      return count+stk.size();

    }
}