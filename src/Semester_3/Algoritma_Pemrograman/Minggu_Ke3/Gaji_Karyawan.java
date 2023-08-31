package Semester_3.Algoritma_Pemrograman.Minggu_Ke3;

/*
 * Muhammad Rofiif Syarof Nur Aufaa
 * 22537141014
 */

/*
 * Beberapa variabel diberikan nilai awal untuk menghindari ambiguitas
 * dan memastikan bahwa variabel tersebut memiliki nilai valid.
 */

import java.util.Scanner;

public class Gaji_Karyawan {
    public static void main(String[] args) {
        // ---- deklarasi dan insialisasi variabel ---------------------
        String namaKaryawan;
        int golongan, jamKerja;
        int jamLembur = 0;
        double gajiTotal;
        double gajiTetap = 0, gajiPerJam = 0, gajiLembur =0;
        Scanner masukan = new Scanner(System.in);

        //---- memasukkan data ---------------------
        System.out.print("Masukkan nama karyawan: ");
        namaKaryawan = masukan.nextLine();
        System.out.print("Masukkan golongan: ");
        golongan = masukan.nextInt();
        System.out.print("Masukkan jam kerja: ");
        jamKerja = masukan.nextInt();
        System.out.println();

        //---- percabangan dan proses ---------------------
        if (golongan >= 1 && golongan <= 5 ) {
            if (golongan == 1) {
                gajiTetap = 500000;
                gajiPerJam = 5000;
            } else if (golongan == 2) {
                gajiTetap = 300000;
                gajiPerJam = 3000;
            } else if (golongan == 3) {
                gajiTetap = 250000;
                gajiPerJam = 2000;
            } else if (golongan == 4) {
                gajiTetap = 100000;
                gajiPerJam = 1500;
            } else if (golongan == 5) {
                gajiTetap = 50000;
                gajiPerJam = 1000;
            } 
        } else {
            System.out.println("Golongan tidak valid");
            System.exit(0);
        }

        if (jamKerja > 150) {
            jamLembur = jamKerja - 150;
            gajiLembur = jamLembur * (1.5 * gajiPerJam);
            gajiTotal = gajiTetap + gajiLembur;
        } else {
            gajiTotal = gajiTetap;
        }

        //---- output ---------------------
        System.out.println("--- Data karyawan ---");
        System.out.println("Nama karyawan: " + namaKaryawan);
        System.out.println("Gaji tetap: " + gajiTetap);
        System.out.println("Gaji per jam: " + gajiPerJam);
        System.out.println("Jam kerja: " + jamKerja);
        System.out.println("Jam lembur: " + jamLembur);
        System.out.println("Gaji lembur: " + gajiLembur);
        System.out.println("Gaji total: " + gajiTotal);
    }
}
