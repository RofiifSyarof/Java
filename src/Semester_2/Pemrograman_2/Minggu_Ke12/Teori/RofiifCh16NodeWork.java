package Semester_2.Pemrograman_2.Minggu_Ke12.Teori;

/*
 * Muhammad Rofiif Syarof Nur Aufaa
 * 22537141014
 */

import java.util.*;

public class RofiifCh16NodeWork {
    public static void main(String[] args) {
        ListNode dummy = new ListNode(0);

        // problem #1
        ListNode list = new ListNode (1, new ListNode (2));
        list.next = new ListNode (3, list.next);
        // output: list -> 1 -> 3 -> 2

        // problem #2
        ListNode list = new Listnode (1, new ListNode (3));
        ListNode temp = new ListNode (2, new ListNode (4));
        list.next.next = temp.next;
        temp.next = list.next;
        list.next = temp;
        // output: list -> 1 -> 2 -> 3 -> 4
    }
}
