import java.util.Scanner;
public class Java101 {
    public static void main(String[] args) {
        int fizik, kimya, biyoloji, mat, muzik;

        double average;

        Scanner input = new Scanner(System.in);

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();

        if (fizik>=0 && fizik <=100) {
            System.out.print("Fizik Notu : " + fizik);
        }else {
            fizik = 0;
        }

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();

        if (kimya>=0 && kimya <=100) {
            System.out.print("kimya Notu : " + kimya);
        }else {
            kimya = 0;
        }

        System.out.print("Biyoloji notunuz : ");
        biyoloji = input.nextInt();

        if (biyoloji>=0 && biyoloji <=100) {
            System.out.print("Biyoloji Notu : " + biyoloji);
        }else {
            biyoloji = 0;
        }

        System.out.print("Mat notunuz : ");
        mat = input.nextInt();

        if (mat>=0 && mat <=100) {
            System.out.print("Mat Notu : " + mat);
        }else {
            mat = 0;
        }

        System.out.print("Müzik notunuz : ");
        muzik = input.nextInt();

        if (muzik>=0 && muzik <=100) {
            System.out.print("Muzik Notu : " + muzik);
        }else {
            muzik = 0;
        }

    average = (fizik + kimya + biyoloji + mat + muzik)/5;

        System.out.println("Ortalama: "+ average);
        if (average<55) {
            System.out.println("Kaldınız");
        }else {
            System.out.println("Gectiniz");
        }


    }
}
