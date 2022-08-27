import java.util.Scanner;

public class faktoriyel_for {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scan.nextInt();

        int faktoriyel = 1;

        for (int i=1; i<=sayi; i++){

            faktoriyel *= i;
            System.out.println("Faktöriyel: " + faktoriyel + " i= " + i );

        }
        System.out.println("Faktöriyel: " + faktoriyel );



    }
}
