import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        //semangat !
        Scanner GG = new Scanner(System.in);
        String data = GG.nextLine();
        String[]splitData = data.split(" ");
        String keyWord = GG.next();
        int temp=0;
        for (int i =0;i<splitData.length;i++){
            if (splitData[i].contains(keyWord)){
                System.out.println(splitData[i]);
                temp++;
            }
        }
        if (temp==0){
            System.out.println("TIDAK ADA NAMA YANG DITEMUKAN!!");
        }else if (temp==1){
            System.out.println("ANTON INGAT NAMANYA!");
        }else {
            System.out.println("ANTON PUSING!!");
        }
    }
