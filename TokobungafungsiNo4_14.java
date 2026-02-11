public class TokobungafungsiNo4_14 {

    static int pendapatan(int bunga[][],int indeksbunga){   
        int total=0;
        total += bunga[indeksbunga][0]*75000;   //mengkalikan dan menambahkan bunga kolom 0 dengan harga bunga dan ditambah dengan total sebelumnya
        total += bunga[indeksbunga][1]*50000;   //mengkalikan dan menambahkan bunga kolom 1 dengan harga bunga dan ditambah dengan total sebelumnya
        total += bunga[indeksbunga][2]*60000;   //mengkalikan dan menambahkan bunga kolom 2 dengan harga bunga dan ditambah dengan total sebelumnya
        total += bunga[indeksbunga][3]*10000;   //mengkalikan dan menambahkan bunga kolom 3 dengan harga bunga dan ditambah dengan total sebelumnya

        return total;                           //mengembalikan nilai total keseluruhan pendapatan diatas
    }
    public static void main(String[] args) {
        
        int bunga[][] = {           //array penjualan bunga
            { 10, 5, 15, 7 },
            { 6, 11, 9, 12 },
            { 2, 10, 10, 5 },
            { 5, 7, 12, 9 }
        };
        
        for(int i=0; i<bunga.length; i++){  //melakukan perulangan untuk mengetahui pendapatan dari setiap cabang
            System.out.println("Pendapatan Royal Garden"+(i+1)+": "+pendapatan(bunga, i));  //masuk kedalam fuction pendapatan

            //untuk menentukan suatu status cabang
            if (pendapatan(bunga, i)>1500000) {
                System.out.println("Status Cabang Sangat Baik");
            }else{
                System.out.println("Status Cabang Perlu Evaluasi");
            }
            System.out.println("");
        }
    }
}