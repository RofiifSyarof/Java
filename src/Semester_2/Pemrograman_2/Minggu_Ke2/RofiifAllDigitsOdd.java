package Semester_2.Pemrograman_2.Minggu_Ke2;

/*
 * Muhammad Rofiif Syarof Nur Aufaa
 * 22537141014
 */

public class RofiifAllDigitsOdd {
    public static void main(String[] args) {
        int a, b;
        a = 135319;
        b = 9145293;
        System.out.println("Apakah semua digit " + a + " adalah ganjil? " + allDigitsOdd(a));
        System.out.println("Apakah semua digit " + b + " adalah ganjil? " + allDigitsOdd(b));
    }
    public static boolean allDigitsOdd(int n) {
        while (n > 0) {
            if (n % 2 == 0) {
                return false;
            }
            n = n / 10;
        }
        return true;
    }
}
/*
 * Output:
 * Apakah semua digit 135319 adalah ganjil? true
 * Apakah semua digit 9145293 adalah ganjil? false
 */