import java.util.Scanner;

public class Solution {
    static boolean isItPrime(int number){
        int poin=0;
        for(int i=1; i<=number;i++){
            if(number%i==0){
                poin++;
            }
        }
        return poin !=2;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int prime = in.nextInt();
        boolean check = isItPrime(prime);
        if(!check){
            System.out.println(prime + " merupakan bilangan prima");
        }
        else{
            System.out.println(prime + " bukan merupakan bilangan prima");
        }
    }
}
