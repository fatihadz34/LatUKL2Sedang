import java.util.Scanner;

public class latukl2sedang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double volume;
        System.out.println("Masukkan jari-jari: ");
        double jari = input.nextDouble();
        System.out.println("Masukkan tinggi: ");
        double tinggi = input.nextDouble();
        volume = hitungVolTabung(jari, tinggi);
        System.out.println("volume tabung adalah: " + volume);
    }

    public static double hitungVolTabung (double jari, double tinggi) {
        double volume;
        volume = Math.PI * jari * jari * tinggi;
        return volume;
    }

}
