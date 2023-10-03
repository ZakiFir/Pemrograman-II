package PraktikumModul1;

import java.util.Scanner;

public class PRAK101_2210817110006_MohammadZakiFirmansah {
    public static void  main(String[] args){
        String NamaLengkap, TempatLahir;
        int TanggalLahir, BulanLahir, TahunLahir, TinggiBadan;
        double BeratBadan;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        NamaLengkap = input.nextLine();
        System.out.print("Masukkan Tempat Lahir: ");
        TempatLahir = input.nextLine();
        System.out.print("Masukkan Tanggal Lahir: ");
        TanggalLahir = input.nextInt();
        System.out.print("Masukkan Bulan Lahir: ");
        BulanLahir = input.nextInt();
        System.out.print("Masukkan Tahun Lahir: ");
        TahunLahir = input.nextInt();
        System.out.print("Masukkan Tinggi Badan: ");
        TinggiBadan = input.nextInt();
        System.out.print("Masukkan Berat Badan: ");
        BeratBadan = input.nextDouble();

        String [] Bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

        System.out.println("Nama Lengkap " + NamaLengkap + ", Lahir di " + TempatLahir + " pada Tanggal " + TanggalLahir + " " + Bulan[BulanLahir - 1] + " " + TahunLahir);
        System.out.println("Tinggi Badan " + TinggiBadan + " cm dan Berat Badan " + BeratBadan + " kilogram");

    }
}
