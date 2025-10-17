class Solution {
    
       public void mergeTwoSortedArrays(int[] nums, int s, int m, int e) {
        // Sizes of the two subarrays
        int n1 = m - s + 1;
        int n2 = e - m;

        // Temporary arrays
        int[] left = new int[n1];
        int[] right = new int[n2];

        // Copy data into temp arrays
        for (int i = 0; i < n1; i++)
            left[i] = nums[s + i];
        for (int j = 0; j < n2; j++)
            right[j] = nums[m + 1 + j];

        // Merge the temp arrays back into nums[s..e]
        int i = 0, j = 0, k = s;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                nums[k++] = left[i++];
            } else {
                nums[k++] = right[j++];
            }
        }

        // Copy remaining elements of left[], if any
        while (i < n1) {
            nums[k++] = left[i++];
        }

        // Copy remaining elements of right[], if any
        while (j < n2) {
            nums[k++] = right[j++];
        }
    }
      
    
    public void mergeSort(int[] nums,int s ,int e)
    {
        if(s<e)
        {
            int m=s+(e-s)/2;
            mergeSort(nums,s,m);
            mergeSort(nums,m+1,e);
            mergeTwoSortedArrays(nums,s,m,e);
        }
    }

    public int[] sortArray(int[] nums)
  {
      mergeSort(nums,0,nums.length-1) ;
      return nums;  
    }
}