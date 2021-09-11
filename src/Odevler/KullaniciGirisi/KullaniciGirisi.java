package Odevler.KullaniciGirisi;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName,password,newPassword;
        int tercih;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz : ");
        userName = input.nextLine();

        System.out.print("Şifrenizi Giriniz : ");
        password = input.nextLine();

        if (userName.equals("Bcan") && password.equals("1234")) {
            System.out.println("Giriş Yaptınız !");
        }else if(!password.equals("1234")){
            System.out.print("Şifre Yanlış Şifrenizi Sıfırlamak İster Misiniz ? (1/0) : ");
            tercih = input.nextInt();
            if (tercih == 1){
                System.out.print("Yeni Şifrenizi Giriniz : ");
                input.nextLine();
                newPassword = input.nextLine();
                String sonuc = newPassword.equals("1234") || newPassword.equals(password) ?
                        "Şifre oluşturulamadı, lütfen başka şifre giriniz" : "Şifre Oluşturuldu";
                System.out.println(sonuc);
            }
            else  if(tercih == 0){
                System.out.println("Giriş Yapılamadı .");
            }
        }
    }
}
