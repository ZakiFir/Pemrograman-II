package PraktikumModul1;
import java.util.Scanner;
public class PRAK105_2210817110006_MohammadZakiFirmansah {
    public static void main(String[] args) {
        final double PHI = 3.14;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jari-jari: ");
        double r = scanner.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double t = scanner.nextDouble();

        double volume = PHI * Math.pow(r, 2) * t;
        String output = String.format("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3\n", r, t, volume);
        System.out.print(output);
    }
}