package Semester_2.Pemrograman_2.Minggu_Ke5;

/*
 * Muhammad Rofiif Syarof Nur Aufaa
 * 22537141014
 */

import java.util.*;

public class RofiifCh11RemoveEvens {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<Integer>();
        s1.add(0);
        s1.add(17);
        s1.add(16);
        s1.add(7);
        s1.add(10);
        s1.add(12);
        s1.add(13);
        s1.add(14);
        Set<Integer> s2 = removeEvens(s1);
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
    }

    public static Set<Integer> removeEvens(Set<Integer> s1) {
        Set<Integer> s2 = new TreeSet<>();
        for (Integer n : s1) {
            if (n % 2 == 0) {
                s2.add(n);
            }
        }
        s1.removeAll(s2);
        return s2;
    }
}


/*
 * Output:
 * s1: [17, 7, 13]
 * s2: [0, 10, 12, 14, 16]
 */