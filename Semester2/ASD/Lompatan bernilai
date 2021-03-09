package Praktikum1.soal1;
//https://www.hackerrank.com/contests/praktikum1-asd-tif-d/challenges/lompatan-bernilai
import java.util.Scanner;

public class LompatanBernilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int jump   = scanner.nextInt();
        int[] array= new int[length];
        int poin = 1,  tot = 0, index = jump;

        while (array[index]==0){
            array[index] = poin;
            index+=jump;
            if (index>=length){
                index -=length;
            }
            poin++;
        }

        for (int i =0;i<length;i++){
            tot += array[i];
        }
        System.out.println(tot);
    }
}
