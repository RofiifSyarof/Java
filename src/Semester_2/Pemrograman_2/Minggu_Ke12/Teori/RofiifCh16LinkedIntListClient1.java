package Semester_2.Pemrograman_2.Minggu_Ke12.Teori;

/*
 * Muhammad Rofiif Syarof Nur Aufaa
 * 22537141014
 */

import java.util.*;

class LinkedIntList {
    private ListNode front;

    public LinkedIntList() {
        front = null;
    }

    public boolean hasOddEven() {
        ListNode current = front;
        boolean even = false;
        boolean odd = false;
        while (current != null) {
            if (current.data % 2 == 0) {
                even = true;
            } else {
                odd = true;
            }
            if (even && odd) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public String toString() {
        if (front == null) {
            return "[]";
        } else {
            String result = "[" + front.data;
            ListNode current = front.next;
            while (current != null) {
                result += ", " + current.data;
                current = current.next;
            }
            result += "]";
            return result;
        }
    }
}

public class RofiifCh16LinkedIntListClient1 {
    public static void main(String[] args) {
        int[] list1 = {38, 40, 24, 4, 3};
        test(list1);
        int[] list2 = {39, 71, 17, 3, 1};
        test(list2);
        int[] list3 = {42, 0, 38, 72, 4};
        test(list3);
        int[] list4 = {1, 3, 2, 5};
        test(list4);
        int[] list5 = {4, 5};
        test(list5);
        int[] list6 = {13};
        test(list6);
        int[] list7 = {2};
        test(list7);
        int[] list8 = {};
        test(list8);
    }

    public static void test(int[] data) {
        LinkedIntList list = new LinkedIntList();
        for (int n : data) {
            list.add(n);
        }
        System.out.println("Testing: " + list);
        System.out.println("Result : " + list.hasOddEven());
        System.out.println();
    }
}


/*
 * Output:
 * Testing: [38, 40, 24, 4, 3]
 * Result : true
 * 
 * Testing: [39, 71, 17, 3, 1]
 * Result : false
 * 
 * Testing: [42, 0, 38, 72, 4]
 * Result : false
 * 
 * Testing: [1, 3, 2, 5]
 * Result : true
 * 
 * Testing: [4, 5]
 * Result : true
 * 
 * Testing: [13]
 * Result : false
 * 
 * Testing: [2]
 * Result : false
 * 
 * Testing: []
 * Result : false
 */