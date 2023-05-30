package Semester_2.Pemrograman_2.Minggu_Ke7;

public class RofiifCH12EvenDigits {
    public static void main(String[] args) {
        System.out.println(evenDigits(8342116));
        System.out.println(evenDigits(4109));
        System.out.println(evenDigits(8));
        System.out.println(evenDigits(-34512));
        System.out.println(evenDigits(-163505));
        System.out.println(evenDigits(3052));
        System.out.println(evenDigits(7010496));
        System.out.println(evenDigits(35179));
        System.out.println(evenDigits(7));
    }
    
    public static int evenDigits(int n) {
        if (Math.abs(n) < 10) {
            if (n % 2 == 0) {
                return n;
            } else {
                return 0;
            }
        }

        int lastDigit = Math.abs(n % 10);
        int remaining = evenDigits(n / 10);
        if (lastDigit % 2 == 0) {
            return remaining * 10 + lastDigit;
        } else {
            return remaining;
        }   
    }
}

/*
 * Output:
 * 8426
 * 40
 * 8
 * -42
 * -60
 * 2
 * 46
 * 0
 * 0
 */