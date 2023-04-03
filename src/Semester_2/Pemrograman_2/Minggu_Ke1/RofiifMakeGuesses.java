package Semester_2.Pemrograman_2.Minggu_Ke1;

/*
 * Muhammad Rofiif Syarof Nur Aufaa
 * 22537141014
 */

import java.util.*;

public class RofiifMakeGuesses {
    public static void main(String[] args) {
        int n = 0;
        Random a = new Random();
        int b;

        do {
            b = a.nextInt(50) + 1;
            n++;
            System.out.println("Guess = " + b);
        } while (b < 48);
        System.out.println("Jumlah Guess = " + n);
    }
}
/*
 * Output:
 * Guess = 2
 * Guess = 45
 * Guess = 45
 * Guess = 28
 * Guess = 35
 * Guess = 39
 * Guess = 30
 * Guess = 50
 * Jumlah Guess = 8
 */