public class TokobungafungsiNo4_14 {

    static int pendapatan(int bunga[][],int indeksbunga){
        int total=0;
        total += bunga[indeksbunga][0]*75000;
        total += bunga[indeksbunga][1]*50000;
        total += bunga[indeksbunga][2]*60000;
        total += bunga[indeksbunga][3]*10000;

        return total;
    }
    public static void main(String[] args) {
        double total =0;
        int bunga[][] = {
            { 10, 5, 15, 7 },
            { 6, 11, 9, 12 },
            { 2, 10, 10, 5 },
            { 5, 7, 12, 9 }
        };
        
        for(int i=0; i<bunga.length; i++){
            System.out.println("Pendapatan Royal Garden"+(i+1)+": "+pendapatan(bunga, i));
            if (pendapatan(bunga, i)>1500000) {
                System.out.println("Status Cabang Sangat Baik");
            }else{
                System.out.println("Status Cabang Perlu Evaluasi");
            }
            System.out.println("");
        }
    }
}