import java.util.Scanner;

public class SoundFestKiosk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int stokVIP = 5, stokFestival = 25, stokTribune = 35;
        int hargaVIP = 1500000, hargaFestival = 800000, hargaTribune = 500000;
        boolean mesinMenyala = true;

        //(Requirements No. 1)
        while (mesinMenyala) {
            System.out.println("\n=== UNIVERSITAS PERTAMINA SOUNDFEST 2026 ===");
            System.out.println("Sisa Stok Tiket:");
            System.out.println("1. VIP      : " + stokVIP + " (Rp 1.500.000, Min. 18 thn)");
            System.out.println("2. Festival : " + stokFestival + " (Rp 800.000, Min. 15 thn)");
            System.out.println("3. Tribune  : " + stokTribune + " (Rp 500.000, Tanpa Batasan)");
            System.out.println("4. Matikan Mesin (Teknisi)");
            System.out.print("Pilih Menu: ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1: case 2: case 3:
                  
                    int harga = 0, stok = 0, minUsia = 0;
                    String kategori = "";

                    if (pilihan == 1) {
                        kategori = "VIP"; harga = hargaVIP; stok = stokVIP; minUsia = 18;
                    } else if (pilihan == 2) {
                        kategori = "Festival"; harga = hargaFestival; stok = stokFestival; minUsia = 15;
                    } else {
                        kategori = "Tribune"; harga = hargaTribune; stok = stokTribune; minUsia = 0;
                    }

                    System.out.print("Jumlah tiket yang ingin dibeli: ");
                    int jumlahBeli = input.nextInt();

                    //(Requirements No. 2)
                    if (jumlahBeli > stok) {
                        System.out.println("ERROR: Stok tidak mencukupi!");
                        break; 
                    }

                    int tiketBerhasil = 0;
                    boolean batalDarurat = false;

                    // (Requirements No. 3)
                    for (int i = 1; i <= jumlahBeli; i++) {
                        int usia;
                        // (Requirements No. 4)
                        while (true) {
                            System.out.print("Masukkan usia untuk Tiket ke-" + i + " (Ketik -1 untuk Batal): ");
                            usia = input.nextInt();

                            if (usia == -1) {
                                batalDarurat = true;
                                break; 
                            }
                            if (usia > 0 && usia <= 120) {
                                break; 
                            }
                            System.out.println("Usia tidak logis. Silakan masukkan kembali.");
                        }

                        if (batalDarurat) {
                            System.out.println("Transaksi dibatalkan oleh pengguna.");
                            break;
                        }

                        //(Requirements No. 5)
                        if (usia >= minUsia) {
                            System.out.println("Tiket ke-" + i + " Berhasil diverifikasi.");
                            tiketBerhasil++;
                        } else {
                            System.out.println("Tiket ke-" + i + " Gagal: Usia tidak mencukupi.");
                        }
                    }

                    
                    if (!batalDarurat) {
                        int totalBayar = tiketBerhasil * harga;
                       
                        if (pilihan == 1) stokVIP -= tiketBerhasil;
                        else if (pilihan == 2) stokFestival -= tiketBerhasil;
                        else stokTribune -= tiketBerhasil;

                        System.out.println("\n--- NOTA PEMBAYARAN ---");
                        System.out.println("Kategori: " + kategori);
                        System.out.println("Tiket Berhasil: " + tiketBerhasil);
                        System.out.println("Total Tagihan : Rp " + totalBayar);
                        System.out.println("-----------------------");
                    }
                    break;

                case 4:
                    System.out.println("Mematikan sistem...");
                    mesinMenyala = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
        input.close();
    }
}