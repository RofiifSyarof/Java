package Semester_2.Pemrograman_2.Minggu_Ke4;

/*
 * Muhammad Rofiif Syarof Nur Aufaa
 * 22537141014
 */

import java.util.*;

public class RofiifSwitchPairs {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("to");
        list.add("be");
        list.add("or");
        list.add("not");
        list.add("to");
        list.add("be");
        list.add("hamlet");
        System.out.println("list awal:");
        System.out.println(list);
        System.out.println("list akhir:");
        switchPairs(list);
        System.out.println(list);
    }

    public static void switchPairs(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i += 2) {
            if (i + 1 < list.size()) {
                String temp = list.get(i);
                list.set(i, list.get(i + 1));
                list.set(i + 1, temp);
            }
        }
    }
}

/*
 * Output:
 * list awal:
 * [to, be, or, not, to, be, hamlet]
 * list akhir:
 * [be, to, not, or, be, to, hamlet]
 */