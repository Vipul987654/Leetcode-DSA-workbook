class Solution 
{
    public int maxFrequencyElements(int[] arr) 
    {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) 

            {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }

        int maxFrequency = 0;
        for (int frequency : frequencyMap.values()) {
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
            }
        }

          int sumOfFrequencies = 0;
          int countOfMaxFrequencies = 0;

        for (int frequency : frequencyMap.values()) 
          {
            if ( frequency == maxFrequency)
                 {
                sumOfFrequencies += frequency;
                countOfMaxFrequencies++;
                 }
           }

        if (countOfMaxFrequencies > 1)
              {
            return sumOfFrequencies;
              }
         else
           {
            return maxFrequency;
           }
    }
}