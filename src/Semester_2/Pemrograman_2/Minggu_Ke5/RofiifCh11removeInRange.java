package Semester_2.Pemrograman_2.Minggu_Ke5;

/*
 * Muhammad Rofiif Syarof Nur Aufaa
 * 22537141014
 */

import java.util.ArrayList;
import java.util.Scanner; 
public class RofiifCh11RemoveInRange {
    public static void main(String[] args) {
        Scanner sken = new Scanner(System.in);
        ArrayList<Integer> myList = new ArrayList<Integer>();
        System.out.print("Masukkan jumlah data: ");
        int jml = sken.nextInt();
        for (int i = 0; i < jml; i++) {
            System.out.print("Masukkan data ke-" + (i+1) + ": ");
            int data = sken.nextInt();
            myList.add(data);
        }
        System.out.print("Masukkan data yang akan dihapus: ");
        int data = sken.nextInt();
        System.out.print("Masukkan nilai minimum: ");
        int min = sken.nextInt();
        System.out.print("Masukkan nilai maksimum: ");
        int max = sken.nextInt();
        System.out.println("list awal: " + myList);
        removeInRange(myList, data, min, max);
        System.out.println("list removeInRange: " + myList);
    }
    public static void removeInRange(ArrayList<Integer> myList, int data, int min, int max) {
        for (int i = min; i < max; i++) {
            if (myList.get(i) == data) {
                myList.remove(i);
                i--;
                max--;
            }
        }
    }
}
/*
Output:
list awal: [0, 0, 2, 0, 4, 0, 6, 0, 8, 0, 10, 0, 12, 0, 14, 0, 16]
list removeInRange: [0, 0, 2, 0, 4, 6, 8, 10, 12, 0, 14, 0, 16] 
 */