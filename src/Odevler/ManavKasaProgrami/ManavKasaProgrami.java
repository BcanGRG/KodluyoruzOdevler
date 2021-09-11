package Odevler.ManavKasaProgrami;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut,elma,domates,muz,patlican , tutar;
        System.out.print("Armut kaç kilogram ? ");
        armut = input.nextDouble() ;
        System.out.print("Elma kaç kilogram ? ");
        elma = input.nextDouble() ;
        System.out.print("Domates kaç kilogram ? ");
        domates = input.nextDouble() ;
        System.out.print("Muz kaç kilogram ? ");
        muz = input.nextDouble() ;
        System.out.print("Patlıcan kaç kilogram ? ");
        patlican = input.nextDouble() ;

        tutar = (armut*2.14)+(patlican*5.00)+(elma*3.67)+(domates*1.11)+(muz*0.95);
        System.out.println("Toplam Tutar : " + tutar);
    }
}
