package algs;

public class Q028 {

    public static void main(String[] args) {

        String haystack = "mississippi";
        String needle = "issip";
//        System.out.println("".startsWith(""));""
//""

        int result=strStr(haystack,needle);
        System.out.println(result);

    }

    public static int strStr(String haystack, String needle) {

        if(needle.length()==0){
            return 0;
        }

        for(int i=0;i<=haystack.length()-needle.length();i++){
            for(int j=0;j<needle.length();j++){
                if(haystack.charAt(i+j)!=needle.charAt(j)){
                    break;
                }
                if(j==needle.length()-1){
                    return i;
                }
            }
        }

        return -1;

    }




}


