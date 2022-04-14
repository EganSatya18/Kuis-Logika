import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
        
        System.out.println("Angka terbesar yang mana?");
        System.out.println("");
        System.out.print("Masukkan Angka 1 : ");
        int a = input.nextInt();
        System.out.print("Masukkan Angka 2 : ");
        int b = input.nextInt();
        
        if (a > b) {
            System.out.println("Angka terbesar : "+a);
        } else {
            System.out.println("Angka terbesar : "+b);
        }
    }
}