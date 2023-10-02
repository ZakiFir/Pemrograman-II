import java.util.Scanner;

public class PRAK005_2210817110006_MohammadZakiFirmansah {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan Makanan Favorit: ");
        String makanan = in.next();
        System.out.print("Masukan Hobi: ");
        String hobi = in.next();

        System.out.println("Aku Suka Makan " + makanan + ", dan Hobiku " + hobi);
        in.close();
    }
}
