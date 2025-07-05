
class Solution {
 
    
    public int findLucky(int[] originalArray) {
      
        Map<Integer, Integer> valueCounts = new HashMap<>();
        for (int value : originalArray) {
            
            valueCounts.put(value, valueCounts.getOrDefault(value, 0) + 1);
        }

        int maxLuckyNumber = -1;

        for (Map.Entry<Integer, Integer> entry : valueCounts.entrySet()) {
            int number = entry.getKey();     
            int frequency = entry.getValue(); 

           
            if (number == frequency && number > maxLuckyNumber) {
                maxLuckyNumber = number; 
            }
        }
     
        return maxLuckyNumber;
    }
}
