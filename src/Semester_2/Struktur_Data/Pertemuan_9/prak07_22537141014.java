/*
 * Muhammad Rofiif Syarof Nur Aufaa
 * 22537141014
 */

import java.util.*;

class Node { // membuat class Node
    int data; // membuat variabel data bertipe int
    Node next; // membuat variabel next bertipe Node

    public Node(int data) { // membuat constructor Node
        this.data = data; // menginisialisasi variabel data
        this.next = null; // menginisialisasi variabel next
    }
}

class LinkList { // membuat class LinkList
    Node head; // membuat variabel head bertipe Node
    
    public LinkList() { // membuat constructor LinkList
        this.head = null; // menginisialisasi variabel head
    }

    public void masukkanSebelum(int newdata, int sebelumData) { // membuat method untuk memasukkan data sebelum data tertentu
        Node newNode = new Node(newdata); // membuat objek baru dari class Node
        if (head == null) { // jika head kosong
            head = newNode; // maka head akan diisi dengan newNode
            return; // dan method akan berhenti
        } else if (head.data == sebelumData) { // jika head tidak kosong dan head.data sama dengan sebelumData
            newNode.next = head; // maka newNode.next akan diisi dengan head
            head = newNode; // dan head akan diisi dengan newNode
            return; // dan method akan berhenti
        } else { // jika head tidak kosong dan head.data tidak sama dengan sebelumData
            Node current = head; // maka current akan diisi dengan head
            while (current.next != null && current.next.data != sebelumData) { // selama current.next tidak kosong dan current.next.data tidak sama dengan sebelumData
                current = current.next; // maka current akan diisi dengan current.next
            }
            if (current.next == null) { // jika current.next kosong
                System.out.println("Data tidak ditemukan");
                return; // dan method akan berhenti
            } else { // jika current.next tidak kosong
                newNode.next = current.next; // maka newNode.next akan diisi dengan current.next
                current.next = newNode; // dan current.next akan diisi dengan newNode
            }
        }
    }

    public void displayList() { // membuat method untuk menampilkan data
        Node current = head; // membuat variabel current bertipe Node dan diisi dengan head
        while (current != null) { // selama current tidak kosong
            System.out.print(current.data + " "); // maka akan menampilkan data
            current = current.next; // dan current akan diisi dengan current.next
        }
    }
}

public class prak07_22537141014 {
    public static void main(String[] args) { // membuat method main
        LinkList list = new LinkList(); // membuat objek baru dari class LinkList
        Scanner sken = new Scanner(System.in); // membuat objek baru dari class Scanner
        
        System.out.print("Masukkan banyak data: "); 
        int banyakData = sken.nextInt(); // membuat variabel banyakData bertipe int dan diisi dengan inputan user
        for (int i = 0; i < banyakData; i++) { // melakukan perulangan sebanyak banyakData
            Scanner sken2 = new Scanner(System.in); // membuat objek baru dari class Scanner
            System.out.print("Masukkan data ke-" + (i + 1) + ": ");
            int data = sken2.nextInt(); // membuat variabel data bertipe int dan diisi dengan inputan user
            System.out.print("Data tersebut akan dimasukkan sebelum data? ");
            int before = sken2.nextInt(); // membuat variabel before bertipe int dan diisi dengan inputan user
            list.masukkanSebelum(data, before); // memanggil method masukkanSebelum
        }
        
        System.out.println();
        System.out.println("Tampilan data adalah sebagai berikut:");
        list.displayList(); // memanggil method displayList
    }
}
