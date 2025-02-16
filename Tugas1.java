import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        char[] kode = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T'};
        char[][] kota = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'}
        };

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        char plat = input.next().toUpperCase().charAt(0);
        input.close();

        boolean found = false;
        for (int i = 0; i < kode.length; i++) {
            if (kode[i] == plat) {
                System.out.print("Kota: ");
                for (char c : kota[i]) {
                    System.out.print(c);
                }
                System.out.println();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Kode plat tidak ditemukan.");
        }
    }
}
