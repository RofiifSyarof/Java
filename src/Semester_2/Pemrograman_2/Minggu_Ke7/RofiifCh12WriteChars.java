package Semester_2.Pemrograman_2.Minggu_Ke7;

/*
 * Muhammad Rofiif Syarof Nur Aufaa
 * 22537141014
 */

public class RofiifCh12WriteChars {
    public static void main(String[] args) {
        writeChars(1);
        System.out.println();
        writeChars(2);
        System.out.println();
        writeChars(3);
        System.out.println();
        writeChars(4);
        System.out.println();
        writeChars(5);
        System.out.println();
        writeChars(6);
        System.out.println();
        writeChars(7);
        System.out.println();
        writeChars(8);
    }

    public static void writeChars(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        } else if (n == 1) {
            System.out.print("*");
        } else if (n == 2) {
            System.out.print("**");
        } else {
            System.out.print("<");
            writeChars(n - 2);
            System.out.print(">");
        }
    }
}

/*
 * Output:
 * *
 * **
 * <*>
 * <**>
 * <<*>>
 * <<**>>
 * <<<*>>>
 * <<<**>>>
 */