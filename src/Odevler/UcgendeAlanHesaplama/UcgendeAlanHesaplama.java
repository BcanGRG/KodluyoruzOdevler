package Odevler.UcgendeAlanHesaplama;

import java.util.Scanner;

public class UcgendeAlanHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a,b,c,u,alan;

        System.out.print("Üçgenin 1. Kenarını Giriniz : ");
        a = input.nextDouble();

        System.out.print("Üçgenin 2. Kenarını Giriniz : ");
        b = input.nextDouble();

        System.out.print("Üçgenin 3. Kenarını Giriniz : ");
        c = input.nextDouble();

        u = (a+b+c) / 2;

        alan = Math.sqrt((u*(u-a)*(u-b)*(u-c)));

        System.out.println("Üçgenin Alanı : " + alan);

    }


}
