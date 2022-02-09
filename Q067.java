package algs;

public class Q067 {

    public static void main(String[] args) {


//        ListNode node1=new ListNode()

        int m = 7;
        int n = 3;

        System.out.println(addBinary("100","110010"));

    }

    public static String addBinary(String a, String b) {

        StringBuffer s=new StringBuffer();

        int max=a.length()>b.length()?a.length():b.length();

        int carry=1;
        for(int i=0;i<max;i++){

            int num1=a.length()-1-i>=0?a.charAt(a.length()-1-i)-'0':0;
            int num2=b.length()-1-i>=0?b.charAt(b.length()-1-i)-'0':0;
            s.append((num1+num2)%2);
            carry=(num1+num2)/2;
        }
        if(carry==1){
            s.append(1);
        }

        return s.reverse().toString();
    }







}


