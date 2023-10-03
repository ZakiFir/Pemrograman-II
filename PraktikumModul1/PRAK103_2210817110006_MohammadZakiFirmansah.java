package PraktikumModul1;

import java.util.Scanner;

public class PRAK103_2210817110006_MohammadZakiFirmansah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("");
        int deret = input.nextInt();
        System.out.print("");
        int angka = input.nextInt();
        int i = 0;
        do {
            if (angka % 2 == 1) {
                System.out.print(angka);
                if (i < deret - 1) {
                    System.out.print(", ");
                }
                i++;
            }
            angka++;
        } while (i < deret);
    }
}
