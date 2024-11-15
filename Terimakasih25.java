public class Terimakasih25 {
    public static void UcapanTerimakasih() {
        System.out.println("Thank you for being the best teacher in the world.\n" +
                           "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }
//Fungsi UcapanTambahan yang menerima parameter bertipe String
public static void UcapanTambahan(String ucapan){
    System.out.println(ucapan);
}
    public static void main(String[] args) {
        //Memanggil fungsi UcapanTambahan dengan parameter berupa kalimat tambahan
        UcapanTerimakasih();
        String ucapan = "Terimakasih Pak.. Bu.. Semoga Sehat Selalu";
        UcapanTamabahan(ucapan);
    }
}
