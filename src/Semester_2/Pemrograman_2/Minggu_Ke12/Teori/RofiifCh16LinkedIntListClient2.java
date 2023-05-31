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

    public void removeLast(int value) {
        if (front != null) {
            ListNode current = front;
            ListNode spot = null;
            while (current.next != null) {
                if (current.next.data == value) {
                    spot = current;
                }
                current = current.next;
            }
            if (spot != null) {
                spot.next = spot.next.next;
            } else if (front.data == value) {
                front = front.next;
            }
        }   
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

public class RofiifCh16LinkedIntListClient2 {
    public static void main(String[] args) {
        int[] data = {3, 2, 3, 3, 19, 8, 3, 43, 64, 1, 0, 3};
        LinkedIntList list = new LinkedIntList();
        System.out.print("Result for empty list: ");
        list.removeLast(3);
        System.out.println(list);

        for (int n : data) {
            list.add(n);
        }
        System.out.println("Testing: " + list);
        for (int i = 0; i < 6; i++) {
            list.removeLast(3);
            System.out.println("Result : " + list);
        }
    }
}

/*
 * Output:
 * Result for empty list: []
 * Testing: [3, 2, 3, 3, 19, 8, 3, 43, 64, 1, 0, 3]
 * Result : [3, 2, 3, 3, 19, 8, 3, 43, 64, 1, 0]
 * Result : [3, 2, 3, 3, 19, 8, 43, 64, 1, 0]
 * Result : [3, 2, 3, 19, 8, 43, 64, 1, 0]
 * Result : [3, 2, 19, 8, 43, 64, 1, 0]
 * Result : [2, 19, 8, 43, 64, 1, 0]
 * Result : [2, 19, 8, 43, 64, 1, 0]
 */