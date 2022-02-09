package algs;

import java.util.*;

public class Q017 {

    public static void main(String[] args) {

        String digits = "23";

        List<String> list=letterCombinations(digits);
        list.forEach(x->{
            System.out.println(x);
        });

    }

    public static List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<String>();
        if (digits.length() == 0) {
            return combinations;
        }
        Map<Character, String> phoneMap = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        backtrack(combinations, phoneMap, digits, 0, new StringBuffer());
        return combinations;
    }

    public static void backtrack(List<String> combinations, Map<Character, String> phoneMap, String digits, int index, StringBuffer combination) {
        if (index == digits.length()) {
            combinations.add(combination.toString());
        } else {
            char digit = digits.charAt(index);
            String letters = phoneMap.get(digit);
            int lettersCount = letters.length();
            for (int i = 0; i < lettersCount; i++) {
                combination.append(letters.charAt(i));
                backtrack(combinations, phoneMap, digits, index + 1, combination);
                combination.deleteCharAt(index);
            }
        }
    }


    public static List<String> letterCombinations2(String digits) {
        List<String> list=new ArrayList<>();

        String[] values={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        List<String> temp=new ArrayList<>();

        for(char x:digits.toCharArray()){
            temp.add(values[x-'2']);
        }



        for(String s:temp){
            List<String> temp2=new ArrayList<>();
            list.forEach(x->{
                temp2.add(x);
            });
            list.clear();

            for(char c:s.toCharArray()){
                if(temp2.size()==0){
                    list.add(String.valueOf(c));
                }else{
                    temp2.forEach(x->{
                        list.add(x+c);
                    });
                }

            }
        }


        return list;
    }




}
