import java.util.Scanner;

public class TugasNo2JadwalKuliah14 {
    static String[][] jadwal;

    // Function input jadwal
    static void inputJadwal(Scanner sc, int n) {
        jadwal = new String[n][4];
        for (int i = 0; i < n; i++) {
            System.out.println("Jadwal ke-" + (i+1));
            System.out.print("Mata Kuliah: ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Ruang: ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Hari: ");
            jadwal[i][2] = sc.nextLine();
            System.out.print("Waktu: ");
            jadwal[i][3] = sc.nextLine();
        }
    }

    // Function tampil semua jadwal
    static void tampilSemua() {
        System.out.println("\n=== Seluruh Jadwal Kuliah ===");
        for (int i = 0; i < jadwal.length; i++) {
            System.out.printf("%-20s %-10s %-10s %-10s\n",
                jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
    }

    // Function tampil jadwal berdasarkan hari
    static void tampilHari(String hari) {
        System.out.println("\n=== Jadwal Hari " + hari + " ===");
        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.printf("%-20s %-10s %-10s %-10s\n",
                    jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
            }
        }
    }

    // Function tampil jadwal berdasarkan mata kuliah
    static void tampilMatkul(String mk) {
        System.out.println("\n=== Jadwal MK " + mk + " ===");
        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][0].equalsIgnoreCase(mk)) {
                System.out.printf("%-20s %-10s %-10s %-10s\n",
                    jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan jumlah jadwal kuliah: ");
        int n = sc.nextInt();
        sc.nextLine(); // buang newline

        int pilihan;
        do {
            System.out.println("\n=== Menu Jadwal Kuliah ===");
            System.out.println("1. Memasukkan Jadwal Kuliah");
            System.out.println("2. Menampilkan seluruh jadwal kuliah");
            System.out.println("3. Menampilkan jadwal kuliah berdasarkan hari tertentu");
            System.out.println("4. Menampilkan jadwal kuliah berdasarkan nama mata kuliah tertentu");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // buang newline

            switch (pilihan) {
                case 1:
                    inputJadwal(sc, n);
                    break;
                case 2:
                    tampilSemua();
                    break;
                case 3:
                    System.out.print("Masukkan hari: ");
                    String hari = sc.nextLine();
                    tampilHari(hari);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah: ");
                    String mk = sc.nextLine();
                    tampilMatkul(mk);
                    break;
                case 5:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);

        sc.close();
    }
}
