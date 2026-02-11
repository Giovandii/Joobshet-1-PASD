import java.util.Scanner;
public class NIMMahasiswaNo2_14 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("");
        System.out.print("Masukan NIM: ");
        long nim = sc.nextLong();
        long duaDigitterakhir = nim%100;

        if (duaDigitterakhir<10) {
            duaDigitterakhir +=10;
            
        }
        
        for(int i=1; i <=duaDigitterakhir; i++){
            if(i % 3==0){
                if(i == 15){
                    continue;
                }else{
                    System.out.print("#");
                }
            }
            else if(i%2==0){
                if(i ==10){
                    continue;
                }else{
                    System.out.print(i);
                }
            }
            else {
                System.out.print("*");
            }
        }
        System.out.println("");
        sc.close();
    }
}