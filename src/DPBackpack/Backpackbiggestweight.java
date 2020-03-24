package DPBackpack;

import java.util.Scanner;
import java.util.TreeMap;

public class Backpackbiggestweight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int amount = in.nextInt();
        int maxWeight = in.nextInt();

        int weights[] = new int[amount+1];

        for(int i =1; i < amount+1; i++){
            weights[0] = 0;
            weights[i] = in.nextInt();
        }

        Boolean ds[][] = new Boolean[amount+1][maxWeight+1];

        ds[0][0] = true;


        for(int i =0 ;i < amount+1; i++) {
            for (int j = 0; j < maxWeight+1; j++) {
                if (i == 0 && j!= 0){
                    ds[i][j] = false;
                }
            }
        }



        for(int i =1; i < amount+1; i++){
            for(int j = 0; j < maxWeight+1; j++){


                //System.out.println(i + " @" + j);
                ds[i][j] = ds[i-1][j];
                //System.out.println("ds" + i +" " + j +" = " + "ds" +(i-1) + " "+ j + " = " + ds[i-1][j]);


                if(weights[i] <= j && ds[i-1][j-weights[i]]){
                    ds[i][j] = true;
                    //System.out.println("ds" + i + " " + j + "= " + "true");

                    //System.out.println("ds[i-1][weight[i] = " + ds[i-1][j-weights[i]]);

                    //System.out.println("true");
                }
            }
        }

        int max = -1;
        for(int i =1 ;i < amount + 1; i++){
            for(int j = 0; j < maxWeight + 1; j++) {
                if(ds[i][j] == true && j > max)
                    max = j;
            }
            }
        System.out.println(max);

    }
}
