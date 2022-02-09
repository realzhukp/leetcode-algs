package algs;

public class Q062 {

    public static void main(String[] args) {


//        ListNode node1=new ListNode()

        int m = 7;
        int n = 3;
        System.out.println(uniquePaths(m,n));

    }

    public static  int uniquePaths(int m, int n) {
        int[][] paths=new int[m][n];
        for(int i=0;i<m;i++){
            if(i==0){
                paths[0][0]=1;
                continue;
            }
            for(int j=0;j<n;j++){
                int sum=0;
                for(int k=0;k<=j;k++){
                    sum+=paths[i-1][k];
                }
                paths[i][j]=sum;
            }
        }

        int result=0;
        for(int i=0;i<n;i++){
            result+=paths[m-1][i];
        }
        return result;


    }


}


