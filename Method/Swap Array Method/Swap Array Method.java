import java.util.Scanner;

//https://www.hackerrank.com/contests/evaluasi-materi-array-dan-method/challenges/swap-array-3
public class Solution {
    public static void main(String[] args) {
        // Bagian gunanya untuk menangani input array, jadi tidak perlu diubah jika tidak diperlukan.
        Scanner scan = new Scanner(System.in);
        String inputArray = scan.nextLine();
        int idxA = scan.nextInt();
        int idxB = scan.nextInt();

        String[] arrayStr = inputArray.split("");
        int[] arrayInt = new int[arrayStr.length]; // Ini array yg dijadikan parameter method.
        int counter = 0;

        for (String val: arrayStr) {
            arrayInt[counter] = Integer.parseInt(val);
            counter++;
        }
          
        // Buat variabel untuk index dan panggil method disini
        method(arrayInt, idxA, idxB);
    }
    
    static void method(int[] arr, int idxA, int idxB){
        int temp = arr[idxA];
        arr[idxA] = arr[idxB];
        arr[idxB] = temp;
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
