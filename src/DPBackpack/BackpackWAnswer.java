package DPBackpack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class BackpackWAnswer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        TreeSet<Integer> ans = new TreeSet<>();

        int weights[] = new int[N + 1];
        int values[] = new int[N + 1];

        for (int i = 1; i < N + 1; i++) {
            weights[0] = 0;
            weights[i] = in.nextInt();
        }
        for (int i = 1; i < N + 1; i++) {
            values[0] = 0;
            values[i] = in.nextInt();
        }

        int dp[][] = new int[N + 1][M + 1];

        for (int i = 0; i < N + 1; i++) {
            for (int j = 0; j < M + 1; j++) {
                dp[i][j] = 0;
            }
        }

        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < M + 1; j++) {
                dp[i][j] = dp[i - 1][j];

                if (weights[i] <= j) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - weights[i]] + values[i]);
                }
            }
        }

        for (int i = N; i > -1; i--) {
            for (int j = M; j > -1; j--) {
                if (dp[i][j] == 0) break;

                if (dp[i - 1][j] == dp[i][j]) {
                    i--;
                } else {
                    ans.add(i);
                    j = j - weights[i];
                    i--;

                }
            }
        }

        if (ans == null) {
            System.out.println(0);
        } else {
            for (int i : ans) {
                System.out.println(i);
            }
//            System.out.println('s');

        }

        for(int i = 0; i < N+1; i++){
            for (int j = 0; j < M+1; j++){
                System.out.print(dp[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }


    }




