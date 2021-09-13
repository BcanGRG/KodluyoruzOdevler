package Odevler.HarmonikSeriBulma;

import java.util.Scanner;

public class HarmonikSeriBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        double result = 0;

        System.out.print("N Sayısını Giriniz : ");
        n = input.nextInt();

        for (double i = 1; i<=n ; i++){
            result = result + 1/i;
        }

        System.out.println("İşlemin Sonucu : " + result);
    }
}
