import java.io.*;
import java.util.*;
// https://www.hackerrank.com/contests/lc-array-asd-tif-e/challenges/isi-dari-indeks/submissions/code/1331326650
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[]array = new int[length];
        for(int i =0; i<length;i++){
            array[i]=scanner.nextInt();
        }
        int output = scanner.nextInt();
        for(int i =0; i<output;i++){
                int temp = scanner.nextInt();
            for(int j =0;j<length;j++){
                if(temp>=length){
                    System.out.println("Error");
                    break;
                }else if(temp==j){
                    System.out.println(array[j]);
                }
            }
        }
    }
}
