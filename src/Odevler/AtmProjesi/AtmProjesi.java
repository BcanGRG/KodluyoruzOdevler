package Odevler.AtmProjesi;

import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        String userName , password;
        Scanner input = new Scanner(System.in);
        int right = 3 , balance = 1500 , select;

        while(right > 0){
            System.out.print("Kullanıcı Adınız : ");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("Bcan") && password.equals("1234")){
                System.out.println("Merhaba Kodluyoruz Bankasına Hoşgeldiniz ....");

                do {
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n"+
                            "4-Çıkış Yap"
                            );
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    switch (select) {
                        case 1 -> {
                            System.out.print("Para Miktarı : ");
                            int price = input.nextInt();
                            balance = balance + price;

                        }
                        case 2 -> {
                            System.out.print("Para Miktarı : ");
                            int price = input.nextInt();
                            if (price > balance)
                                System.out.println("Bakiye Yetersiz !!!");
                            else
                                balance = balance - price;

                        }
                        case 3 -> {
                            System.out.println("Bakiyeniz : " + balance);

                        }
                    }
                }while (select != 4);
                System.out.println("Çıkış Yapılıyor...");
                System.out.println("Tekrar Görüşmek Üzere");
                break;

            }else {
                right--;
                System.out.println("Hatalı Kullanıcı Adı veya Şifre Tekrar Deneyiniz.");
                if (right == 0){
                    System.out.println("Hesabınız Bloke Olmuştur.");
                }else
                    System.out.println("Kalan Hakkınız : " + right);
            }
        }
    }
}
