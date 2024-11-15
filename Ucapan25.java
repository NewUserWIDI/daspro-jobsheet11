import java.util.Scanner;

public class Ucapan25 {

    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan:");
        String namaOrang = sc.nextLine(); 
        return namaOrang;
    }

    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("Terima kasih, " + nama + ", atas bantuan Anda!");
    }
}
