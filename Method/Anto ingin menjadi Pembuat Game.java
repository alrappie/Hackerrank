import java.io.*;
import java.util.*;

//https://www.hackerrank.com/lc-method-tif-d
public class Solution {
    public static void main(String[] args) {
        Scanner GG = new Scanner(System.in);
        int health = GG.nextInt();
        int banyakN = GG.nextInt();
        String[]skill = new String[banyakN];
        for(int i =0;i<banyakN;i++){
            skill[i]=GG.next();
        }
        print(sisahDarah(banyakN,health,skill));
    }
    
    static int sisahDarah(int n,int darah,String[] data){
        for(int i=0;i<n;i++){
            if (data[i].equalsIgnoreCase("punch")){
                darah-=30;
                // System.out.println(darah);
            }else{
                darah-=(darah*10)/100;
                // System.out.println(darah);
            }
        }
        return darah;
    }
    
    static void print(int data){
        if (data<=0){
            System.out.println("Monster mati");
        }else
            System.out.println(data);
    }
}
