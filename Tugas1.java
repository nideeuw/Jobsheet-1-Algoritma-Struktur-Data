import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        char[] kode = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T'};
        String[] kota = {"BANTEN", "JAKARTA", "BANDUNG", "CIREBON", "BOGOR", "PEKALONGAN", "SEMARANG", "SURABAYA", "MALANG", "TEGAL"};

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        char plat = input.next().toUpperCase().charAt(0);
        input.close();

        boolean found = false;
        for (int i = 0; i < kode.length; i++) {
            if (kode[i] == plat) {
                System.out.println("Kota: " + kota[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Kode plat tidak ditemukan.");
        }

    }
}
