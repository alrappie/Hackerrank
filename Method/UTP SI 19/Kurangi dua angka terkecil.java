import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner GG = new Scanner(System.in);
        int maxData = GG.nextInt();
        int[] data = new int[maxData];
        for (int i=0;i<data.length;i++){
            data[i]=GG.nextInt();
        }
        method(data);
    }
    static void method(int[]data){
        Arrays.sort(data);
        System.out.println(((data[1]-data[0])));
    }
}
