package Odevler.TekSayilarinToplami;

import java.util.Scanner;

public class TekSayilarinToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while (true){
            System.out.print("Lütfen bir sayı giriniz : ");
            int number = input.nextInt();
            if (number % 2 == 0){
                if (number % 4 == 0){
                    sum = sum + number;
                }
            }else {
                System.out.println("Program Sonlandırılıyor ...");
                break;
            }
        }
        System.out.println("Çift ve 4'ün katı olan sayıların toplamı : " + sum);
    }
}
