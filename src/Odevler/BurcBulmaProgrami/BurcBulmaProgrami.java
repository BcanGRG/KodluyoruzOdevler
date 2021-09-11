package Odevler.BurcBulmaProgrami;

import java.util.Scanner;

public class BurcBulmaProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String horoscope = "";
        int month ,day;
        System.out.print("Doğduğunuz Ayı Giriniz (1-12) : ");
        month = input.nextInt();
        System.out.print("Doğduğunuz Günü Giriniz (1-31) : ");
        day = input.nextInt();

        if (month == 1){
            if(day<22)
                horoscope = "Oğlak";
            else
                horoscope = "Kova";
        }else if (month == 2){
            if (day<20)
                horoscope = "Kova";
            else
                horoscope = "Balık";
        }else if (month == 3){
            if (day<21)
                horoscope = "Balık";
            else
                horoscope = "Koç";
        }else if(month == 4){
            if (day<21)
                horoscope = "Koç";
            else
                horoscope = "Boğa";
        }else if (month == 5){
            if (day<22)
                horoscope = "Boğa";
            else
                horoscope = "İkizler";
        }else if(month == 6){
            if (day<23)
                horoscope = "İkizler";
            else
                horoscope = "Yengeç";
        }else if (month == 7){
            if (day<23)
                horoscope = "Yengeç";
            else
                horoscope = "Aslan";
        }else if (month == 8){
            if (day<23)
                horoscope = "Aslan";
            else
                horoscope = "Başak";
        }else if (month == 9){
            if (day<23)
                horoscope = "Başak";
            else
                horoscope = "Terazi";
        }else if (month == 10){
            if (day<23)
                horoscope = "Terazi";
            else
                horoscope = "Akrep";
        }else if (month == 11){
            if (day<22)
                horoscope = "Akrep";
            else
                horoscope = "Yay";
        }else if (month == 12){
            if (day<22)
                horoscope = "Yay";
            else
                horoscope = "Oğlak";
        }

        System.out.println("Burcunuz : " + horoscope);
    }
}
