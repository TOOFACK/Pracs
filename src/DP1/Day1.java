package DP1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        int n = in.nextInt();
        for (int i = 2; i < n +1; i++){
            list.add(list.get(i-1) + list.get(i-2));
        }
        System.out.println(list.get(n));
    }
}
