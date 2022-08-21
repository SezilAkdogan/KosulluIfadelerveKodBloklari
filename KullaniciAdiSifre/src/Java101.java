import javax.swing.*;
import java.util.Scanner;
public class Java101 {
    public static void main(String[] args) {
        String userName, password, newPassword;
        int select;


        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adı Giriniz:");
        userName = input.nextLine();

        System.out.print("Şifre Giriniz:");
        password = input.nextLine();

        if (userName.equals("sezillerce") && password.equals("sezil123")) {
            System.out.println("Giriş Başarılı");
        } else {
            System.out.println("Şifre Yanlış " +
                    " Şifre Sıfırlamak ister misiniz ? " + " Şifre sıfırlamak için 1'e\n istemezseniz 2 ye tıklayınız ");
            select = input.nextInt();

            if (select == 1) {
                System.out.println("yeni şifre giriniz: ");
                Scanner kb = new Scanner(System.in);
                newPassword = kb.nextLine();
                if (newPassword.equals("sezil123")) {
                    System.out.println("Eski şifreyi girdiniz işlem başarısız");
                } else {
                    System.out.println("şifre değiştirildi.");
                }

            }else {
                System.out.println("Sıfırlama işlemi yapılmadı.");
            }
        }
    }
}