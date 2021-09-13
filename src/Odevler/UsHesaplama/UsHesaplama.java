package Odevler.UsHesaplama;

import java.util.Scanner;

public class UsHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int high , low , result = 1;

        System.out.print("Lütfen Üssü Alınacak Sayıyı Giriniz : ");
        low  = input.nextInt();

        System.out.print("Lütfen Üs Olacak Sayıyı Giriniz : ");
        high  = input.nextInt();

        for (int i = 1 ; i<= high ; i++){
            result = result * low;
        }

        System.out.println("Sonuç : " + result);

    }
}
