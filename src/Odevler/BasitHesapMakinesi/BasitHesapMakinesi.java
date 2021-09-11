package Odevler.BasitHesapMakinesi;

import java.util.Scanner;

public class BasitHesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1,n2,sonuc;
        int islem;

        System.out.print("Birinci Sayıyı Giriniz : ");
        n1 = input.nextDouble();

        System.out.print("İkinci Sayıyı Giriniz : ");
        n2 = input.nextDouble();

        System.out.println("Yapmak istediğiniz İşlemi Seçin  ");
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        islem = input.nextInt();

        switch (islem){
            case 1:
                sonuc = n1+n2;
                System.out.println("Toplama Sonucu : " + sonuc);
                break;
            case 2:
                sonuc = n1-n2;
                System.out.println("Çıkarma Sonucu : " + sonuc);
                break;
            case 3:
                sonuc = n1*n2;
                System.out.println("Çarpma Sonucu : " + sonuc);
                break;
            case 4:
                if(n2 != 0) {
                    sonuc = n1 / n2;
                    System.out.println("Bölme Sonucu : " + sonuc);
                }
                else
                    System.out.println("Bir Sayı 0 a bölünemez");
                break;

            default:
                System.out.println("Yanlış seçim yaptınız");

        }
    }
}
