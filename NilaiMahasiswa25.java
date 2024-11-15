import java.util.Scanner;

public class NilaiMahasiswa25 {
    
    // Deklarasi variabel statis
    static String[] namaMahasiswa;
    static int[][] nilaiMahasiswa;

    // Fungsi untuk input nilai mahasiswa
    public static void inputNilai() {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah mahasiswa dan minggu
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        System.out.print("Masukkan jumlah minggu (tugas): ");
        int jumlahMinggu = scanner.nextInt();

        // Inisialisasi array berdasarkan input pengguna
        namaMahasiswa = new String[jumlahMahasiswa];
        nilaiMahasiswa = new int[jumlahMahasiswa][jumlahMinggu];

        // Input nama mahasiswa
        scanner.nextLine();  // Untuk menangkap newline dari input sebelumnya
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = scanner.nextLine();
        }

        // Input nilai mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan nilai untuk " + namaMahasiswa[i] + ":");
            for (int j = 0; j < jumlahMinggu; j++) {
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = scanner.nextInt();
            }
        }
    }

    // Fungsi untuk menampilkan nilai mahasiswa
    public static void tampilkanNilai() {
        System.out.println("\nData Nilai Mahasiswa:");
        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.print(namaMahasiswa[i] + " : ");
            for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
                System.out.print(nilaiMahasiswa[i][j] + ", ");
            }
            System.out.println();
        }
    }

    // Fungsi untuk mencari nilai tertinggi per minggu
    public static void nilaiTertinggiPerMinggu() {
        System.out.println("\nNilai tertinggi di setiap minggu:");
        for (int minggu = 0; minggu < nilaiMahasiswa[0].length; minggu++) {
            int nilaiTertinggi = 0;
            for (int mahasiswa = 0; mahasiswa < namaMahasiswa.length; mahasiswa++) {
                if (nilaiMahasiswa[mahasiswa][minggu] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMahasiswa[mahasiswa][minggu];
                }
            }
            System.out.println("Minggu ke-" + (minggu + 1) + ": " + nilaiTertinggi);
        }
    }

    // Fungsi untuk menampilkan mahasiswa dengan nilai tertinggi
    public static void mahasiswaNilaiTertinggi() {
        int nilaiTertinggi = 0;
        String namaMahasiswaTertinggi = "";
        int mingguTertinggi = 0;

        for (int i = 0; i < namaMahasiswa.length; i++) {
            for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
                if (nilaiMahasiswa[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMahasiswa[i][j];
                    namaMahasiswaTertinggi = namaMahasiswa[i];
                    mingguTertinggi = j + 1;
                }
            }
        }

        System.out.println("\nMahasiswa dengan nilai tertinggi:");
        System.out.println("Nama: " + namaMahasiswaTertinggi);
        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
        System.out.println("Minggu ke-" + mingguTertinggi);
    }

    public static void main(String[] args) {
        inputNilai();  // Input nilai mahasiswa

        tampilkanNilai();  // Menampilkan data nilai mahasiswa

        nilaiTertinggiPerMinggu();  // Menampilkan nilai tertinggi per minggu

        mahasiswaNilaiTertinggi();  // Menampilkan mahasiswa dengan nilai tertinggi
    }
}
