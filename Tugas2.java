import java.util.Scanner;

public class Tugas2 {
    public static double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }

    public static double hitungLuasPermukaan(double sisi) {
        return 6 * sisi * sisi;
    }

    public static double hitungKeliling(double sisi) {
        return 12 * sisi;
    }

    public static void tampilkanMenu() {
        System.out.println("\n=== Menu Perhitungan Kubus ===");
        System.out.println("1. Hitung Volume");
        System.out.println("2. Hitung Luas Permukaan");
        System.out.println("3. Hitung Keliling");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu (1-4): ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        double sisi;

        do {
            tampilkanMenu();
            pilihan = input.nextInt();

            if (pilihan >= 1 && pilihan <= 3) {
                System.out.print("Masukkan panjang sisi kubus: ");
                sisi = input.nextDouble();
            } else {
                sisi = 0; // Default jika pengguna memilih keluar
            }

            switch (pilihan) {
                case 1:
                    System.out.println("Volume Kubus: " + hitungVolume(sisi));
                    break;
                case 2:
                    System.out.println("Luas Permukaan Kubus: " + hitungLuasPermukaan(sisi));
                    break;
                case 3:
                    System.out.println("Keliling Kubus: " + hitungKeliling(sisi));
                    break;
                case 4:
                    System.out.println("Terima kasih! Pehitungan selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        } while (pilihan != 4);

        input.close();
    }
}
