import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner GG = new Scanner(System.in);
        String data = GG.nextLine();
        char[]z = data.toCharArray();
        method(z);
    }
    static void method(char[]z){
        do {
            int value=0;
            for (int i =0; i<z.length;i++) {
                value += Character.getNumericValue(z[i]);
            }
            z=Integer.toString(value).toCharArray();
        }while (z.length>1);
        System.out.println(z);
    }
}
