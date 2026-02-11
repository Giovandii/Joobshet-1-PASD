import java.util.Scanner;
public class NilaiMahasiswaNo1_14 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double  total=0;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukan Nilai Tugas: ");
        double tugas = sc.nextDouble();
        System.out.print("Masukan Nilai Kuis: ");
        double kuis = sc.nextDouble();
        System.out.print("Masukan Nilai UTS: ");
        double uts = sc.nextDouble();
        System.out.print("Masukann Nilaai UAS: ");
        double uas = sc.nextDouble();
        System.out.println("==============================");
        System.out.println("==============================");

        if (tugas<=0 || tugas>=100) {
            System.out.println("Nilai Tidak Valid");
        }
        else if (kuis<=0 || tugas>=100) {
            System.out.println("Nilai Tidak Valid");
        }
        else if (uts<=0 || kuis>=100) {
            System.out.println("Nilai Tidak Valid");
        }
        else if (uas<=0 || uas>=100){
            System.out.println("Nilai Tidak Valid");
        }
        else{
            tugas=tugas*0.2;
            kuis=kuis*0.2;
            uts=uts*0.3;
            uas=uas*0.3;
            total =(tugas+kuis+uts+uas);
            System.out.print("Nilai Akhir: "+total%.2f);
            System.out.println("");

            if (total>80 && total<=100) {
                System.out.print("Nilai Huruf: A");
            }
            else if (total>73 && total<=80) {
                System.out.print("Nilai Huruf: B+");
            }
            else if (total>65 && total<=73) {
                System.out.print("Nilai Huruf: B");
            }
            else if (total>60 && total<=65) {
                System.out.print("Nilai Huruf: C+");
            }
            else if (total>50 && total<=60) {
                System.out.print("Nilai Huruf: C");
            }
            else if (total>39 && total<=50) {
                System.out.print("Nilai Huruf: D");
            }
            else{
                System.out.print("Nilai Huruf: E");
            }
            System.out.println("");
        }
        System.out.println("==============================");
        System.out.println("==============================");
        
        if (total>50) {
            System.out.println("SELAMAT ANDA LULUS");
        }
        else{
            System.out.println("TIDAK LULUS");
        }
    }
}