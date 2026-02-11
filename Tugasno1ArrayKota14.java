import java.util.Scanner;

public class Tugasno1ArrayKota14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array plat sebagai char
        char plat[] = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        // Array kota sebagai char[] (hasil toCharArray)
        char kota[][] = new char[10][];
        kota[0] = "BANTEN".toCharArray();
        kota[1] = "JAKARTA".toCharArray();
        kota[2] = "BANDUNG".toCharArray();
        kota[3] = "CIREBON".toCharArray();
        kota[4] = "BOGOR".toCharArray();
        kota[5] = "PEKALONGAN".toCharArray();
        kota[6] = "SEMARANG".toCharArray();
        kota[7] = "SURABAYA".toCharArray();
        kota[8] = "MALANG".toCharArray();
        kota[9] = "TEGAL".toCharArray();

        System.out.print("Masukan Kode Plat Daerah: ");
        char kodeplat = sc.next().charAt(0);

        boolean ditemukan = false;
        for (int i = 0; i < plat.length; i++) {
            if (kodeplat == plat[i]) {
                System.out.println("Kode " + plat[i] + " berasal dari kota " + String.valueOf(kota[i]));
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Kode tidak ditemukan");
        }

        sc.close();
    }
}
