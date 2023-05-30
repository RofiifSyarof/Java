package Semester_2.Pemrograman_2.Minggu_Ke12;

/*
 * Muhammad Rofiif Syarof Nur Aufaa
 * 22537141014
 */

import java.util.*;

public class RofiifCh14RemoveMin {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(2);
        s.push(8);
        s.push(3);
        s.push(19);
        s.push(2);
        s.push(3);
        s.push(2);
        s.push(7);
        s.push(12);
        s.push(-8);
        s.push(4);
        System.out.println(s);
        removeMin(s);
        System.out.println(s);
        removeMin(s);
        System.out.println(s);
    }

    public static void removeMin(Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<Integer>();
        int min = s.peek();
        
        while(!s.isEmpty()) {
            int n = s.pop();
            
            if(n < min)
                min = n;
                
            q.add(n);
        }
        
        while(!q.isEmpty()) {
            int n = q.remove();
            
            if(n > min)
                s.push(n);
        }
        
        while(!s.isEmpty())
            q.add(s.pop());
            
        while(!q.isEmpty())
            s.push(q.remove());
    }
}

/*
 * Output:
 * [2, 8, 3, 19, 2, 3, 2, 7, 12, -8, 4]
 * [2, 8, 3, 19, 2, 3, 2, 7, 12, 4]
 * [8, 3, 19, 3, 7, 12, 4]
 */