import java.util.Scanner;

public class TugasNo2JadwalKuliah14 {
    static String[][] jadwal; // instansiasi array global

    // Function tampil semua jadwal
    static void tampilSemua() {
        System.out.println("\n=== Seluruh Jadwal Kuliah ==="); // Output Judul Tabel
        System.out.printf("%-20s %-10s %-10s %-10s\n", "Mata Kuliah", "Ruang", "Hari", "Waktu");

        for (int i = 0; i < jadwal.length; i++) { // menampilkan seluruh isi dari array
            System.out.printf("%-20s %-10s %-10s %-10s\n",
                    jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
    }

    // Function tampil jadwal berdasarkan hari
    static void tampilHari(String hari) {
        System.out.println("\n=== Jadwal Hari " + hari + " ==="); // Judul sebuah tabel berdasar hari
        System.out.printf("%-20s %-10s %-10s %-10s\n", "Mata Kuliah", "Ruang", "Hari", "Waktu");

        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) { // menampilkan isi array dengan hari yang sama
                System.out.printf("%-20s %-10s %-10s %-10s\n",
                        jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
            }
        }
    }

    // Function tampil jadwal berdasarkan mata kuliah
    static void tampilMatkul(String mk) {
        System.out.println("\n=== Jadwal Mata Kuliah " + mk + " ==="); // Judul sebuah tabel berdasar mata kuliah
        System.out.printf("%-20s %-10s %-10s %-10s\n", "Mata Kuliah", "Ruang", "Hari", "Waktu");

        for (int i = 0; i < jadwal.length; i++) { // menampilkan isi array dengan mata kuliah yang sama
            if (jadwal[i][0].equalsIgnoreCase(mk)) {
                System.out.printf("%-20s %-10s %-10s %-10s\n",
                        jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
            }
        }
    }

    // Function main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan jumlah jadwal kuliah: ");
        int n = sc.nextInt(); // Memasukan banyaknya jadwal pada perkuliahan
        sc.nextLine();

        jadwal = new String[n][4]; // n untuk jadwal dan 4 untuk banyak kolom

        for (int i = 0; i < n; i++) { // memasukan informasi mata kuliah sebanyak nilai yang dimasukan di atas
            System.out.println();
            System.out.println("Jadwal ke-" + (i + 1));
            System.out.print("Mata Kuliah: ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Ruang: ");
            jadwal[i][1] = sc.nextLine();

            do {
                System.out.print("Hari: ");
                jadwal[i][2] = sc.nextLine();
            } while (
                    !jadwal[i][2].equalsIgnoreCase("senin") &&
                    !jadwal[i][2].equalsIgnoreCase("selasa") &&
                    !jadwal[i][2].equalsIgnoreCase("rabu") &&
                    !jadwal[i][2].equalsIgnoreCase("kamis") &&
                    !jadwal[i][2].equalsIgnoreCase("jumat")
            );

            System.out.print("Waktu: ");
            jadwal[i][3] = sc.nextLine();
        }

        // Daftar pilihan untuk mengecek jadwal
        int pilihan;
        do {
            System.out.println("\n=== Menu Jadwal Kuliah ===");
            System.out.println("1. Menampilkan seluruh jadwal kuliah");
            System.out.println("2. Menampilkan jadwal kuliah berdasarkan hari tertentu");
            System.out.println("3. Menampilkan jadwal kuliah berdasarkan nama mata kuliah tertentu");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1 -> tampilSemua();
                case 2 -> {
                    System.out.print("Masukkan hari: ");
                    String hari = sc.nextLine();
                    if (
                            hari.equalsIgnoreCase("senin") ||
                            hari.equalsIgnoreCase("selasa") ||
                            hari.equalsIgnoreCase("rabu") ||
                            hari.equalsIgnoreCase("kamis") ||
                            hari.equalsIgnoreCase("jumat")
                    ) {
                        tampilHari(hari);
                    } else {
                        System.out.println("Hari tidak valid. Masukkan antara Senin-Jumat.");
                    }
                }
                case 3 -> {
                    System.out.print("Masukkan nama mata kuliah: ");
                    String mk = sc.nextLine();
                    tampilMatkul(mk);
                }
                case 4 -> System.out.println("Keluar dari program...");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);

        sc.close();
    }
}
