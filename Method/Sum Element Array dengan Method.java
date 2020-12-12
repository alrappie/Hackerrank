import java.util.*;

//https://www.hackerrank.com/contests/evaluasi-materi-array-dan-method/challenges/sum-element-array-dengan-method
public class Solution {
    public static void main(String[] args) {
        // Bagian gunanya untuk menangani input array, jadi tidak perlu diubah jika tidak diperlukan.
        Scanner scan = new Scanner(System.in);
        String inputArray = scan.nextLine();

        String[] arrayStr = inputArray.split(""); // -> split digunakan untuk memecah String
        int[] arrayInt = new int[arrayStr.length]; // Ini array yg dipakai untuk parameter method.
        int counter = 0;

        for (String val : arrayStr) {
            arrayInt[counter] = Integer.parseInt(val);
            counter++;
        }
      
      	// Panggil method return value
        System.out.println(asd(arrayInt));
    }
  
  	// Bikin method return value
    static int asd(int[] fd){
        int hasil=0;
        for(int i=0;i<fd.length;i++){
            hasil+=fd[i];
        }
        return hasil;
    }
  	
}
