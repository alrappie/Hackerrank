import java.io.*;
import java.util.*;

public class Solution {
     public static void main(String[] args) {
        Scanner GG = new Scanner(System.in);
        int numberN = GG.nextInt();
        if(numberN==0){
            System.out.println("Kereta tidak bisa dibuat jika tidak ada lokomotif");
        }else{
            String command = GG.next();
            int[] panjangGerbong = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

            switch (command){
                case "detach":
                    int detachNumber = GG.nextInt();
                    if (detachNumber<=1){
                        System.out.println("Lokomotif tidak bisa dilepas");
                    }else{
                        if (detachNumber>numberN){
                            System.out.println("Gerbong kereta tidak ada");
                            for (int i = 0; i < numberN; i++) {
                                System.out.print(panjangGerbong[i] + " ");
                            }
                        }else if (detachNumber<=numberN){
                            for (int i =0;i<detachNumber-1;i++){
                                System.out.print(panjangGerbong[i] + " ");
                            }
                        }
                    }
                    break;
                case "rotate":
                    System.out.print(panjangGerbong[0]+" ");
                    for(int i =numberN;i>1;i--){
                        System.out.print(i+" ");
                    }
                    break;
            }
        }
    }
}
