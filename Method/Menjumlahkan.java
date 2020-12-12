import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner GG = new Scanner(System.in);
        int N = GG.nextInt();
        
        print(totalPenjumlahan(N));
    }
    static int totalPenjumlahan(int x){
        if(x==1){
            return x;
        }else{
            return x+totalPenjumlahan(x-1);
        }
    }
    static void print(int x){
        System.out.println(x);
    }
}
