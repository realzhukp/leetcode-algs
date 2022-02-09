package algs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Q036 {

    public static void main(String[] args) {

        //7123456
        int[] nums = {1,3,5,6};
        int target = 0;


        char [][] board ={
                {'.','.','4','.','.','.','6','3','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'5','.','.','.','.','.','.','9','.'},
                {'.','.','.','5','6','.','.','.','.'},
                {'4','.','3','.','.','.','.','.','1'},
                {'.','.','.','7','.','.','.','.','.'},
                {'.','.','.','5','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'}};

        boolean result=isValidSudoku(board);

        System.out.println(result);

    }

    public static boolean isValidSudoku(char[][] board) {

        List<HashSet> rowset=new ArrayList<>();
        List<HashSet> columnset=new ArrayList<>();
        List<HashSet> nineset=new ArrayList<>();

        for(int i=0;i<9;i++){
            rowset.add(new HashSet<Character>());
            columnset.add(new HashSet<Character>());
            nineset.add(new HashSet<Character>());
        }

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if(rowset.get(i).contains(board[i][j])){
                        return false;
                    }else{
                        rowset.get(i).add(board[i][j]);
                    }
                    int index=(i/3*3)+(j/3);
                    if(nineset.get(index).contains(board[i][j])){
                        return false;
                    }else{
                        nineset.get(index).add(board[i][j]);
                    }
                    if(columnset.get(j).contains(board[i][j])){
                        return false;
                    }else{
                        columnset.get(j).add(board[i][j]);
                    }
                }
            }
        }

        return true;
    }



}


