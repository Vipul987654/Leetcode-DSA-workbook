class Solution {
    public int maxLengthBetweenEqualCharacters(String s) 
    {
      int length=-1;
      for(int i=0;i<=s.length()-2;i++){
        for(int j=i+1;j<=s.length()-1;j++){
            if(s.charAt(i)==s.charAt(j)){
                  length =Math.max(length,j-i-1);
            }
        }
      } 
      return length; 
    }
}