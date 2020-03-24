package DP1;

import java.util.Scanner;

public class day3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int Imax = in.nextInt();
//*ввод с клавиатуры числа ступенек*

       int DP[] = new int[Imax];

        for(int i=0; i<Imax; i++){
            ///Ввод с клавиатуры стоимости ступеньки DP[i]
            DP[i] = in.nextInt();
        }

        for(int i=2; i<DP.length; i++){
            DP[i]+=Math.min(DP[i-1], DP[i-2]);
        }

        System.out.println(DP[Imax-1]);
    }
}
