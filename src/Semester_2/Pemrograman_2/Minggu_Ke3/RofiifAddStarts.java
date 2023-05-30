package Semester_2.Pemrograman_2.Minggu_Ke3;

/*
 * Muhammad Rofiif Syarof Nur Aufaa
 * 22537141014
 */

import java.util.*;

public class RofiifAddStarts {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("the");
        list.add("quick");
        list.add("brown");
        list.add("fox");
        addStarts(list);
        System.out.println(list);
    }

    public static void addStarts(ArrayList<String> list) {
        for (int i = 1; i <= list.size(); i += 2) {
            list.add(i, "*");
        }
    }
}

/*
 * Output:
 * [the, *, quick, *, brown, *, fox, *]
 */