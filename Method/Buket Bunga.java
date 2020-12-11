import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String bunga = in.nextLine();
        char[] warnaBunga = bunga.toCharArray();

        if (warnaBunga.length > 3) {
            print(pengolahan(warnaBunga.length, warnaBunga.length - 3));
        } else if(warnaBunga.length == 3){
            print(1);
        }else
            print(0);
    }

    static int faktorial(int data) {
        if (data == 1) {
            return data;
        }
        return data * faktorial(data - 1);
    }

    static void print(int data) {
        System.out.println("Jumlah kemungkinannya yaitu : " + data);
    }

    static int pengolahan(int data1, int data3) {
        return faktorial(data1) / (faktorial(3) * faktorial(data3));
    }
}
