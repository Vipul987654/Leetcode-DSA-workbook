import java.util.HashSet;
import java.util.Set;

class Solution {
    public int singleNumber(int[] nums)
    {
        Set<Integer> hash = new HashSet<>();
        for (int i : nums) {
            if (!hash.contains(i)) {
                hash.add(i);
            } else {
                hash.remove(i);
            }
        }
        for (int num : hash) {
            return num;
        }
        return -1;
    }


    public static void main(String[] args) {
        int [] nums={1,4,1,4,5,8,5,9,8};
        Solution obj= new Solution();
        System.out.println(obj.singleNumber(nums));
    }
}

