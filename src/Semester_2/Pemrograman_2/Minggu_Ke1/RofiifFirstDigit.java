package Semester_2.Pemrograman_2.Minggu_Ke1;

/*
 * Muhammad Rofiif Syarof Nur Aufaa
 * 22537141014
 */

public class RofiifFirstDigit {
    public static void main(String[] args) {
        int a,b,c,d,e;
        a = 3572;
        b = -947;
        c = 6;
        d = 35;
        e = 123456;
        System.out.println("First digit dari " + a + " adalah " + firstDIgit(a));
        System.out.println("First digit dari " + b + " adalah " + firstDIgit(b));
        System.out.println("First digit dari " + c + " adalah " + firstDIgit(c));
        System.out.println("First digit dari " + d + " adalah " + firstDIgit(d));
        System.out.println("First digit dari " + e + " adalah " + firstDIgit(e));
    }
    public static int firstDIgit(int n) {
        while (n >= 10 || n <= -10) {
            System.out.println(n);
            n = n / 10;
        }
        return Math.abs(n);
    }
}

/*
 * Output:
 * First digit dari 3572 adalah 3
 * First digit dari -947 adalah 9
 * First digit dari 6 adalah 6
 * First digit dari 35 adalah 3
 * First digit dari 123456 adalah 1
 */