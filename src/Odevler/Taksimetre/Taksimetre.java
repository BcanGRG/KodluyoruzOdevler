package Odevler.Taksimetre;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mesafe , acilisUcret = 10 , toplamUcret , kmPer = 2.20 , odenecekUcret;
        System.out.print("Gidilen Mesafeyi Giriniz : ");
        mesafe = input.nextDouble();

        toplamUcret = acilisUcret + (mesafe * kmPer);

        if (toplamUcret < 20){
            odenecekUcret = 20;
        }else{
            odenecekUcret = toplamUcret;
        }

        System.out.println("Ödenecek Tutar : " + odenecekUcret);


   }
}
