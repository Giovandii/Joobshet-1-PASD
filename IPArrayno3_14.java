import java.util.Scanner;

public class IPArrayno3_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Array mata kuliah
        String MK[] = { 
            "Pancasila", 
            "Konsep Teknologi Informasi", 
            "Critical Thinking dan Problem Solving", 
            "Matematika Dasar", 
            "Bahasa Inggris", 
            "Dasar Pemrograman", 
            "Praktikum Dasar Pemrograman", 
            "Keselamatan dan Kesehatan Kerja" 
        };

        int sks[] = {2, 2, 2, 2, 2, 3, 2, 2};           //sks setiap mata kuliah
        double nilai[] = new double[MK.length];         //instansiasi array nilai angka
        String nilaiHuruf[] = new String[MK.length];    //instansiasi array nilai huruf
        double nilaiSetara[] = new double[MK.length];   //instansiasi array nilai setara

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        // Input nilai dengan validasi
        for (int i = 0; i < MK.length; i++) {       //perulangan sebanyak mata kuliah pada array
            do {
                System.out.print("Masukkan nilai angka untuk MK " + MK[i] + " : ");
                nilai[i] = sc.nextDouble();                                             //memasukan nilai setiap matkul dalam rentan 1-100
                if (nilai[i] < 1 || nilai[i] > 100) {
                    System.out.println("Nilai harus antara 1 dan 100. Silakan coba lagi.");
                }
            } while (nilai[i] < 1 || nilai[i] > 100);
        }

        // Konversi nilai ke huruf dan bobot
        for (int i = 0; i < MK.length; i++) {
            if (nilai[i] > 80) {
                nilaiHuruf[i] = "A"; nilaiSetara[i] = 4.0;
            } else if (nilai[i] > 73) {
                nilaiHuruf[i] = "B+"; nilaiSetara[i] = 3.5;
            } else if (nilai[i] > 65) {
                nilaiHuruf[i] = "B"; nilaiSetara[i] = 3.0;
            } else if (nilai[i] > 60) {
                nilaiHuruf[i] = "C+"; nilaiSetara[i] = 2.5;
            } else if (nilai[i] > 50) {
                nilaiHuruf[i] = "C"; nilaiSetara[i] = 2.0;
            } else if (nilai[i] > 39) {
                nilaiHuruf[i] = "D"; nilaiSetara[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E"; nilaiSetara[i] = 0.0;
            }
        }

        // Output tabel
        System.out.println("==============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==============================");
        System.out.printf("%-40s %-12s %-12s %-12s \n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < MK.length; i++) {
            System.out.printf("%-40s %-12.2f %-12s %-12.2f \n", MK[i], nilai[i], nilaiHuruf[i], nilaiSetara[i]);
        }

        // Hitung IP
        double totalBobotSKS = 0;
        int totalSKS = 0;
        for (int i = 0; i < MK.length; i++) {
            totalBobotSKS += nilaiSetara[i] * sks[i];
            totalSKS += sks[i];
        }
        double ip = totalBobotSKS / totalSKS;   //IP semester

        System.out.println("==============================");
        System.out.printf("IP Semester = %.2f\n", ip);

        sc.close();
    }
}
