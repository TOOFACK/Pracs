package DP1;

import java.util.Scanner;

public class day4_1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();

        int food[][] = new int[row][col];

        for (int i=0; i < row; i++){
            for (int j = 0; j < col; j++){
                food[i][j] = in.nextInt();
            }
        }


    }
}
