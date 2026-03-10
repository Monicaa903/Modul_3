import java.util.Scanner;

public class SimulasiATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double saldo = 500000.0;
        int pilihan;

        do {
            System.out.println("\n~~~ MENU UTAMA ATM ~~~");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Saldo Anda saat ini: Rp " + saldo);
                    break;
                case 2:
                    System.out.print("Masukkan jumlah setor: Rp ");
                    double setor = input.nextDouble();
                    saldo += setor;
                    System.out.println("Setor tunai berhasil.");
                    break;
                case 3:
                    System.out.print("Masukkan jumlah yang mau tarik: Rp ");
                    double tarik = input.nextDouble();
                    if ((saldo - tarik) < 50000) {
                        System.out.println("Peringatan!!! Penarikan dibatalkan. Saldo minimal Rp 50.000.");
                    } else {
                        saldo -= tarik;
                        System.out.println("Selamat!!! Tarik tunai berhasil.");
                    }
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan kami.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 4);

        input.close();
    }
}