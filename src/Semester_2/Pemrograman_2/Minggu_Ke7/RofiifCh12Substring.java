package Semester_2.Pemrograman_2.Minggu_Ke7;

/*
 * Muhammad Rofiif Syarof Nur Aufaa
 * 22537141014
 */

public class RofiifCh12Substring {
    public static void main(String[] args) {
        System.out.println(substring("hello", 0, 2));
        System.out.println(substring("hamburger", 4, 8));
        System.out.println(substring("howdy", 3, 3));
    }

    public static String substring(String str, int start, int end) {
        // Check for invalid input
        if (start < 0 || end > str.length() || start > end) {
            throw new IllegalArgumentException("Invalid start or end index");
        }
        
        // Base case: if start index is equal to end index, return an empty string
        if (start == end) {
            return "";
        }
        
        // Recursive case: get the substring excluding the first character and append it to the first character
        return str.charAt(start) + substring(str, start + 1, end);
    }
}

/*
 * Output:
 * he
 * urge
 * 
 */