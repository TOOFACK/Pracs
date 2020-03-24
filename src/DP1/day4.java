package DP1;

import java.util.Scanner;

public class day4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int con = in.nextInt();
        int coins[][] = new int[row][con];
        int farmedCoins[][] = new int[row][con];
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < con; j++) {
                coins[i][j] = in.nextInt();
            }
        }
        for(int i = 0; i < row; i++){
            for(int j = 0; j < con; j++){
                if(i ==0 && j == 0){
                    farmedCoins[0][0] = coins[0][0];
                }
                else if(i ==0){
                    farmedCoins[0][j] =  farmedCoins[0][j-1] + coins[0][j];
                }
                else if(j ==0){
                    farmedCoins[i][0] =  farmedCoins[i-1][0] + coins[i][0];
                }
                else{
                    farmedCoins[i][j] = Math.max(farmedCoins[i-1][j],farmedCoins[i][j]) + coins[i][j];
                }

            }

        }
        System.out.println(farmedCoins[row-1][con-1]);
    }
}
