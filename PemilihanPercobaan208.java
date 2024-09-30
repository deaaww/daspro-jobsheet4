import java.util.Scanner;

public class PemilihanPercobaan208 {
    public static void main(String[] args) {
        
        Scanner input00 = new Scanner(System.in);

        System.out.print("Nilai UAS     : ");
        float UAS = input00.nextFloat();
        System.out.print("Nilai UTS     : ");
        float UTS = input00.nextFloat();
        System.out.print("Nilai KUIS    : ");
        float KUIS = input00.nextFloat();
        System.out.print("Nilai TUGAS   : ");
        float TUGAS = input00.nextFloat();

        float total = (UAS * 0.4F) + (UTS * 0.3F) + (KUIS * 0.1F) + (TUGAS + 0.2F);

        String message = total < 65 ? "Remidi" : "Tidak Remidi";

        System.out.println("Nilai Akhir = " + total + "sehingga " + message);

        input00.close();
    }
}