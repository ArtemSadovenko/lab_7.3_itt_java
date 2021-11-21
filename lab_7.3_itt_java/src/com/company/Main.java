package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void  create(int[][] a, int col, int row, int l, int h) {
        Random rn = new Random();
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                a[i][j] = l + rn.nextInt() % (h - l + 1);
            }
        }
    }

    public static void print(int[][] a, int row, int col ) {
        for (int i = 0; i < row; i++) {
            System.out.print("|");
            for (int j = 0; j < col; j++) {
                System.out.printf("%4d" ,a[i][j]);

            }
            System.out.print( "|");
            System.out.println();
        }
        System.out.println();
    }

    public static int count(int[][] a, int row, int col) {
        int p = 0;
        for (int i = 0; i < row; i++) {
            int u = 0;
            for (int j = 0; j < col; j++) {
                if (a[i][j] == 0) {
                    p++;
                    break;
                }
            }
        }
        return p;
    }

    public static int num(int[][] a, int row, int col,  int j_max) {
        int a_same = a[0][0]+1;
        int mp = 0;
        int max = 0;
        for (int j = 0; j < col; j++) {
            for (int i = 0; i < row; i++) {
                if (a[i][j] == a_same) {
                    mp += 1;

                    if (mp > max) {
                        max = mp;
                        j_max = j;
                    }
                }
                else {
                    a_same = a[i][j];
                    mp = 0;
                }
            }
            if(j < col-1){
                a_same = a[0][j+1]+1;
            }
            mp = 0;
        }
        return j_max;
    }



    public static void main(String[] args) {
        int k;
        int n;

        Scanner scan = new Scanner(System.in);
        k = scan.nextInt();
        n = scan.nextInt();

        int l = 0;
        int h = 2;

        int j_max;
        int q;

        int[][] a = new int [k][n];

        create(a, n, k, l, h);

        print(a, k, n);

        q = count(a, k, n);
        System.out.println("num = "+ q);

        j_max = num(a, k, n, 0);
        System.out.println("j_max = "+ (j_max+1));
    }

}

