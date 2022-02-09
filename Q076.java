package algs;

import java.util.HashMap;

public class Q076 {

    public static void main(String[] args) {

        System.out.println(minWindow("ADOBECODEBANC","ABC"));
    }

    public static String minWindow(String s, String t) {

        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<t.length();i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }

        int left=-1;
        int right=0;

        int min=s.length();

        String result="";

        HashMap<Character,Integer> map2=new HashMap<>();
        int count=0;

        while(right<s.length()){
            if(map.containsKey(s.charAt(right))){
                if(left==-1){
                    left=right;
                }
                map2.put(s.charAt(right),map2.getOrDefault(s.charAt(right),0)+1);
                if(map2.get(s.charAt(right))>map.get(s.charAt(right))){
                    while(!map.containsKey(s.charAt(left)) || map2.get(s.charAt(left))>map.get(s.charAt(left))){
                        if(map.containsKey(s.charAt(left))){
                            map2.put(s.charAt(left),map2.get(s.charAt(left))-1);
                        }
                        left++;
                    }
                }else{
                    count++;
                }
                if(count==t.length()){
                    int length=right-left+1;
                    if(length<=min){
                        min=length;
                        result=s.substring(left,right+1);
                    }
                }
            }
            right++;
        }

        return result;


    }






}


