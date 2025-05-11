class Solution {
    public long minSum(int[] nums1, int[] nums2) 
    {
        long sum1=0,sum2=0;
        int zerocount1=0,zerocount2=0;
        for(int i :nums1){
            sum1=sum1+i;
            if(i==0){
                zerocount1++;
                sum1+=1;
            }
        }
          for(int i :nums2){
            sum2=sum2+i;
            if(i==0){
                zerocount2++;
                sum2+=1;
            }
        }

        if(sum1>sum2 && zerocount2==0) return -1;
        if(sum1<sum2 && zerocount1==0) return -1;
        else 
        return Math.max(sum1,sum2);
    }
}