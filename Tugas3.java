import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = input.nextInt();
        input.nextLine(); // Membuang newline

        String[] namaMatkul = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan data mata kuliah ke-" + (i + 1) + ":");
            System.out.print("Nama Mata Kuliah: ");
            namaMatkul[i] = input.nextLine();
            System.out.print("SKS: ");
            sks[i] = input.nextInt();
            System.out.print("Semester: ");
            semester[i] = input.nextInt();
            input.nextLine(); // Membuang newline
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = input.nextLine();
        }

        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal berdasarkan hari");
            System.out.println("3. Tampilkan jadwal berdasarkan semester");
            System.out.println("4. Cari mata kuliah berdasarkan nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // Membuang newline

            switch (pilihan) {
                case 1:
                    tampilkanSeluruhJadwal(namaMatkul, sks, semester, hariKuliah);
                    break;
                case 2:
                    System.out.print("Masukkan hari kuliah yang ingin ditampilkan: ");
                    String hari = input.nextLine();
                    tampilkanJadwalBerdasarkanHari(namaMatkul, sks, semester, hariKuliah, hari);
                    break;
                case 3:
                    System.out.print("Masukkan semester yang ingin ditampilkan: ");
                    int sem = input.nextInt();
                    tampilkanJadwalBerdasarkanSemester(namaMatkul, sks, semester, hariKuliah, sem);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah yang dicari: ");
                    String matkul = input.nextLine();
                    cariMataKuliah(namaMatkul, sks, semester, hariKuliah, matkul);
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        } while (pilihan != 5);

        input.close();
    }

    static void tampilkanSeluruhJadwal(String[] namaMatkul, int[] sks, int[] semester, String[] hariKuliah) {
        System.out.println("\nJadwal Kuliah:");
        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.println(namaMatkul[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
        }
    }

    static void tampilkanJadwalBerdasarkanHari(String[] namaMatkul, int[] sks, int[] semester, String[] hariKuliah, String hari) {
        System.out.println("\nJadwal Kuliah untuk hari " + hari + ":");
        boolean found = false;
        for (int i = 0; i < namaMatkul.length; i++) {
            if (hariKuliah[i].equalsIgnoreCase(hari)) {
                System.out.println(namaMatkul[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i]);
                found = true;
            }
        }
        if (!found) System.out.println("Tidak ada mata kuliah di hari tersebut.");
    }

    static void tampilkanJadwalBerdasarkanSemester(String[] namaMatkul, int[] sks, int[] semester, String[] hariKuliah, int sem) {
        System.out.println("\nJadwal Kuliah untuk Semester " + sem + ":");
        boolean found = false;
        for (int i = 0; i < namaMatkul.length; i++) {
            if (semester[i] == sem) {
                System.out.println(namaMatkul[i] + " | SKS: " + sks[i] + " | Hari: " + hariKuliah[i]);
                found = true;
            }
        }
        if (!found) System.out.println("Tidak ada mata kuliah di semester tersebut.");
    }

    static void cariMataKuliah(String[] namaMatkul, int[] sks, int[] semester, String[] hariKuliah, String matkul) {
        System.out.println("\nHasil pencarian untuk mata kuliah \"" + matkul + "\":");
        boolean found = false;
        for (int i = 0; i < namaMatkul.length; i++) {
            if (namaMatkul[i].equalsIgnoreCase(matkul)) {
                System.out.println("Mata Kuliah: " + namaMatkul[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
                found = true;
            }
        }
        if (!found) System.out.println("Mata kuliah tidak ditemukan.");
    }
}
