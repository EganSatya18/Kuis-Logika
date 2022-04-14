import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Inputkan jumlah buah: ");
        int jumlahBuah = userInput.nextInt();
        String[] namaBuah = new String[jumlahBuah];
        int[] banyakBuah = new int[jumlahBuah];
        masukkanNamaDanBanyakBuah(userInput, jumlahBuah, namaBuah, banyakBuah);
        int hasil = buahTerbanyak(jumlahBuah, namaBuah, banyakBuah);
        
        System.out.println("Nominal buah terbanyak: " + hasil);
    }
    static void masukkanNamaDanBanyakBuah(Scanner userInput, int jumlahBuah, String[] namaBuah, int[] banyakBuah) {
        for (int i = 0; i < jumlahBuah; i++) {
            System.out.print("Masukkan nama buah " + (i + 1) + ": ");
            namaBuah[i] = userInput.next();
            System.out.print("Masukkan banyak buah " + namaBuah[i] + ": ");
            banyakBuah[i] = userInput.nextInt();
        }
    }
   static int buahTerbanyak(int jumlahBuah, String[] namaBuah, int[] banyakBuah) {
        String namaBuahTerbanyak = "";
        int jumlahBuahTerbanyak = 0;
     for (int i = 0; i < jumlahBuah; i++) {
        if (banyakBuah[i] > jumlahBuahTerbanyak) {
         jumlahBuahTerbanyak = banyakBuah[i];
         namaBuahTerbanyak = namaBuah[i];
        }    
     }
    System.out.println("Buah terbanyak adalah " + namaBuahTerbanyak + " (" + jumlahBuahTerbanyak + ")");
     return jumlahBuahTerbanyak;
   }

}