package algs;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Q095 {

    public static void main(String[] args) {
        generateTrees(3);

    }

    public static HashSet<Integer> set=new HashSet<>();

    public static List<TreeNode> generateTrees(int n) {

        List<TreeNode> result= generate(n,0,9);
        return result;
    }

    public static List<TreeNode> generate(int n,int min,int max){

        List<TreeNode> list=new ArrayList<>();

        for(int k=1;k<=n;k++){
            if(set.contains(k) || k<min || k>max) continue;
            set.add(k);
            List<TreeNode> left=generate(n,min,k);
            List<TreeNode> right=generate(n,k,max);
            if(left.size()==0){
                for(int i=0;i<right.size();i++){
                    TreeNode newNode=new TreeNode(k);
                    list.add(newNode);
                    newNode.right=right.get(i);
                }
            }
            if(right.size()==0){
                for(int i=0;i<left.size();i++){
                    TreeNode newNode=new TreeNode(k);
                    list.add(newNode);
                    newNode.left=left.get(i);
                }
            }

            for(int i=0;i<left.size();i++){
                for(int j=0;j<right.size();j++){
                    TreeNode newNode=new TreeNode(k);
                    list.add(newNode);
                    newNode.left=left.get(i);
                    newNode.right=right.get(j);
                }
            }
            set.remove(k);

        }
        return list;


    }


    public static TreeNode copy(TreeNode node){
        TreeNode newNode=new TreeNode(node.val);
        if(node.left!=null){
            newNode.left=copy(node.left);
        }
        if(node.right!=null){
            newNode.right=copy(node.right);
        }
        return newNode;
    }





}




