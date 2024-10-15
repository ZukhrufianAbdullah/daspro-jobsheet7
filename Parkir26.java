import java.util.Scanner;

public class Parkir26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Deklrasi variabel
        int jenis, durasi, total = 0;

        do {
            System.out.print("Pilih jenis kendaraan: \n\s 1.Mobil \n\s 2.Motor \n\s 0.Keluar \nMasukkan jenis kendaraan: ");
            jenis = sc.nextInt();

            if (jenis == 0) {
                System.out.println("Perhitungan dibatalkan");
                break;
            }

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir kendaraan anda: ");
                durasi = sc.nextInt();

                if (durasi > 5) {
                    total += 12500;
                    continue;
                }else{
                    if (jenis == 1) {
                            total += durasi * 3000;
                        }else if (jenis == 2) {
                            total += durasi * 2000;
                        }
                    }
                }else {
                    System.out.println("Input anda tidak valid");
                    continue;
                }
            }while (jenis != 0);
            System.out.println("Total yang harus anda bayar: " + total);
        } 
    }