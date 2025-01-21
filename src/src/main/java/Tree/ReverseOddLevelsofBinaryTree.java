package Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
         this.right = right;
     }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
public class ReverseOddLevelsofBinaryTree {

    public static TreeNode reverseOddLevels(TreeNode root) {
        ArrayDeque<TreeNode> queue=new ArrayDeque<>();
        queue.push(root);
        int level=0;
        while(!queue.isEmpty()){
            int size= queue.size();
            ArrayList<TreeNode> list=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr=queue.getFirst();
                queue.pop();
                list.add(curr);
                if(curr.left!=null) queue.push(curr.left);
                if(curr.right!=null) queue.push(curr.right);
            }
            if(level%2==1){
                int n=list.size();
                for(int i=0;i<n/2;i++){
                    swap(list,i,n-i-1);
                }
            }
            level++;
        }
        return root;
    }

    public static  void swap(ArrayList<TreeNode> list,int i,int j){
        int temp=list.get(i).val;
        list.get(i).val=list.get(j).val;
        list.get(j).val=temp;

    }
    public static void main(String[] args) {
    TreeNode root=new TreeNode(2);
    root.left=new TreeNode(3);
    root.left.left=new TreeNode(8);
    root.left.right=new TreeNode(13);
    root.right=new TreeNode(5);
    root.right.left=new TreeNode(21);
    root.right.right=new TreeNode(34);
        System.out.println(reverseOddLevels(root));
    }
}
