package com.tutorial;

//import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //semangat !
        Scanner GG = new Scanner(System.in);
        int primeX = GG.nextInt();
        int temp=0;
        long temp2=1;
        for (int i =1;i<=300;i++){
            int poin=0;
            for (int j = 1;j<=i;j++){
                if (i%j==0){
                    poin++;
                }
            }
                if (poin == 2) {
                    if (temp<primeX) {
                    temp2*=i;
                    temp++;
                }
            }
        }
        System.out.println(temp2);
    }
}
