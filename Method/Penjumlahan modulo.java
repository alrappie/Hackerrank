import java.io.*;
import java.util.*;

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
