class Solution {
    public int nextBeautifulNumber(int n) 
    {
        int num=n+1;
        while(true){
            if(isBalanced(num))return num;
             num++;
        }
       
    }
    private boolean isBalanced(int num){

        String s =String.valueOf(num);
        int arr[]=new int [10];

        for(char ch: s.toCharArray()){
            arr[ch-'0']++;
        }

        for(char ch : s.toCharArray()){
            int d =ch-'0';
            if(arr[d]!=d)return false;

        }
        return true;
    }
}