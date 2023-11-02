package PRAK301_2210817110006_MohammadZakiFirmansah;
import java.util.Scanner;

public class MainSoal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dadu dadu = new Dadu();
        int inputUser = input.nextInt();

        dadu.setInput(inputUser);
        dadu.acakNilai();
        dadu.totalDadu();
    }
}