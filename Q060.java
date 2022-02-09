package algs;

import java.util.ArrayList;
import java.util.List;

public class Q060 {

    public static void main(String[] args) {


        int n = 4;
        int k = 9;
        System.out.println(getPermutation(n,k));

    }

    public static String getPermutation(int n, int k) {

            List<Integer> possibility=new ArrayList<>();
            List<Integer> indexes=new ArrayList<>();
            StringBuffer s=new StringBuffer();

            for(int i=1;i<=n;i++){
                if(i==1){
                    possibility.add(0);
                }else if(i==2){
                    possibility.add(1);
                }else{
                    possibility.add((i-1)*(possibility.get(i-2)));
                }
                indexes.add(i);
            }
            for(int i=possibility.size()-1;i>=0;i--){
                int poss=possibility.get(i);
                int index=0;
                while(indexes.get(index)<0){
                    index++;
                }

                while(poss>0 && k>poss){
                    index++;
                    while(indexes.get(index)<0){
                        index++;
                    }
                    k=k-poss;
                }

                s.append(indexes.get(index));
                indexes.set(index,-1);

            }

            return s.toString();

    }


}


