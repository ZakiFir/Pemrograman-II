package PRAK201_2210817110006_MohamamdZakiFirmansah;

public class Soal1Main {
    public static void main(String[] args) {
        Buah Apel = new Buah("Apel", 0.4, 7000, 40);
        Buah Mangga = new Buah("mangga", 0.2, 3500, 15);
        Buah Alpukat = new Buah("alpukat", 0.25, 10000, 12);

        Apel.display();
        Mangga.display();
        Alpukat.display();
    }
}
