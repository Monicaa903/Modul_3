import java.util.Scanner;

public class KelulusanTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nilai ujian akhir: ");
        int nilaiUjian = input.nextInt();

        System.out.print("Masukkan persentase absensi : ");
        int absensi = input.nextInt();
 
        String status = (nilaiUjian >= 75 && absensi > 80) ? "Lulus" : "Tidak Lulus";

        System.out.println("Status Mahasiswa: " + status);

        input.close();
    }
}
