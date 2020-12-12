package com.tutorial;

import java.util.Scanner;

//https://www.hackerrank.com/contests/latihan-method-tif-d/challenges/fungsi-fff-
public class Main {
    public static void main(String[] args) {
        Scanner GG = new Scanner(System.in);
        int fungsiN = GG.nextInt();
        int a = GG.nextInt();
        int b = GG.nextInt();
        int awal = GG.nextInt();
        cetak(fungsi(fungsiN,a,b,awal));
    }
    static int fungsi(int x, int a, int b, int awal){
        int hasil = a*awal+b;
        if (x==1)return hasil;
        return fungsi(x-1,a,b,hasil);
    }
    static void cetak(int cetakan){
        System.out.println(cetakan);
    }
}
