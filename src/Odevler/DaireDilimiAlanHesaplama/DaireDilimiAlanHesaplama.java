package Odevler.DaireDilimiAlanHesaplama;

import java.util.Scanner;

public class DaireDilimiAlanHesaplama {
    public static void main(String[] args) {
        double yaricap , merkezAci , pi = 3.14 , alan;
        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin Yarıçapını Giriniz : ");
        yaricap = input.nextDouble() ;

        System.out.print("Dairenin Merkez Açısını Giriniz : ");
        merkezAci = input.nextDouble();

        alan = (pi*(yaricap*yaricap)*merkezAci)/360;

        System.out.println("Daire Diliminin Alanı : " + alan);
    }
}
