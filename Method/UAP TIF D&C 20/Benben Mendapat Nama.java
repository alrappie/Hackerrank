import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner GG = new Scanner(System.in);
        String data = GG.next();
        String[] split = data.split("");
        String[] benben = {"b", "e", "n", "b", "e", "n"};
        method(benben, split);
    }
    
    static void method(String[]benben,String[]split){
        int poin=0;
        int temp=0;
        int index=0;
        for (int i =0;i<split.length;i++){
            for (int j =temp;j<split.length;j++){
                if (split[j].contains(benben[index])){
                    temp=j;
                    poin++;
                    index++;
//                   System.out.println(temp);
                    break;
                }
            }
            if (poin%6==0){
                index=0;
            }
        }
        System.out.println(poin/6);
    }
}
