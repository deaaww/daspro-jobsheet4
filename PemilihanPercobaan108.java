import java.util.Scanner;

public class PemilihanPercobaan108 {
    public static void main(String[] args) {
        
        Scanner input00 = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input00.nextInt();

        if (angka % 2 == 0)
            System.out.println("Angka " + angka + "bilangan genao");
        else
            System.out.println("Angka " + angka + "bilangan ganjil");

        input00.close();
    }
}