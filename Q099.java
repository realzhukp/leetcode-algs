package algs;

import java.util.ArrayList;
import java.util.List;

public class Q099 {

    public static void main(String[] args) {

        TreeNode node1=new TreeNode(1);
        node1.left=new TreeNode(3);
        node1.left.right=new TreeNode(2);

        recoverTree(node1);
    }


    public static void recoverTree(TreeNode root) {

        List<TreeNode> list=new ArrayList<>();

        midLoop(root,list);

        TreeNode node1=null;
        TreeNode node2=null;

        for(int i=1;i<list.size();i++){
            if(list.get(i-1).val>list.get(i).val){

                if(node2!=null){
                    node2=list.get(i);
                }else{
                    node1=list.get(i-1);
                    node2=list.get(i);
                }


            }
        }

        switchValue(node1,node2);

    }

    public static void switchValue(TreeNode node1,TreeNode node2){
        int temp=node1.val;
        node1.val=node2.val;
        node2.val=temp;
    }

    public static void midLoop(TreeNode root,List<TreeNode> list){

        if(root.left!=null){
            midLoop(root.left,list);
        }
        list.add(root);
        if(root.right!=null){
            midLoop(root.right,list);
        }
    }







}




