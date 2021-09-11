package Odevler.HavaSicakligiEtkinlik;

import java.util.Scanner;

public class HavaSicakligiEtkinlik {
    public static void main(String[] args) {
        double heat;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Hava Sıcaklığını Giriniz : ");
        heat = input.nextDouble();
        if(heat < 5){
            System.out.println("Kayak Yapabilirsiniz...");
        }else if (heat >= 5 && heat <= 15){
            System.out.println("Sinemaya Gidebilirsiniz");
        }else if (heat > 15 && heat <= 25){
            System.out.println("Pikniğe Gidebilirsiniz");
        }else if (heat > 25){
            System.out.println("Yüzmeye Gidebilirsiniz");
        }
    }
}
