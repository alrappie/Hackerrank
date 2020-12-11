package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String tugas = in.nextLine();
        String[] tugasArray = tugas.split(" ");
        removeDuplicates(tugasArray);
    }
    static void removeDuplicates(String[] arr){
        String dsa="";
        for (int i =0;i<arr.length;i++){
            String kata = arr[i];
            dsa+=dsa.contains(kata)?"":kata+" ";
        }
        System.out.println(dsa);
    }
}
