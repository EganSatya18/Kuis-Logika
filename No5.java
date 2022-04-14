import java.util.Arrays;
import java.util.Scanner;

public class Main{
public static void main (String[] args) {
Scanner scan = new Scanner(System.in);
    int max, n, arr[], i;
    
    System.out.println("Tentukan Bilangan Maksimum");
    System.out.println("Inputkan jumlah nilai N=");
    n = scan.nextInt();
    arr = new int[n];
    
    System.out.println("Masukkan"+n+"angka");
    for (i=0; i<n; i++){
        System.out.println("Angka["+(i)+"] :");
        arr[i] = scan.nextInt();
    }
    
    max = arr[0];
    for(i=0; i<n; i++){
        if(arr[i] > max){
            max = arr[i];
        }
    }
    
    String arrValue = Arrays.toString(arr);
    System.out.println("Array yang dimasukkan adalah" + arrValue);
    System.out.println("Bilangan Maksimum adalah" + max);
    }
}
    