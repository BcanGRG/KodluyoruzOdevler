package Odevler.Max_Min_Hesaplama;

import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int chance , max = 0  , min=0 , number ;

        System.out.print("Kaç Tane Sayı Gireceksiniz : ");
        chance = input.nextInt();

        for (int i = 1; i<= chance ; i++){
            System.out.print(i + ". Sayıyı giriniz : ");
            number = input.nextInt();
            if (i == 1) {
                min = number;
                max = number;
            }
            if (number > max)
                max = number;
            if(number < min)
                min = number;
        }

        System.out.println("En büyük sayı : " + max);
        System.out.println("En küçük sayı : " + min);
    }
}
