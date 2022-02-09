package algs;

import java.util.ArrayList;
import java.util.List;

public class Q068 {

    public static void main(String[] args) {


        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;


        System.out.println(fullJustify(words,maxWidth));

    }

    public static List<String> fullJustify(String[] words, int maxWidth) {

        List<String> result=new ArrayList<>();

        int start=0;
        int end=0;
        int count=0;

        while (end<words.length){

            if(end==words.length-1){
                StringBuffer s=new StringBuffer();

            }else{

            }

            count+=words[end].length()+1;

            if(count>=maxWidth){
                StringBuffer s=new StringBuffer();
                int extraspace=maxWidth-count;

            }
        }





        return result;
    }







}


