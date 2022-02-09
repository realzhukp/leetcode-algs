package algs;

public class Q097 {

    public static void main(String[] args) {

        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";
        //aadbcbbcac
        //aadbbcbcac
        //aadbbbaccc

        System.out.println(isInterleave(s1,s2,s3));;

    }

    public static boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()+s2.length()!=s3.length()){
            return false;
        }

        boolean[] result=new boolean[s2.length()+1];

        result[0]=true;

        for(int i=0;i<=s1.length();i++){
            for(int j=0;j<=s2.length();j++){
                int k=i+j-1;

                if(i>0){
                    result[j]=s1.charAt(i-1)==s3.charAt(k) && result[j];
                }
                if(j>0){
                    result[j]=(s2.charAt(j-1)==s3.charAt(k) && result[j-1]) || result[j];
                }
            }
        }
        return result[s2.length()];
    }



}




