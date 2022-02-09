package algs;

public class Q098 {

    public static void main(String[] args) {


    }

    public static boolean isValidBST(TreeNode root) {

        return judge(root,Integer.MIN_VALUE,Integer.MAX_VALUE);

    }


//[3,1,5,0,2,4,6]
//    [5,1,4,null,null,3,6]

    public static boolean judge(TreeNode root,int min,int max){

        if(root.right==null && root.left==null){
            return true;
        }

        boolean left=true;
        boolean right=true;
        if(root.left!=null){
            if(root.left.val<=min || root.left.val>=max || root.left.val>=root.val){
                return false;
            }
            left=judge(root.left,min,root.val);
        }
        if(root.right!=null){
            if(root.right.val<=min || root.right.val>=max || root.right.val<=root.val){
                return false;
            }
            right=judge(root.right,root.val,max);
        }
        return left && right;

    }







}




