import java.util.Scanner;

import javax.imageio.plugins.jpeg.JPEGHuffmanTable;

public class Gaji08 {
    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);

        int jmlMasuk, jmlTdkMasuk, totGaji;
        int gaji=40000, potGaji=25000;

        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda: ");
        jmlMasuk=input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Anda: ");
        jmlTdkMasuk=input.nextInt();

        totGaji=(jmlMasuk*gaji)-(jmlTdkMasuk*potGaji);
        System.out.println("Gaji yang anda terima adalah: ");

        input.close();
    }
}