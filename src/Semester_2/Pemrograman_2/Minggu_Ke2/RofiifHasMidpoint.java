package Semester_2.Pemrograman_2.Minggu_Ke2;

/*
 * Muhammad Rofiif Syarof Nur Aufaa
 * 22537141014
 */

public class RofiifHasMidpoint {
    public static void main(String[] args) {
        int a, b, c;
        a = 3;
        b = 7;
        c = 5;
        System.out.println("Apakah " + a + ", " + b + ", dan " + c + " memiliki titik tengah? " + hasMidpoint(a, b, c));
    }
    public static boolean hasMidpoint(int a, int b, int c) {
        if (a == b && b == c && a ==c) {
            return true;
        } else {
            int d = Math.min(a, Math.min(b, c));
            int e = Math.max(a, Math.max(b, c));
            double f = (d + e) / 2.0;
            if (f != d) {
                if (f == a || f == b || f == c) {
                    return true;
                } else {
                    return false;
                }
            }
        } return false;
    }
}
/*
 * Output:
 * Apakah 3, 7, dan 5 memiliki titik tengah? true
 */