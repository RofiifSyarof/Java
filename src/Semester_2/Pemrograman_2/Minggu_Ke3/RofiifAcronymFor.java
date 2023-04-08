package Semester_2.Pemrograman_2.Minggu_Ke3;

/*
 * Muhammad Rofiif Syarof Nur Aufaa
 * 22537141014
 */

import java.util.*;

public class RofiifAcronymFor {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("laughing");
        list.add("out");
        list.add("loud");
        System.out.println(acronymFor(list));
    }

    public static String acronymFor(ArrayList<String> list) {
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i).charAt(0);
        }
        return result.toUpperCase();
    }
}

/*
 * Output:
 * LOL
 */