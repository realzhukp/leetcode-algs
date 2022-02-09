package algs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Q037 {

    public static void main(String[] args) {

        char [][] board ={
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}};

        solveSudoku(board);
        System.out.println(Q036.isValidSudoku(board));


        System.out.println(1+'0');
    }

    public static void solveSudoku(char[][] board) {
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
                    if(!rowset.get(i).contains(board[i][j])){
                        rowset.get(i).add(board[i][j]);
                    }
                    int index=(i/3*3)+(j/3);
                    if(!nineset.get(index).contains(board[i][j])){
                        nineset.get(index).add(board[i][j]);
                    }
                    if(!columnset.get(j).contains(board[i][j])){
                        columnset.get(j).add(board[i][j]);
                    }
                }
            }
        }
        backtrack(board,rowset,columnset,nineset,0,0);

    }

    public  static boolean backtrack(char[][] board,List<HashSet> rowset,List<HashSet> columnset,List<HashSet> nineset,int i,int j){

        if(i==9){
            return true;
        }

        int nextj=j+1;
        int nexti=i;
        if(nextj>8){
            nexti++;;
            nextj=0;
        }

        if(board[i][j]=='.'){
            int index=(i/3*3)+(j/3);
            for(int number=1;number<=9;number++){
                char numberchar = (char)('0' + number);
                if(!rowset.get(i).contains(numberchar) && !nineset.get(index).contains(numberchar) && !columnset.get(j).contains(numberchar)){
                    rowset.get(i).add(numberchar);
                    nineset.get(index).add(numberchar);
                    columnset.get(j).add(numberchar);

                    board[i][j]=numberchar;
                    boolean result=backtrack(board,rowset,columnset,nineset,nexti,nextj);
                    if(!result){
                        board[i][j]='.';
                        rowset.get(i).remove(numberchar);
                        nineset.get(index).remove(numberchar);
                        columnset.get(j).remove(numberchar);
                    }else{
                        return true;
                    }
                }
            }
            return false;
        }else{
            return backtrack(board,rowset,columnset,nineset,nexti,nextj);
        }

    }





}


