package Array2D;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {

        String[][] names = {
                {"Sam", "Smith", "Sam"},
                {"Robert", "Delgro"},
                {"James", "Gosling", "Jake"},
        };
        names[0][0] = "Julia";
        names[0][1] = "Julia";
        names[2][2] = "John";
// for (TYPEOFARRAY[]  yourVariable : nameOfArray)
        for (String[] name : names) {
            for (String n : name) {
                n = "J";
                System.out.println(n);
            }
        }
        System.out.println(Arrays.deepToString(names));




        int[][] a = {
                {1, -2, 3},
                {-4, -5, 6, 9},
                {7},
        };
        for (int[] innerArray: a) {
            for(int data: innerArray) {
                if (data < 0){
                    data = data *(-1);
                }
                System.out.println(data);
            }
        }
        System.out.println(Arrays.deepToString(a));




        int[][] board = new int[3][3]; // int array by default zeros
        System.out.println(Arrays.deepToString(board));
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = i + j;  // i = 0 ; j = 0  board[0][0] = 0+0
                // i = 0 ; j = 1   board[0][1] = 0+1;
            }
        }
        System.out.println(Arrays.deepToString(board));


        char k [][]= {
                {'a','b'},
                {'c','d','y','o','r','p'},
                {'e','q','w'}
        };
        for (int row = 0; row < a .length; row++) {
            for (int col = 0; col < a [row] .length; col++) {
                if (a[row][col]=='a' || a[row][col]=='e' ||  a[row][col]=='o' || a[row][col]=='i'   || a[row][col]=='y'  || a[row][col]=='u'  ){
                    System.out.print(a[row][col] + " ");



                    int columns = 2;
                    int rows = 2;
                    String[][] newArray = new String[columns][rows];  //{{null,null},{null,null}}
                    newArray[0][0] = "France";
                    newArray[0][1] = "Blue";
                    newArray[1][0] = "Ireland";
                    newArray[1][1] = "Green";
                    boolean isPresent = false;
                    String word = "France";
                    for(int i = 0; i < newArray.length; i++){
                        for(int j = 0; j < newArray[i].length; j++){
                            if( newArray[i][j].equals(word)){
                                isPresent= true;
                                System.out.println(isPresent);
                                break; //inner
                            }
                            System.out.println("here");
                        }
                    }
                    if (isPresent==false){
                        System.out.println("No word found");




                        int intArray[][] = {{1, 2, 2, 3},{ 2, 5, 6, 6,5}};
                            //Arrays.sort(intArray);
                        for(int i = 0 ; i < intArray.length; i++){
                            for (int j = 0; j< intArray[i].length-1;j++) {
                                if(intArray[i][j] == intArray[i][j+1] ) {
                                    System.out.println("Duplicate element: " + intArray[i][j] + ", at index [" + i  +"] [" + (j+1) +"]" );}
                            }
                        }

                    }

                }
            }
        }
    }
    }

