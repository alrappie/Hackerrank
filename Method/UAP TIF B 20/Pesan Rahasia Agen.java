package com.tutorial;

//import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //semangat !
        Scanner s = new Scanner(System.in);
        String raw = s.nextLine().toUpperCase();
        char[] str = raw.toCharArray();
        char[] dict = new char[str.length];
        int ctrDict = 0;
        for(int i =0;i< str.length;i++){
            if(str[i] == ' '){
                System.out.print(" ");
            } else if(indexOf(dict, str[i]) != -1){//
                System.out.print(indexOf(dict, str[i]) + " ");
            } else {
                dict[ctrDict] = str[i];
                System.out.print(ctrDict + " ");
                ctrDict++;
            }
        }
    }
    static int indexOf(char[] arr, char check){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == check){
                return i;
            }
        }
        return -1;
    }
}
