class Solution {
    public String reverseVowels(String s)

    {  
         Set<Character>set=new HashSet<>();

         set.add('a'); set.add('A');
         set.add('e'); set.add('E');
         set.add('i'); set.add('I');
         set.add('o'); set.add('O');
         set.add('u'); set.add('U');

         int i=0;
          
         char []arr = s.toCharArray();
         int j= arr.length-1;


         while(i<j){
            if(!set.contains(arr[i]) ){
                    i++;
                    continue;
            }
            if(!set.contains(arr[j])){
                j--;
                continue;
            }
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
            String myString = String.valueOf(arr);
            return myString;

    }

}