class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode s=q.poll();
                temp.add(s.val);
                if(s.left!=null){
                    q.add(s.left);
                }
                if(s.right!=null){
                    q.add(s.right);
                }
            }
            list.add(temp);

        }
        
        Collections.reverse(list);
        return list;

    }
}