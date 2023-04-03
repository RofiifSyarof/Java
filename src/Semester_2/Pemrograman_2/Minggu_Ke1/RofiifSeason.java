package Semester_2.Pemrograman_2.Minggu_Ke1;

/*
 * Muhammad Rofiif Syarof Nur Aufaa
 * 22537141014
 */

public class RofiifSeason {
    public static void main(String[] args) {
        int a,b,c,d,e;
        a = 3;
        b = 6;
        c = 9;
        d = 15;
        e = 16;
        System.out.println("Tanggal " + d + " bulan " + a + " adalah musim " + season(a, d));
        System.out.println("Tanggal " + d + " bulan " + b + " adalah musim " + season(b, d));
        System.out.println("Tanggal " + d + " bulan " + c + " adalah musim " + season(c, d));
        System.out.println("Tanggal " + e + " bulan " + c + " adalah musim " + season(c, e));
    }
    public static String season(int bln, int tgl) {
        if (bln >= 3 && tgl >= 16 && bln < 6 || bln <= 6 && tgl <= 15 && bln > 3) {
            return "Spring";
        } else if (bln >= 6 && tgl >= 16 && bln < 9 || bln <= 9 && tgl <= 15 && bln > 6) {
            return "Summer";
        } else if (bln >= 9 && tgl >= 16 && bln < 12 || bln <= 12 && tgl <= 15 && bln > 9) {
            return "Fall";
        } else {
            return "Winter";
        }
    }
}
/*
 * Output:
 * Tanggal 15 bulan 3 adalah musim Winter
 * Tanggal 15 bulan 6 adalah musim Spring
 * Tanggal 15 bulan 9 adalah musim Summer
 * Tanggal 16 bulan 9 adalah musim Fall
 */