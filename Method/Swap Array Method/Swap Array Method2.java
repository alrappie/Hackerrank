import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Bagian gunanya untuk menangani input array, jadi tidak perlu diubah jika tidak diperlukan.
        Scanner scan = new Scanner(System.in);
        String inputArray = scan.nextLine();
        int idxA = scan.nextInt();
        int idxB = scan.nextInt();

        // Buat variabel untuk index dan panggil method disini
        method(inputArray, idxA, idxB);
    }

    static void method(String array, int idxA, int idxB){
        char[] arr = array.toCharArray();
        char temp = arr[idxA];
        arr[idxA] = arr[idxB];
        arr[idxB] = temp;
        for(char i : arr){
            System.out.print(i + " ");
        }
    }
}
