package Semester_2.Pemrograman_2.Minggu_Ke1;

/*
 * Muhammad Rofiif Syarof Nur Aufaa
 * 22537141014
 */
 
public class RofiifLastDigit {
    public static void main(String[] args) {
        int a,b,c,d,e;
        a = 3572;
        b = -947;
        c = 6;
        d = 35;
        e = 123456;
        System.out.println("Last digit dari " + a + " adalah " + lastDigit(a));
        System.out.println("Last digit dari " + b + " adalah " + lastDigit(b));
        System.out.println("Last digit dari " + c + " adalah " + lastDigit(c));
        System.out.println("Last digit dari " + d + " adalah " + lastDigit(d));
        System.out.println("Last digit dari " + e + " adalah " + lastDigit(e));
    }
    public static int lastDigit(int n) {
        return Math.abs(n % 10);
    }
}
/*
 * Output:
 * Last digit dari 3572 adalah 2
 * Last digit dari -947 adalah 7
 * Last digit dari 6 adalah 6
 * Last digit dari 35 adalah 5
 * Last digit dari 123456 adalah 6
 */