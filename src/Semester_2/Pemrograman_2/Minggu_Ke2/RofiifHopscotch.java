package Semester_2.Pemrograman_2.Minggu_Ke2;

/*
 * Muhammad Rofiif Syarof Nur Aufaa
 * 22537141014
 */

public class RofiifHopscotch {
    public static void main(String[] args) {
        hopscotch(3);
    }
    public static void hopscotch(int n) {
        int a = 1;
        int b = 3 * n + 1;
        while (a < b) {
            if ((a - 1) % 3 == 0) {
                System.out.println("  " + a);
                a++;
            } else {
                System.out.println(a + "   " + (a + 1));
                a += 2;
            }
        }
        System.out.println("  " + a);
    }
}
/*
Output:
  1
2   3
  4
5   6
  7
8   9
  10
 */