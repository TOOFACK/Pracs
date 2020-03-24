package DPBackpack;

import java.util.Scanner;

public class AccuratlyWeight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();
         int weights[] = new int[N+1];

         for(int i =1; i < N+1; i++){
             weights[0] = 0;
             weights[i] = in.nextInt();
         }

         int ds[][] = new int[N+1][M+1];

         for(int i = 0; i < M+1; i++){
             ds[0][i] = 0;
         }

         for(int i = 0; i < N+1; i++){
             ds[i][0] = 0;
         }

         for(int i = 1; i < N+1; i++){
             for (int j = 1; j < M+1; j++){
                 ds[i][j] = ds[i-1][j];

                 if(weights[i] <= j){
                     if(weights[i] == j){
                         ds[i][j] = j;
                     }
                     else{
                         ds[i][j] = Math.max(ds[i][j],ds[i-1][j-weights[i]] +weights[i]);
                     }
                 }
             }
         }

//        for(int i = 0; i < N+1; i++){
//            for (int j = 0; j < M+1; j++){
//                System.out.print(ds[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }

        boolean trig = false;
        for(int i = 0; i < N+1; i++){
//            System.out.println("N = " + N);
//            System.out.println("weight = " + ds[i][M]);
            if(M == ds[i][M]) {
                trig = true;
                break;
            }
        }
        System.out.println(trig == true ?"YES" : "NO");
    }
    }


