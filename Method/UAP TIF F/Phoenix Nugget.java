import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        //semangat !
        Scanner GG = new Scanner(System.in);
        String line = GG.nextLine();
        String[]split = line.split("");
        int poin=0;
        for (int i =0;i< split.length;i++) {
            if (split[i].contains("0") || split[i].contains("9")||split[i].contains("4")||split[i].contains("6")) {
                poin++;
            }else if (split[i].contains("8")){
                poin++;
                poin++;
            }
        }
        System.out.println(poin);
    }
}
