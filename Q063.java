package algs;

public class Q063 {

    public static void main(String[] args) {


//        ListNode node1=new ListNode()

        int m = 7;
        int n = 3;

        int[][] obstacleGrid =
                {
                        {0,0,0,0,0,1,0,1,0,0,0,0,1,0,0,0,0,0},
                        {0,0,0,0,0,0,1,0,0,0,0,1,0,1,0,1,0,0},
                        {1,0,0,0,0,0,1,0,0,0,0,0,1,0,1,1,0,1},
                        {0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0},
                        {0,0,0,0,0,1,0,0,0,0,1,1,0,1,0,0,0,0},
                        {1,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,1,0},
                        {0,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,0,0},
                        {0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                        {1,1,0,0,0,0,0,0,0,0,1,0,0,0,0,1,0,0},
                        {0,0,1,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0},
                        {0,1,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0},
                        {0,0,1,0,0,0,0,1,0,0,0,0,0,1,0,0,0,1},
                        {0,1,0,1,0,1,0,0,0,0,0,0,0,1,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1},
                        {1,0,1,1,0,0,0,0,0,0,1,0,1,0,0,0,1,0},
                        {0,0,0,1,0,0,0,0,1,1,1,0,0,1,0,1,1,0},
                        {0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                        {0,1,1,0,0,1,0,0,0,0,0,0,0,1,1,0,0,0},
                        {0,0,0,0,0,0,1,0,1,0,0,1,0,1,1,1,0,0},
                        {0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,1,1},
                        {0,1,0,0,0,0,0,0,0,0,1,0,1,0,1,0,1,0},
                        {1,0,0,1,0,1,0,0,1,0,0,0,0,0,0,0,0,0},
                        {0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0},
                        {0,1,0,0,0,0,0,1,0,0,0,0,0,0,1,1,1,0},
                        {1,0,1,0,1,0,0,0,0,0,0,1,1,0,0,0,0,1},
                        {1,0,0,0,0,0,1,1,0,0,0,1,0,0,0,0,0,0}};

        System.out.println(uniquePathsWithObstacles(obstacleGrid));

    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;

        int[][] paths=new int[m][n];

        int firstcolumnobstacle=-1;
        for(int i=m-1;i>=0;i--){
            if(obstacleGrid[i][n-1]==1){
                firstcolumnobstacle=i;
                break;
            }
        }
        int firstrowobstacle=-1;
        for(int i=n-1;i>=0;i--){
            if(obstacleGrid[m-1][i]==1){
                firstrowobstacle=i;
                break;
            }
        }

        for(int i=m-1;i>firstcolumnobstacle;i--){
            paths[i][n-1]=1;
        }
        for(int i=n-1;i>firstrowobstacle;i--){
            paths[m-1][i]=1;
        }

        for(int i=m-2;i>=0;i--){
            for(int j=n-2;j>=0;j--){
                if(obstacleGrid[i][j]==1){
                    paths[i][j]=0;
                }else{
                    paths[i][j]=paths[i+1][j]+paths[i][j+1];
                }
            }
        }

        return paths[0][0];

    }


}


