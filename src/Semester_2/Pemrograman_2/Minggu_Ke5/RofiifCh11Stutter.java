package Semester_2.Pemrograman_2.Minggu_Ke5;

/*
 * Muhammad Rofiif Syarof Nur Aufaa
 * 22537141014
 */

import java.util.ArrayList;
import java.util.List;
public class RofiifCh11Stutter {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>(); 
        myList.add(1);
        myList.add(8);
        myList.add(19);
        myList.add(4);
        myList.add(17);
        System.out.println("list awal: " + myList);
        stutter(myList);
        System.out.println("list stutter: " + myList);
    }
    public static void stutter(List<Integer> myList) {
        for (int i = 0; i < myList.size(); i += 2) {
            myList.add(i, myList.get(i));
        }
    }
}
/*
Output:
list awal: [1, 8, 19, 4, 17]
list stutter: [1, 1, 8, 8, 19, 19, 4, 4, 17, 17]
 */
