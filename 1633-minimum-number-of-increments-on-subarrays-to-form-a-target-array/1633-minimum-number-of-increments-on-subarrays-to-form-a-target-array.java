class Solution {
    public int minNumberOperations(int[] target)
     {
        int ans =target[0];
        int prev=target[0];
        int n= target.length;
        for(int i=1;i<n;i++){
            if(prev<target[i]){
                ans=ans+(target[i]-prev);


            }
            prev=target[i];
        }
        return ans;
    }
}