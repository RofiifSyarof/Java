package Semester_2.Pemrograman_2.Minggu_Ke4;

/*
 * Muhammad Rofiif Syarof Nur Aufaa
 * 22537141014
 */

import java.util.*;

public class RofiifIntersect {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(4);
        list1.add(8);
        list1.add(9);
        list1.add(11);
        list1.add(15);
        list1.add(17);
        list1.add(28);
        list1.add(41);
        list1.add(59);
        list2.add(4);
        list2.add(7);
        list2.add(11);
        list2.add(17);
        list2.add(19);
        list2.add(20);
        list2.add(23);
        list2.add(28);
        list2.add(37);
        list2.add(59);
        list2.add(81);
        System.out.println("Tampilan kedua list:");
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println("Tampilan list yang berisi elemen yang sama:");
        System.out.println(intersect(list1, list2));
    }

    public static ArrayList<Integer> intersect(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i) == list2.get(j)) {
                    list.add(list1.get(i));
                }
            }
        }
        return list;
    }
}

/*
 * Output:
 * Tampilan kedua list:
 * list1: [1, 4, 8, 9, 11, 15, 17, 28, 41, 59]
 * list2: [4, 7, 11, 17, 19, 20, 23, 28, 37, 59, 81]
 * Tampilan list yang berisi elemen yang sama:
 * [4, 11, 17, 28, 59]
 */