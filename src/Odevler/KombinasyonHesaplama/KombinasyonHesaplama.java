package Odevler.KombinasyonHesaplama;

import java.util.Scanner;

public class KombinasyonHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n , r ,fakN =1 , fakR = 1 , fakNR = 1;
        double combination;

        System.out.print("Lütfen N Değerini Giriniz : ");
        n = input.nextInt();
        for (int i = 1 ; i<=n;i++){
            fakN = fakN*i;
        }

        System.out.print("Lütfen R Değerinin Giriniz : ");
        r = input.nextInt();
        for (int i = 1 ; i<=r;i++){
            fakR = fakR*i;
        }

        for (int i=1 ; i<=(n-r) ; i++){
            fakNR = fakNR * i;
        }
        combination = fakN / (fakR * fakNR);

        System.out.println(n + " kombinasyon " + r + " = " + combination);


    }
}
