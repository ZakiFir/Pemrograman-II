package PraktikumModul1;

import java.util.Scanner;

public class PRAK102_2210817110006_MohammadZakiFirmansah {
    public static void main(String[] args) {
        int jumlahDeret = 0;
        int angka;
        Scanner input = new Scanner(System.in);

        System.out.print("");
        angka = input.nextInt();
        int i = 0;
        while (i <= 10) {
            if (angka % 5 == 0) {
                jumlahDeret = angka / 5 - 1;
            } else {
                jumlahDeret = angka;
            }
            System.out.print(jumlahDeret);
            if (i < 10) {
                System.out.print(", ");
            }
            angka++;
            i++;
        }
    }
}