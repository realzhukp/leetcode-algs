package algs;

import java.util.ArrayList;
import java.util.List;

public class Q093 {

    public static void main(String[] args) {

        restoreIpAddresses("172162541");

    }

    public static List<String> restoreIpAddresses(String s) {

        List<String> result=new ArrayList<>();
        StringBuffer stringBuffer=new StringBuffer(s);
        dft(result,stringBuffer,s,0,0);
        return  result;

    }


    public static void dft(List<String> result,StringBuffer stringBuffer,String s,int index,int count){

        if(count==3){
            int temp=Integer.valueOf(s.substring(index));
            if(temp<=255 && s.charAt(index)!='0' || index==s.length()-1){
                result.add(stringBuffer.toString());
            }
        }else{

            for(int i=1;i<=3 && index+i<s.length() ;i++){
                if(i!=1 && s.charAt(index)=='0'){
                    return;
                }
                int temp=Integer.valueOf(s.substring(index,index+i));
                if(s.length()-i-index<=((3-count)*3) && temp<=255){
                    stringBuffer.insert(index+i+count,'.');
                    dft(result,stringBuffer,s,index+i,count+1);
                    stringBuffer.deleteCharAt(index+i+count);
                }
            }
        }
    }



}


