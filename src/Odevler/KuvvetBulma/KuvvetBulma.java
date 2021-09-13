package Odevler.KuvvetBulma;

import java.util.Scanner;

public class KuvvetBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz : ");
        int number = input.nextInt();

        System.out.print("4'ün Kuvvetleri : ");
        for (int i = 1 ; i<=number ;i*=4){
            System.out.print(i + ",");
        }

        System.out.println();

        System.out.print("5'in Kuvvetleri : ");
        for (int i = 1 ; i<=number ;i*=5){
            System.out.print(i + ",");
        }

    }
}
