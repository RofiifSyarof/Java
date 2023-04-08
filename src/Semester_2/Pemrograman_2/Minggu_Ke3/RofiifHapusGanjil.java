package Semester_2.Pemrograman_2.Minggu_Ke3;

/*
 * Muhammad Rofiif Syarof Nur Aufaa
 * 22537141014
 */

import java.util.*;

public class RofiifHapusGanjil {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
        hapusGanjil(list);
        System.out.println(list);
    }

    public static void hapusGanjil(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                list.remove(i);
            }
        }
    }
}


/*
 * Output:
 * [0, 2, 4, 6, 8, 10]
 */