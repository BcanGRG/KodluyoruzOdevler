package Odevler.SinifGecme;

import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dersSayisi = 5,gecmeNotu = 55 ;
        double mat,fizik,turk,kimya,muzik,ortalama;

        System.out.print("Matematik Notunu Giriniz : ");
        mat = input.nextDouble();
        if (mat<0 || mat>100){
            dersSayisi--;
            mat = 0;
        }

        System.out.print("Fizik Notunu Giriniz : ");
        fizik = input.nextDouble();
        if (fizik<0 || fizik>100){
            dersSayisi--;
            fizik = 0;
        }

        System.out.print("Türkçe Notunu Giriniz : ");
        turk = input.nextDouble();
        if (turk<0 || turk>100){
            dersSayisi--;
            turk = 0;
        }

        System.out.print("Kimya Notunu Giriniz : ");
        kimya = input.nextDouble();
        if (kimya<0 || kimya>100){
            dersSayisi--;
            kimya=0;
        }

        System.out.print("Müzik Notunu Giriniz : ");
        muzik = input.nextDouble();
        if (muzik<0 || muzik>100){
            dersSayisi--;
            muzik=0;
        }
        System.out.println("Hesaplanacak Ders Sayısı : "+ dersSayisi);
        ortalama = (mat+fizik+turk+kimya+muzik) / dersSayisi;

        System.out.println("Ortalama : " + ortalama);
        String durum = ortalama > gecmeNotu ? "Geçti" : "Kaldı";
        System.out.println(durum);
    }
}
