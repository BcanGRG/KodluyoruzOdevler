package Odevler;

import java.util.Scanner;

public class KDVHesaplama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double anaPara ,kdvOran , sonPara , kdvTutar;
        System.out.print("Ücret Tutarını Giriniz : ");
        anaPara = input.nextInt();
        if (anaPara > 0 && anaPara <=1000){
            kdvOran = 1.18;
            sonPara = anaPara * kdvOran;
            kdvTutar = sonPara -anaPara;
            System.out.println("KDV'siz Fiyat : " + anaPara);
            System.out.println("KDV'li Fiyat : " + sonPara);
            System.out.println("KDV Tutarı : " + kdvTutar);
        }
        else if (anaPara >1000){
            kdvOran = 1.08;
            sonPara = anaPara * kdvOran;
            kdvTutar = sonPara -anaPara;
            System.out.println("KDV'siz Fiyat : " + anaPara);
            System.out.println("KDV'li Fiyat : " + sonPara);
            System.out.println("KDV Tutarı : " + kdvTutar);
        }


    }
}
