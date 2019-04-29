import java.util.Scanner;
class StarArray{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Array : ");
        int jumlah = scan.nextInt();
        int arrayJumlah []= new int[jumlah];
        System.out.println("Masukkan Angka digit setiap index Array");
        for(int i = 0; i < jumlah; i++){
            System.out.print("Untuk Index ke - " + i + " : ");
            int indexArray = scan.nextInt();
            arrayJumlah[i] = indexArray;
        }
        System.out.println();
        for(int j = 0; j < arrayJumlah.length; j++){
            System.out.print(arrayJumlah[j] + " | ");
            for(int p = 0; p < arrayJumlah[j]; p++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}