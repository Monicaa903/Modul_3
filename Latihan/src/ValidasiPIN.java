import java.util.Scanner;

public class ValidasiPIN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int pinBenar = 123456;
        int percobaan = 0;
        int batasMaksimal = 3;
        boolean loginBerhasil = false;

        System.out.println("~~~ SIMULASI LOGIN PIN ~~~");

        while (percobaan < batasMaksimal) {
            System.out.print("Masukkan PIN : ");
            int pinInput = input.nextInt();
            percobaan++;

            if (pinInput == pinBenar) {
                System.out.println("YEAYY PIN BENAR!");
                loginBerhasil = true;
                break; 
            } else {
                if (percobaan < batasMaksimal) {
                    System.out.println("PIN salah. Silahkan Coba Lagi. Sisa percobaan: " + (batasMaksimal - percobaan));
                }
            }
        }

        if (!loginBerhasil) {
            System.out.println("Akun diblokir.");
        }

        input.close();
    }
}