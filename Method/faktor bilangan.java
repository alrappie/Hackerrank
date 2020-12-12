import java.io.*;
import java.util.*;

//https://www.hackerrank.com/contests/live-coding-method-tif-f-2020/challenges/faktor-bilangan-1-1
public class Solution {

    public static void main(String[] args) {
        Scanner GG = new Scanner(System.in);
        int faktorDari = GG.nextInt();
        int hasil =0;
        faktorial(faktorDari,hasil);
    }
    static void faktorial(int data,int i){
        i++;
        if(i>data){
            return;
        }else{
            if(data%i==0){
                System.out.println(i);
            }
            faktorial(data, i);
        }
    }
}
