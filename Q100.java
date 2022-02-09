package algs;

import java.util.ArrayList;
import java.util.List;

public class Q100 {

    public static void main(String[] args) {

    }


    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p==null && q==null){
            return true;
        }else if(p!=null && q!=null && p.val==q.val){
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }else {
            return false;
        }



    }







}




