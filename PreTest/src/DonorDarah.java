import java.util.Scanner;

public class DonorDarah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("~~~ SISTEM PENGECEKAN DONOR DARAH ~~~");

        System.out.print("Usia Anda : ");
        int usia = input.nextInt();

        System.out.print("Berat Badan (kg) : ");
        float beratBadan = input.nextFloat(); 

        System.out.print("Kadar Hemoglobin : ");
        float hb = input.nextFloat();

        System.out.println("\n~~~ Hasil Evaluasi ~~~");

        if (usia >= 17) {
            if (beratBadan >= 45.0f) {
                if (hb >= 13.5f) {
                    System.out.println("Selamat! Anda bisa menjadi donor darah.");
                } else {
                    System.out.println("Maaf, Anda Tidak Bisa Mendonorkan Darah , Hemoglobin minimal 13.5 g/dL.");
                }
            } else {
                System.out.println("Maaf, Anda Tidak Bisa Mendonorkan Darah. Berat badan minimal 45 kg.");
            }
        } else {
            System.out.println("Maaf, Tidak Bisa Usia minimal 17 tahun.");
        }

        input.close();
    }
}