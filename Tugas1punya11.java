import java.util.Scanner;

public class Tugas1punya11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String konfirmasi;
        int hargaTiket = 50000, totalTiketSelamaSatuHari = 0, jumlahTiket;
        double totalPenjualanHarian = 0, totalPelangganMembayar = 0, diskon = 0, totalDiskon = 0;

        System.out.println("----- Kasir Bioskop Jesyca -----");
        do {
            while (true) {
                System.out.print("Masukkan jumlah tiket Anda: ");
                jumlahTiket = sc.nextInt();

                if (jumlahTiket >= 0) {
                    break; 
                } else {
                    System.out.println("Input tiket Anda tidak valid, silahkan mencoba kembali");
                }
            } 
            totalPelangganMembayar = jumlahTiket * hargaTiket;
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.1;
            } else {
                diskon = 0;
            }

            totalDiskon = totalPelangganMembayar * diskon;
            totalPelangganMembayar -= totalDiskon;

            System.out.println("Anda mendapatkan diskon: " + totalDiskon);
            System.out.println("Mohon bayar tiket sejumlah: Rp. " + totalPelangganMembayar);

            totalTiketSelamaSatuHari += jumlahTiket;
            totalPenjualanHarian += totalPelangganMembayar;

            sc.nextLine();
            System.out.println("Ada pelanggan lain? (yes or no)");
            konfirmasi = sc.nextLine();

        } while (konfirmasi.equals("yes"));

        System.out.println("----- Bioskop Jesyca dalam Satu Hari -----");
        System.out.println("Total tiket terjual: " + totalTiketSelamaSatuHari);
        System.out.println("Total penjualan hari ini: Rp. " + totalPenjualanHarian);

        sc.close();
    }
}
    
    

