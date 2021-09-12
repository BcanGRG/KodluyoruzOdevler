package Odevler.UcakBiletiHesaplama;

import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        double age , distance , kmPrice = 0.10 , firstPrice,lastPrice;
        int tripType;

        System.out.print("Mesafeyi km türünden giriniz : ");
        distance = input.nextDouble();

        System.out.print("Yaşınızı giriniz : ");
        age = input.nextDouble();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş) : ");
        tripType = input.nextInt();

        firstPrice = distance * kmPrice;
        lastPrice = firstPrice;

        if(tripType == 1 || tripType ==2){
            if (tripType == 2)
                lastPrice = lastPrice * 0.8 *2 ;
        }else
            System.out.println("Hatalı Veri Girdiniz !");

        if (distance>=0){
            if(age<12)
                lastPrice = lastPrice * 0.5;
            else if (age>=12 && age<=24)
                lastPrice = lastPrice * 0.9;
            else if (age>65)
                lastPrice = lastPrice * 0.7;
            System.out.println("Toplam Tutar : " + lastPrice);
        }else
            System.out.println("Hatalı Veri Girdiniz !");

    }
}
