import java.util.Scanner;

public class praktikumArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("=================================");

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMK = input.nextInt();
        input.nextLine();

        String[] mataKuliah = new String[jumlahMK];
        int[] sks = new int[jumlahMK];
        String[] nilaiHuruf = new String[jumlahMK];
        double[] nilaiSetara = new double[jumlahMK];

        double totalBobot = 0;
        int totalSKS = 0;

        for (int i = 0; i < jumlahMK; i++) {
            System.out.println("\nMata Kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah       : ");
            mataKuliah[i] = input.nextLine();
            System.out.print("Jumlah SKS             : ");
            sks[i] = input.nextInt();
            System.out.print("Nilai Huruf (A-E)      : ");
            nilaiHuruf[i] = input.next().toUpperCase();
            input.nextLine();

            if (nilaiHuruf[i].equals("A")) {
                nilaiSetara[i] = 4.0;
            } else if (nilaiHuruf[i].equals("B+")) {
                nilaiSetara[i] = 3.5;
            } else if (nilaiHuruf[i].equals("B")) {
                nilaiSetara[i] = 3.0;
            } else if (nilaiHuruf[i].equals("C+")) {
                nilaiSetara[i] = 2.5;
            } else if (nilaiHuruf[i].equals("C")) {
                nilaiSetara[i] = 2.0;
            } else if (nilaiHuruf[i].equals("D")) {
                nilaiSetara[i] = 1.0;
            } else {
                nilaiSetara[i] = 0.0;
                System.out.println("Nilai tidak valid, dianggap 'E'");
            }

            totalBobot += nilaiSetara[i] * sks[i];
            totalSKS += sks[i];
        }

        double ipSemester = totalBobot / totalSKS;

        System.out.println("\n===================================================");
        System.out.println("HASIL KONVERSI NILAI DAN IP SEMESTER");
        System.out.println("===================================================");
        System.out.printf("%-35s %-5s %-12s %-10s\n", "Mata Kuliah", "SKS", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < jumlahMK; i++) {
            System.out.printf("%-35s %-5d %-12s %-10.2f\n", mataKuliah[i], sks[i], nilaiHuruf[i], nilaiSetara[i]);
        }
        System.out.println("===================================================");
        System.out.printf("IP Semester: %.2f\n", ipSemester);

        input.close();
    }
}
