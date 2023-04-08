package Semester_2.Pemrograman_2.Minggu_Ke5;

/*
 * Muhammad Rofiif Syarof Nur Aufaa
 * 22537141014
 */

import java.util.*;

public class RofiifCh11Counts {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        list.add(4);
        list.add(-2);
        list.add(3);
        list.add(9);
        list.add(4);
        list.add(17);
        list.add(5);
        list.add(29);
        list.add(14);
        list.add(87);
        list.add(4);
        list.add(-2);
        list.add(100);
        set.add(-2);
        set.add(4);
        set.add(29);
        System.out.println("list: " + list);
        System.out.println("set: " + set);
        System.out.println("count: " + countOccurrences(list, set));
    }

    public static Map<Integer, Integer> countOccurrences(List<Integer> list, Set<Integer> set) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (Integer n : set) {
            int count = 0;
            for (Integer m : list) {
                if (m.equals(n)) {
                    count++;
                }
            }
            counts.put(n, count);
        }
        return counts;
    }    
}

/*
 * Output:
 * list: [4, -2, 3, 9, 4, 17, 5, 29, 14, 87, 4, -2, 100]
 * set: [29, 4, -2]
 * count: {-2=2, 4=3, 29=1}
 */