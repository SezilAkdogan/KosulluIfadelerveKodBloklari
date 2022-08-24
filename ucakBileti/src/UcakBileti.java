import java.util.Scanner;
public class UcakBileti {
    public static void main(String[] args) {
        int age, select;
        double km, perKm = 0.10, total, totalNew;

        Scanner input = new Scanner(System.in);

        System.out.print(" Mesafeyi km türünden giriniz : ");
        km = input.nextDouble();

        System.out.print(" Yaşınızı giriniz : ");
        age = input.nextInt();

        System.out.print(" Yolculuk tipini giriniz (1- Tek yön\n 2-Gidiş Dönüş : ");
        select = input.nextInt();

        total = km * perKm;


        if ((km >= 1) && (age > 0) && (select == 2)) {
            if (age >= 1 && age < 12) {
                totalNew = (total * 0.5 * 0.8);
                System.out.println(" toplam tutar:" + totalNew + "TL");

            } else if (age >= 12 && age < 24) {
                totalNew = (total * 0.9 * 0.8);
                System.out.println(" toplam tutar:" + totalNew + "Tl");

            } else if (age >= 24 && age <= 65) {
                totalNew = (total * 0.8);
                System.out.println(" toplam tutar:" + totalNew + "Tl");

            } else if (age > 65) {
                totalNew = (total * 0.7 * 0.8);
                System.out.println(" toplam tutar:" + totalNew + "TL");
            }

        } else if ((km >= 1) && (age > 0) && (select == 1)) {
            if (age >= 1 && age < 12) {
                totalNew = total * 0.5;
                System.out.println(" toplam tutar : " + totalNew + "TL");
            } else if (age >= 12 && age < 24) {
                totalNew = total * 0.9;
                System.out.println(" toplam tutar:" + totalNew + "TL");
            } else if (age >= 24 && age <= 65) {
                totalNew = (total);
                System.out.println(" toplam tutar:" + totalNew + "TL");
            } else if (age > 65) {
                totalNew = (total * 0.7);
                System.out.println(" toplam tutar:" + totalNew + "Tl");
            }

        }else
            System.out.println("hatalı veri girişi yaptınız");

    }
}
