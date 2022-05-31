  package zoho;

import java.util.Scanner;

public class P5 {
    static void check(int[][] arr,int row,int col,int i,int j){
        if(i<row-1){
            if(arr[i+1][j]==1){
                arr[i+1][j]=-1;
                check(arr,row,col,i+1,j);
            }
        }
        if(i>0){
            if(arr[i-1][j]==1){
                arr[i-1][j]=-1;
                check(arr,row,col,i-1,j);
            }

        }
        if(j>0){
            if(arr[i][j-1]==1){
                arr[i][j-1]=-1;
                check(arr,row,col,i,j-1);
            }
        }
        if(j<col-1){
            if(arr[i][j+1]==1){
                arr[i][j+1]=-1;
                check(arr,row,col,i,j+1);
            }
        }
        if(i<row && j<col && i>=0 && j>=0){
            if(i-1>=0 && j-1>=0) {
                if (arr[i - 1][j - 1] == 1) {
                    arr[i - 1][j - 1] = -1;
                    check(arr, row, col, i - 1, j - 1);
                }
            }
            if(i+1<row && j+1<col) {
                if (arr[i + 1][j + 1] == 1) {
                    arr[i + 1][j + 1] = -1;
                    check(arr, row, col, i + 1, j + 1);
                }
            }
            if(i+1<row && j-1>=0) {
                if (arr[i + 1][j - 1] == 1) {
                    arr[i + 1][j - 1] = -1;
                    check(arr, row, col, i + 1, j - 1);
                }
            }
            if(i-1>=0 && j+1<col) {
                if (arr[i - 1][j + 1] == 1) {
                    arr[i - 1][j + 1] = -1;
                    check(arr, row, col, i - 1, j + 1);
                }
            }
        }

    }
    static void island(int[][] arr,int row,int col){
        int c=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==1){
                    c=c+1;
                    arr[i][j]=-1;
                    check(arr,row,col,i,j);
                    for(int k=0;k<row;k++){
                        for(int l=0;l<col;l++){
                            System.out.print(arr[k][l]+" ");
                        }
                        System.out.println();
                    }
                    System.out.println("xxxxxxxxxxx");
                }
            }
        }
        System.out.println("\nOUTPUT : ");
        System.out.println(c+" Islands");
    }
    public static void main(String[] args) {
        int row=5;
        int col=5;

        int[][] arr={{1,1,0,0,0},
                     {0,1,0,0,1},
                     {1,0,0,1,1},
                     {0,0,0,0,0},
                     {1,0,1,0,1}};
        island(arr,row,col);
    }
}