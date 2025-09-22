
class Solution 
{
    public List<List<Integer>> levelOrderBottom(TreeNode root) 
    {
         List lst = new ArrayList();
         if(root==null)
         {
             return lst;
         }
        Queue<TreeNode> que= new LinkedList<>();

        que.offer(root);
       
        while(!que.isEmpty())

        {     
             List<Integer> level=new ArrayList<>();
             int n=que.size();
             for(int i=0;i<n;i++)
             {
                 TreeNode head = que.poll();
                 level.add(head.val);
                 if(head.left!=null)
                 que.offer(head.left);

                 if(head.right!=null)
                 que.offer(head.right);

             }
            lst.add(0,level);      
        }
        return lst;
    }
}