package algs;

public class Q014 {

    public static void main(String[] args) {

//        int[] x={1,8,6,2,5,4,8,3,7};
//        int[] x={1,2,1};

        String[] x = {"acc","aaa","aaba"};

        System.out.println(longestCommonPrefix2(x));

    }

    public static String longestCommonPrefix2(String[] strs) {

        if(strs==null ||strs.length==0 ){
            return "";
        }
        String result=strs[0];
        for(int i=0;i<strs.length-1;i++){
            result=matchfunc(result,strs[i+1]);

            if(result.length()==0){
                break;
            }
        }

        return result;
    }

    public static String matchfunc(String a,String b){
        StringBuilder s=new StringBuilder();
        for(int i=0;i<Math.min(a.length(),b.length());i++){
            if(a.charAt(i)==b.charAt(i)){
                s.append(a.charAt(i));
            }else{
                break;
            }
        }
        return s.toString();
    }

    public static String longestCommonPrefix(String[] strs) {

        String result="";
        int index=1;

        if(strs.length>0){

            while(index<=strs[0].length()){
                String prefix=strs[0].substring(0,index);
                boolean notmatch=false;
                for(int i=1;i<strs.length;i++){
                    if(!strs[i].startsWith(prefix)){
                        notmatch=true;
                        break;
                    }
                }
                if(notmatch){
                    return strs[0].substring(0,index-1);
                }
                index++;
            }
            return strs[0];

        }



        return result;
    }




}
