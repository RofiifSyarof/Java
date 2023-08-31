
// Program ini dibuat untuk mengonversikan nilai angka ke nilai huruf

import java.util.Scanner;

public class konversi_nilai {
    public static void main(String[] args) {
        int nilai;
        String huruf;

        Scanner masukan = new Scanner(System.in);

        //---- memasukkan nilai -------
        System.out.print("Masukkan nilai: ");
        nilai = masukan.nextInt();

        //---- percabangan dan proses ---------------------
        if (nilai >= 90) {
            huruf = "A";
        } else if (nilai >= 80) {
            huruf = "B";
        } else if (nilai >= 70) {
            huruf = "C";
        } else if (nilai >= 60) {
            huruf = "D";
        } else {
            huruf = "E";
        }

        //---- output ---------------------
        System.out.println("Nilai Anda adalah: " + huruf);
    }
}