import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int k, n, arr[], i, l, result = 0;

        String desc = "tidak bisa";
        System.out.println("MENENTUKAN APAKAH BISA MENJUMLAHKAN 2 ANGKA DARI ARRAY YANG DIBERIKAN");
        System.out.print("Inputkan Nilai K : ");
        k = scan.nextInt();

        System.out.print("Inputkan Jumlah Barisan : ");
        n = scan.nextInt();
        arr = new int[n];

        System.out.println("Masukkan " + n + " angka");
        for (i = 0; i < n; i++) {
            System.out.print("Angka[" + (i) + "] : ");
            arr[i] = scan.nextInt();
        }

       for (i = 0; i < n; i++) {
           for (l = 0; l < n; l++) {
               if (arr[i] != arr[l]) {
                   if (arr[i] + arr[l] == k) {
                       result++;
                   }
                }
           }
        }
        if (result > 0) {
            desc = "bisa";
        }

        String arrValue = Arrays.toString(arr);
        System.out.println("Array yang dimasukkan == " + arrValue);
        System.out.println("Apakah mungkin == " + desc);
    }
}