import java.util.Scanner;
public class Java101 {
    public static void main(String[] args) {
        int n1, n2, select;
        double bolme;

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci Sayıyı Giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        n2 = input.nextInt();

        System.out.println("İşleminizi Seçiniz : ");
        System.out.println(" 1-Toplama\n 2-Çıkarma\n 3-Çarpma\n 4-Bölme");

        System.out.println("Seçim yapınız");
        select = input.nextInt();

        switch (select) {
            case 1:
            System.out.println("Toplama Sonucu : " + (n1 + n2));
            break;
            case 2:
                System.out.println("Çıkarma Sonucu : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma Sonucu : " + (n1 * n2));
                break;
            case 4: {
                if (n1!=0 && n2!=0){
                    System.out.println("Bölme Sonucu : " + (n1 / n2));
                }else{
                    System.out.println("Bölen yada Bölünen 0 Olamaz");
                }
                break;
            }
            default:
                System.out.println("Yanlış Seçim Yaptınız Tekrar Deneyiniz....");
        }

    }
}
