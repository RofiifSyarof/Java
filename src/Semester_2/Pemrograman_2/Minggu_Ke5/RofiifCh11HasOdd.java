package Semester_2.Pemrograman_2.Minggu_Ke5;

/*
 * Muhammad Rofiif Syarof Nur Aufaa
 * 22537141014
 */

import java.util.*;
public class RofiifCh11HasOdd {
    public static void main(String[] args) {
        Scanner sken = new Scanner(System.in);
        Set<Integer> set = new TreeSet<Integer>();
        System.out.print("Masukkan jumlah data: ");
        int jml = sken.nextInt();
        for (int i = 0; i < jml; i++) {
            System.out.print("Masukkan data ke-" + (i+1) + ": ");
            int data = sken.nextInt();
            set.add(data);
        }
        if (hasOdd(set)) {
            System.out.println("Set memiliki bilangan ganjil");
        } else {
            System.out.println("Set tidak memiliki bilangan ganjil");
        }
    }
    public static boolean hasOdd(Set<Integer> set) {
        Iterator<Integer> i = set.iterator();
        while (i.hasNext()) {
            if (i.next() % 2 != 0) {
                return true;
            }
        }
        return false;
    }
}
/*
Output:
Masukkan jumlah data: 6
Masukkan data ke-1: 14
Masukkan data ke-2: 6
Masukkan data ke-3: 37
Masukkan data ke-4: 2
Masukkan data ke-5: 19
Masukkan data ke-6: 8
Set memiliki bilangan ganjil
*/