package algs;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class Q094 {

    public static void main(String[] args) {

        generateTrees(3);

    }

    public static List<TreeNode> generateTrees(int n) {
        return generate(1,n);
    }



    public static List<TreeNode >generate(int start,int end){

        List<TreeNode> result=new ArrayList<>();

        if(end<start){
            result.add(null);
            return result;
        }

        for(int i=0;i<=end-start;i++){

            List<TreeNode> leftnodes=generate(start,start+i-1);
            List<TreeNode> rightnodes=generate(start+i+1,end);

            for(TreeNode left:leftnodes){
                for(TreeNode right:rightnodes){
                    TreeNode root=new TreeNode(start+i);
                    root.left=left;
                    root.right=right;
                    result.add(root);
                }
            }
        }
        return  result;

    }



}
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
}


