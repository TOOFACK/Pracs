package DPBackpack;

import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int values[] = new int[N + 1];

        for (int i = 1; i < N + 1; i++) {
            values[0] = 0;
            values[i] = in.nextInt();
        }

        int S = in.nextInt();

        int ds[][] = new int[N+1][S+1];
        int info[][] = new int[N+1][S+1];

        for(int i = 1; i < N+1; i++){
            for (int j = 1; j < S+1; j++){
                ds[i][j] = ds[i-1][j];

                if(values[i] <= j){
                    if(values[i] == j){
                        ds[i][j] = j;
                    }
                    else{
                        ds[i][j] = Math.max(ds[i][j],ds[i][j-values[i]] +values[i]);
                    }
                }

                if(ds[i][j] == j){
                    int val = j;
                    int index = i;
                    while(val > 0){
                        val = val - values[index];
                        info[i][values[index]]++;
                        while(val < values[index]){
                            index--;
                        }
                        val = val- values[index];
                        info[i][values[index]]++;
                    }
                }
            }

        }

        for(int i = 0; i < N+1; i++){
            for (int j = 0; j < S+1; j++){
                System.out.print(ds[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println(" ");

        for(int i = 0; i < N+1; i++){
            for (int j = 0; j < S+1; j++){
                System.out.print(info[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
