import java.util.Scanner;

public class faktoriyel_while {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scan.nextInt();

        int faktoriyel= 1;

        while (sayi>0){

            faktoriyel*=sayi;
            sayi--;
        }
        System.out.println("Faktöriyel: " + faktoriyel);
    }
}
