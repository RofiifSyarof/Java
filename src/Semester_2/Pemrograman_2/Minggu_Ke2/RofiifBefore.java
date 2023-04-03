package Semester_2.Pemrograman_2.Minggu_Ke2;

/*
 * Muhammad Rofiif Syarof Nur Aufaa
 * 22537141014
 */

public class RofiifBefore {
    public static void main(String[] args) {
        int bln1, tgl1, bln2, tgl2;
        bln1 = 1;
        tgl1 = 2;
        bln2 = 3;
        tgl2 = 4;
        System.out.println("Apakah tanggal dan bulan pertama sebelum tanggal dan bulan kedua? " + before(bln1, tgl1, bln2, tgl2));
    }
    public static Boolean before(int a, int b, int c, int d) {
        if(a < c) {
            if(b < d) {
                return true;
            } else if (b > d) {
                return false;
            }
        } else if (a > c || a == c) {
            return false;
        } return false;
    }
}
/*
 * Output:
 * Apakah tanggal dan bulan pertama sebelum tanggal dan bulan kedua? true
 */