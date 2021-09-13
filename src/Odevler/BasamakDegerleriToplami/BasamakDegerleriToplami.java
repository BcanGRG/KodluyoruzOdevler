package Odevler.BasamakDegerleriToplami;

import java.util.Scanner;

public class BasamakDegerleriToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, digitValue, result = 0;

        System.out.print("Bir Sayı Girin: ");
        n = input.nextInt();

        while (n != 0) {
            digitValue = n % 10;
            result += digitValue;
            n /= 10;
        }

        System.out.println("Basamak Sayılarının Toplamı: " + result);
    }
}
