package Greedy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class lec2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mas[] = new int[2];

        mas[0] = in.nextInt();
        mas[1] = in.nextInt();

        int[] time = new int[mas[1]];

        for(int i = 0; i < time.length; i++){
            time[i] = Integer.parseInt(in.next());
        }
        Arrays.sort(time);
        System.out.println(check(time,mas[0]));

    }
    public static int check(int[] mas, int time){
        int res = 0;
        int kol = 0;
        for (int i = 0; i < mas.length; i++){
            res += mas[i];
            if (res <= time)
                kol+=1;
            else
                break;
        }
        return kol;
    }
}
