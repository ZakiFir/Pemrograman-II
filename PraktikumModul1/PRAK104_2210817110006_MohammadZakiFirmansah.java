package PraktikumModul1;

import java.util.Scanner;

public class PRAK104_2210817110006_MohammadZakiFirmansah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tangan Abu: ");
        String tanganAbu = input.nextLine();
        System.out.print("Tangan Bagas: ");
        String tanganBagas = input.nextLine();

        String[] tanganAbuArr = tanganAbu.split(" ");
        String[] tanganBagasArr = tanganBagas.split(" ");

        int PAbu = 0;
        int PBagas = 0;
        for (int i = 0; i < 3; i++) {
            char tanganAbuu = tanganAbuArr[i].charAt(0);
            char tanganBagass = tanganBagasArr[i].charAt(0);
            if (tanganAbuu != tanganBagass) {
                if ((tanganAbuu == 'B' && tanganBagass == 'G') ||
                        (tanganAbuu == 'G' && tanganBagass == 'K') ||
                        (tanganAbuu == 'K' && tanganBagass == 'B')) {
                    PAbu++;
                } else {
                    PBagas++;
                }
            }
        } if (PAbu > PBagas) {
            System.out.println("Abu");
        } else if (PBagas > PAbu) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }
    }
}