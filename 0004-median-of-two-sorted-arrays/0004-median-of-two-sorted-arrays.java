class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int l1 = nums1.length;
        int l2 = nums2.length;

        int arr[] = new int[l1 + l2];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < l1 && j < l2)
        {
            if(nums1[i] > nums2[j])
            {
                arr[k] = nums2[j];
                j++;
            }
            else
            {
                arr[k] = nums1[i];
                i++;
            }
            k++;
        }

        while(i < l1)
        {
            arr[k] = nums1[i];
            i++;
            k++;
        }

        while(j < l2)
        {
            arr[k] = nums2[j];
            j++;
            k++;
        }

        int n = l1 + l2;

        if(n % 2 == 0)
        {
            return (arr[n/2] + arr[n/2 - 1]) / 2.0;
        }
        else
        {
            return arr[n/2];
        }
    }
}