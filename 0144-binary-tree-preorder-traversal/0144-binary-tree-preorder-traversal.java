
class Solution {
    public List<Integer> preorderTraversal(TreeNode root)
     {  ArrayList<Integer> list=new ArrayList<>();
         preorderHelper(list,root);
         return list;
        
    }
   private void preorderHelper(ArrayList<Integer> list, TreeNode root) {
    if (root == null)
        return;
    list.add(root.val);
   
    preorderHelper(list,root.left);
    preorderHelper(list,root.right);
}
}