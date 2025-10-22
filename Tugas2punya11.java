import java.util.Scanner;

public class Tugas2punya11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis = 0, durasi = 0, total = 0;

        System.out.println("----- Pembayaran Parkir -----");

        do {

            System.out.println("Silahkan masukkan jenis kendaraan Anda (1. Mobil, 2. Motor, 0. Keluar)");
            jenis = sc.nextInt();

        if (jenis == 1 || jenis == 2) {
            System.out.print("Durasi parkir Anda (jam): ");
            durasi = sc.nextInt();

            if (durasi > 5) {
                total += 12500;
            } else if (jenis == 1) {
                total += durasi * 3000;
            } else if (jenis == 2) {
                total += durasi * 2000;
            }
        } else {
            System.out.println("Jenis kendaraan Anda tidak valid, Silahkan masukkan ulang");
        }
        } while (jenis != 0);

    System.out.println("----- Laporan Total Pembayaran Parkir -----");
    System.out.println("Total pembayaran parkir: Rp " + total);
    sc.close();
    }
}


