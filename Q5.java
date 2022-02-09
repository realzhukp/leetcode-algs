package algs;

public class Q5 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        String result=convert("A",1);
        System.out.println(result);

    }

    public static String convert(String s, int numRows) {

        //(row*2-2)*i +1
        //row/2==0
        //(row*2-2)*i+

        //3 1
        //4 2
        //5 3
        //6 4

        int count=s.length()/numRows+1;
        int loopcount=numRows*2-2;
        if(loopcount==0){
            return s;
        }

        String result="";
        // for(int i=0;i<count;i++){
        //     int index=(numRows*2-2)*i;
        //     if(index<s.length()){
        //         result+=s.charAt(index);
        //     }
        // }


        for(int j=0;j<numRows;j++){
            for(int i=0;i<count;i++){
                int index1=loopcount*i+j;
                int index2=loopcount*(i+1)-j;

                if((index2-index1)%loopcount==0){
                    if(index1<s.length()){
                        result+=s.charAt(index1);
                    }
                }else{
                    if(index1<s.length()){
                        result+=s.charAt(index1);
                    }
                    if(index2<s.length()){
                        result+=s.charAt(index2);
                    }
                }
            }
        }

        // for(int i=0;i<count;i++){
        //     int index=(numRows*2-2)*i+numRows-1;
        //     if(index<s.length()){
        //         result+=s.charAt(index);
        //     }
        // }
        return result;

    }



}
