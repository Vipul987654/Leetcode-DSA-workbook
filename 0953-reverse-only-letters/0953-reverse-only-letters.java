class Solution
 {
       
    public String reverseOnlyLetters(String s)
     {
        char[] nums=s.toCharArray();
        int j=nums.length-1; int i=0;
        
         while(i<j){
         if(!Character.isLetter(nums[i])){i++ ;}

        else   if(!Character.isLetter(nums[j])){
              j--; }
         else{
        // swapping both;
           char temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;

             }
        }

      
      return new String(nums);
        
    }
}