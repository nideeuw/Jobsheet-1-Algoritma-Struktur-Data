public class praktikumFungsi {
    public static void main(String[] args) {
        int[][] stockBunga = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };

        int[] hargaBunga = {75000, 50000, 60000, 10000};

        int[] pendapatan = hitungPendapatan(stockBunga, hargaBunga);
        tampilkanPendapatan(pendapatan);

        int[] bungaMati = {-1, -2, 0, -5};
        int[] stokBaru = hitungStokSetelahBungaMati(stockBunga[3], bungaMati);
        tampilkanStokBaru(stokBaru);
    }

    public static int[] hitungPendapatan(int[][] stockBunga, int[] hargaBunga) {
        int[] pendapatan = new int[stockBunga.length];

        for (int i = 0; i < stockBunga.length; i++) {
            for (int j = 0; j < stockBunga[i].length; j++) {
                pendapatan[i] += stockBunga[i][j] * hargaBunga[j];
            }
        }
        return pendapatan;
    }

    public static void tampilkanPendapatan(int[] pendapatan) {
        System.out.println("Pendapatan jika semua bunga terjual: ");
        for (int i = 0; i < pendapatan.length; i++) {
            System.out.printf("RoyalGarden %d: Rp %,d\n", i + 1, pendapatan[i]);
        }
        System.out.println();
    }

    public static int[] hitungStokSetelahBungaMati(int[] stock, int[] bungaMati) {
        int[] stokBaru = new int[stock.length];

        for (int i = 0; i < stock.length; i++) {
            stokBaru[i] = stock[i] + bungaMati[i];
        }
        return stokBaru;
    }

    public static void tampilkanStokBaru(int[] stokBaru) {
        System.out.println("Stok bunga di RoyalGarden 4 setelah beberapa bunga mati: ");
        String[] bunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        for (int i = 0; i < stokBaru.length; i++) {
            System.out.printf("%-10s: %d\n", bunga[i], stokBaru[i]);
        }
    }
}
