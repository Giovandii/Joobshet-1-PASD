import java.util.Scanner;
public class NIMMahasiswaNo2_14 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("");
        System.out.print("Masukan NIM: ");
        long nim = sc.nextLong();               //input nim
        long duaDigitterakhir = nim%100;        //hanya untuk mengambil 2 digit terakhir

        if (duaDigitterakhir<10) {              // jika 2 digit terakhir kurang dari 10 maka diitambah dengan 10
            duaDigitterakhir +=10;
            
        }
        
        for(int i=1; i <=duaDigitterakhir; i++){    //melakukan perulangan untuk mencetak 
            if(i % 3==0){                           // jika ada salah satu digit perulangan habis di bagi tiga maka
                if(i == 15){                        // jika kelipatan 3 = 15 maka tidak diprint
                    continue;
                }else{                              // jika bukan 15 maka  cetak #
                    System.out.print("#");
                }
            }
            else if(i%2==0){                        // jika ada salah satu digit perulangan habis di bagi 2 maka
                if(i ==10){                         // jika kelipatan genap = 10 maka tidak diprint
                    continue;
                }else{
                    System.out.print(i);            // jika bukan 10 maka  cetak angka itu sendiri
                }
            }
            else {
                System.out.print("*");            // cetak * untuk angka ganjil yang bukan termasuk kelipatan diatas
            }
        }
        System.out.println("");
        sc.close();
    }
}