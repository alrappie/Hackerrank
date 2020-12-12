import java.util.Scanner;
import java.util.Arrays;

public class mainClass {
    static void sortName(String [] arr){
        String temp;
        for(int i =0;i<arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if(arr[i].compareTo(arr[j]) > 0){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String initialName = in.nextLine();
        String[] stringarr = initialName.split(" ");
        sortName(stringarr);
        for(String a : stringarr){
            System.out.print(a+" ");
        }
    }
}
