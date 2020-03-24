import java.util.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();

        int ds[][] = new int[N+1][M+1];

        for(int i = 0; i < N+1; i++) {
            for (int j = 0; j < M + 1; j++) {
                ds[i][j] = i + j;
            }
        }

        for(int i = 0; i < N+1; i++){
            for (int j = 0; j < M+1; j++){
                System.out.print(ds[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    }


