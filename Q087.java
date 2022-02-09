package algs;

public class Q087 {

    public static void main(String[] args) {
        System.out.println(isScramble("great","rgeat"));
    }

    public static boolean isScramble(String s1, String s2) {
        StringBuffer before=new StringBuffer();
        StringBuffer change=new StringBuffer(s1);
        StringBuffer after=new StringBuffer();

        return scramble(before,change,after,s2);
    }

    public static boolean scramble(StringBuffer before,StringBuffer change,StringBuffer after,String s2){

        StringBuffer concats=new StringBuffer();
        concats.append(before).append(change).append(after);

        if(concats.toString().equals(s2)){
            return true;
        }

//        for(int i=1;i<change.length();i++){
//
//
//            before.append()
//
//        }


        return false;


    }



}


