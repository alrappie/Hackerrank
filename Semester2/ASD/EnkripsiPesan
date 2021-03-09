package Praktikum1.soal1;
//https://www.hackerrank.com/contests/praktikum1-asd-tif-d/challenges/enkripsi-pesan-1
import java.util.Scanner;

public class EnkripsiPesan {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String[] array = scanner.nextLine().split("");
        int x = scanner.nextInt();
        scanner.nextLine();
        String y = scanner.nextLine();

        for (int j=1;j<=x;j++) {
            String temp = array[0];
            System.arraycopy(array, 1, array, 0, array.length - 1);
            array[array.length-1]=temp;
        }
        String asdf = "";
        for (String c : array) {
            if (!c.equalsIgnoreCase(y))
                asdf+=c;
        }
        System.out.println(asdf);
    }
}
