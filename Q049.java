package algs;

import java.util.*;

public class Q049 {

    public static void main(String[] args) {

        String[] strs={"eat", "tea", "tan", "ate", "nat", "bat"};

        System.out.println(groupAnagrams(strs));

    }



    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result=new ArrayList<>();

        HashMap<String,Integer> map=new HashMap<>();

        for(int i=0;i<strs.length;i++){

            char [] chars=strs[i].toCharArray();
            Arrays.sort(chars);
            String temp=String.valueOf(chars);
            if(map.containsKey(temp)){
                List<String> list=result.get(map.get(temp));
                list.add(strs[i]);
            }else{
                List<String> list=new ArrayList();
                list.add(strs[i]);
                result.add(list);
                map.put(temp,result.size()-1);
            }

        }

        return result;
    }



}


