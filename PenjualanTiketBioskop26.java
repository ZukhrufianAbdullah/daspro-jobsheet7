import java.util.Scanner;

public class PenjualanTiketBioskop26{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Deklrasi variabel
        double hargaTiket = 50000, totalHarga = 0, diskon;
        int totalTiket, totalKeseluruhanTiket = 100;

        do {
            System.out.print("Input total tiket beli: ");
            totalTiket = sc.nextInt();
            
            if (totalTiket < 0) {
                System.out.println("Input tiket tidak valid, Masukkan lagi!");
                continue;
            }

            //Hitung sisa tiket
            totalKeseluruhanTiket-=totalTiket;

            if (totalKeseluruhanTiket < 1) {
                System.out.println("Tiket habis!, Pembelian telah mencapai (100 tiket)");
                break;
            }else{
                System.out.println("Sisa tiket harian: " + totalKeseluruhanTiket);
                if (totalTiket >= 4) {
                    diskon = (hargaTiket*totalTiket)*0.1;
                    totalHarga = (hargaTiket*totalTiket)-diskon;
                }else if (totalHarga >= 10) {
                    diskon = (hargaTiket*totalTiket)*0.15;
                    totalHarga = (hargaTiket*totalTiket)-diskon;
                }else{
                    totalHarga = hargaTiket * totalTiket;
                }
                System.out.println("Harga yang harus anda bayar: " + totalHarga);
                continue;
            }
        } while (totalKeseluruhanTiket >= 0);
    }
}