class Solution
 {
    public int maxArea(int[] height)
     {
        int leftPointer =0;
        int rightPointer=height.length-1;
        int maxWater=0;

        while(leftPointer <rightPointer)
        {  // calc area
        int currentWater= (rightPointer-leftPointer)*(Math.min(height[leftPointer],height[rightPointer]));
       // putting max val in vriablie;
        maxWater=Math.max(currentWater,maxWater);

        if(height[leftPointer]<height[rightPointer])
            leftPointer++;
        else
             rightPointer--;
        }
        return maxWater;
    }
}