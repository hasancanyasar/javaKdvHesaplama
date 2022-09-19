import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kdvOran = 0.18, kdvOran2 = 0.08;
        double tutar;
        Scanner input = new Scanner(System.in);
        System.out.println("Ücreti Giriniz :");
        tutar = input.nextDouble();

        double toplamKDV = ( tutar >= 1000 ) ? tutar * kdvOran2 : tutar * kdvOran;
        System.out.println("Tutar: " + tutar);
        System.out.println("Toplam KDV : " + toplamKDV);
        System.out.println("KDV Dahil Tutar : " + (tutar + toplamKDV));

    }
}