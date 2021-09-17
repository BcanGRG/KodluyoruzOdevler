package Odevler.Ebob_Ekok;

import java.util.Scanner;

public class Ebob_Ekok {
    public static void main(String[] args) {
        int ebob = 1, n1 ,n2 , flag =1 , ekok;
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci Sayıyı Giriniz : ");
        n1 = input.nextInt();

        System.out.print("İkinci Sayıyı Giriniz : ");
        n2 = input.nextInt();


        while(flag <= n1 && flag <=n2 ){
            if (n1%flag==0 && n2%flag ==0)
                ebob = flag;
            flag ++;
        }
        ekok = (n1*n2) / ebob;
        System.out.println("Ebob : " + ebob);
        System.out.println("Ekok : " + ekok);
    }
}
