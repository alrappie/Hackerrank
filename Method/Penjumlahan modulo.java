import java.io.*;
import java.util.*;

//https://www.hackerrank.com/contests/live-coding-method-tif-f-2020/challenges/penjumlahan-modulo
public class Solution {
    
    public static void main(String[] args) {
        Scanner GG = new Scanner(System.in);
        int N = GG.nextInt();
        int[]array=new int [N];
        for(int i=0;i<N;i++){
            array[i]=GG.nextInt();
        }

        pengolahan(array,N);
    }
    static void pengolahan (int[] data,int N){
        int hasil=0;
        for (int i =0;i<N;i++){
            hasil += data[i];
        }
        System.out.println(hasil-N);
    }
}
