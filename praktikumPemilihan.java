import java.util.Scanner;

public class praktikumPemilihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tugas, kuis, uts, uas;
        double setara;
        String huruf, kualifikasi;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=================================");
        System.out.print("Masukkan Nilai Tugas: ");
        tugas = input.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        kuis = input.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        uts = input.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        uas = input.nextInt();
        System.out.println("=================================");
        System.out.println("=================================");

        if ((tugas < 0 || tugas > 100) || (kuis < 0 || kuis > 100) || (uts < 0 || uts > 100) || (uas < 0 || uas > 100)) {
            System.out.println("Nilai tidak valid");
            System.out.println("=================================");
            System.out.println("=================================");
            return;
        }

        double nilaiAkhir = ((tugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.3));
        
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            huruf = "A";
            setara = 4.0;
            kualifikasi = "Sangat Baik";
        }else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            huruf = "B+";
            setara = 3.5;
            kualifikasi = "Lebih dari Baik";
        }else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            huruf = "B";
            setara = 3.0;
            kualifikasi = "Baik";
        }else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            huruf = "C+";
            setara = 2.5;
            kualifikasi = "Lebih dari Cukup";
        }else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            huruf = "C";
            setara = 2.0;
            kualifikasi = "Cukup";
        }else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            huruf = "D";
            setara = 1.0;
            kualifikasi = "Kurang";
        }else{
            huruf = "E";
            setara = 0;
            kualifikasi = "Gagal";
        }

        if (huruf == "D" || huruf == "E") {
            System.out.println("Nilai akhir: " + nilaiAkhir);
            System.out.println("Nilai huruf: " + huruf);
            System.out.println("MAAF ANDA TIDAK LULUS");
        }else{
            System.out.println("Nilai akhir: " + nilaiAkhir);
            System.out.println("Nilai huruf: " + huruf);
            System.out.println("SELAMAT ANDA LULUS");
        }

    }
}
