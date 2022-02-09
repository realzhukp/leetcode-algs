package algs;

public class Q070 {

    public static void main(String[] args) {


        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;


//        System.out.println(c(6,6));
        System.out.println(climbStairs(1));

    }

    public static int climbStairs(int n) {

        int result=0;

        int up=0;
        int down=n;
        while(up<=down){
            result+=c(up,down);
            down--;
            up++;
        }
        return result;
    }

    public static int c(int up,int down){

        long result=1;
        for(int i=0;i<up;i++){
            result*=down;
            result/=i+1;
            down--;
        }

        return (int)result;
    }







}


