package Semester_2.Pemrograman_2.Minggu_Ke5;

/*
 * Muhammad Rofiif Syarof Nur Aufaa
 * 22537141014
 */

import java.util.*;

public class RofiifCh11Split {
    public static void main(String[] args) {
        Set<String> words = new HashSet<String>();
        words.add("to");
        words.add("be");
        words.add("or");
        words.add("not");
        words.add("that");
        words.add("is");
        words.add("the");
        words.add("question");
        System.out.println("words: " + words);
        Map<Integer, Set<String>> map = split(words);
        System.out.println("map: " + map);
    }

    public static Map<Integer, Set<String>> split(Set<String> words) {
        Map<Integer, Set<String>> map = new TreeMap<>();
        for (String word : words) {
            int length = word.length();
            if (!map.containsKey(length)) {
                map.put(length, new TreeSet<String>());
            }
            map.get(length).add(word);
        }
        return map;
    }
}

/*
 * Output:
 * words: [to, be, or, not, that, is, the, question]
 * map: {2=[to, be, or, is, the], 3=[not], 4=[that], 8=[question]}
 */