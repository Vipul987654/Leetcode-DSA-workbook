
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) 
    {
        
       if(nums.length==0) return null;
       if(nums.length==1){
       TreeNode root = new TreeNode(nums[0]);
       return root;
       
       } 
       return helpBST(nums,0,nums.length-1);
      

    }
    public  TreeNode helpBST(int []nums,int start,int end){
        if(start>end) 
        return null;
        int mid=(start+end)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=helpBST(nums,start,mid-1);
         root.right=helpBST(nums,mid+1,end);
         return root;

    }
}