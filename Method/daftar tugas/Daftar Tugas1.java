import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String tugas = in.nextLine();
        String[] tugasArray = tugas.split(" ");
        removeDuplicates(tugasArray);
    }
    static void removeDuplicates(String[] arr){
        StringBuilder stringBuilder = new StringBuilder();
        for (String kata : arr){
            stringBuilder.append(stringBuilder.toString().contains(kata)?"":kata+" ");
        }
        System.out.println(stringBuilder);
    }
}
