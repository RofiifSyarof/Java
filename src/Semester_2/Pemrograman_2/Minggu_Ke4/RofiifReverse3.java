package Semester_2.Pemrograman_2.Minggu_Ke4;

/*
 * Muhammad Rofiif Syarof Nur Aufaa
 * 22537141014
 */

import java.util.*;

public class RofiifReverse3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(8);
        list.add(19);
        list.add(42);
        list.add(7);
        list.add(26);
        list.add(19);
        list.add(-8);
        list.add(193);
        list.add(204);
        list.add(6);
        list.add(-4);
        System.out.println("list awal:");
        System.out.println(list);
        System.out.println("list akhir:");
        reverse3(list);
        System.out.println(list);
    }

    public static void reverse3(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i += 3) {
            if (i + 2 < list.size()) {
                int temp = list.get(i);
                list.set(i, list.get(i + 2));
                list.set(i + 2, temp);
            }
        }
    }
}

/*
 * Output:
 * list awal:
 * [3, 8, 19, 42, 7, 26, 19, -8, 193, 204, 6, -4]
 * list akhir:
 * [19, 8, 3, 26, 7, 42, 193, -8, 19, -4, 6, 204]
 */