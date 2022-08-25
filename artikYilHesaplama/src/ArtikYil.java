import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        int  year;
        String artikYil = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz :");
        year = input.nextInt();

        if((year % 4) == 0) {
            artikYil = "Bir Artik Yildir";
        } else if ((year % 400 )== 0) {
            artikYil = "Bir Artik Yildir";
        }else{
            isError = true ;
        }

        if(isError==true) {
            System.out.println( + year + " Bir Artık yıl değildir. ");
        }else{
            System.out.println( + year + " Bir Artık Yıldır. ");
        }
    }
}
