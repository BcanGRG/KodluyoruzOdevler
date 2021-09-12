package Odevler.GirilenSayiyaKadarCift;

import java.util.Scanner;

public class GirilenSayiyaKadarCift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0 ,flag = 0;
        System.out.print("Sayı Giriniz : ");
        int number = input.nextInt();

        for (int i =1; i<=number; i++){
            if(i % 3 == 0 && i % 4 == 0){
                System.out.println("Sayılar : " + i + " ");
                sum = sum + i;
                flag++;
            }
        }

        System.out.println("Ortalama : " + (sum/flag));

    }
}
