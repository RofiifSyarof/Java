package Semester_2.Struktur_Data.Pertemuan_7;

/*
 * Muhammad Rofiif Syarof Nur Aufaa
 * 22537141014
 */

import java.util.*;

class NodePasien {
    public String nama;
    public String keluhan;
    public String alamat;
    public NodePasien next;

    public NodePasien(String nama, String keluhan, String alamat) {
        this.nama = nama;
        this.keluhan = keluhan;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void displayNode() {
        System.out.println("Nama : " + nama + ", Keluhan : " + keluhan + ", Alamat : " + alamat);
    }
}

class LinkList {
    private NodePasien first; // membuat variabel first bertipe NodePasien
    private NodePasien last; // membuat variabel last bertipe NodePasien

    public LinkList() {
        first = null; // nilai awal first adalah null
        last = null; // nilai awal last adalah null
    }

    public boolean isEmpty() { // membuat method untuk mengecek apakah list kosong
        return (first == null);
    }

    public void insertLast(String nama, String keluhan, String alamat) { // membuat method untuk memasukkan data di akhir list
        NodePasien newNode = new NodePasien(nama, keluhan, alamat); // membuat objek baru dari class NodePasien
        if (isEmpty()) { // jika list kosong
            first = newNode; // maka first akan diisi dengan newNode
        } else { // jika list tidak kosong
            last.next = newNode; // maka last.next akan diisi dengan newNode
        }
        last = newNode; // dan last akan diisi dengan newNode
    }

    public NodePasien hapusFirst() { // membuat method untuk menghapus data di awal list
        NodePasien temp = first; // membuat variabel temp bertipe NodePasien dan diisi dengan first
        if (first.next == null) { // jika first.next bernilai null
            last = null; // maka last akan diisi dengan null
        }
        first = first.next; // dan first akan menunjuk data selanjutnya
        return temp; // mengembalikan nilai temp
    }

    public NodePasien peekFirst() { // membuat method untuk menampilkan data di awal list
        return first;
    }

    public void tampil() { // membuat method untuk menampilkan data
        NodePasien current = first; // membuat variabel current bertipe NodePasien dan diisi dengan first
        while (current != null) { // selama current tidak bernilai null
            current.displayNode(); // maka akan menampilkan data
            current = current.next; // dan current akan menunjuk data selanjutnya
        }
        System.out.println();
    }
}

class LinkQueue {
    private LinkList list; // membuat variabel list bertipe LinkList

    public LinkQueue() { // membuat constructor
        list = new LinkList(); // membuat objek baru dari class LinkList
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean isFull(int con, int mk) { // membuat method untuk mengecek apakah antrian penuh
       if (con == mk) {
           return true;
       } else {
           return false;
       }
    }

    public void insert(String nama, String keluhan, String alamat) { // membuat method untuk memasukkan data
        list.insertLast(nama, keluhan, alamat);
    }

    public NodePasien hapus() { // membuat method untuk menghapus data
        return list.hapusFirst();
    }

    public NodePasien peek() { // membuat method untuk menampilkan data
        return list.peekFirst();
    }

    public boolean clear() { // membuat method untuk mengosongkan antrian
        while (!list.isEmpty()) {
            list.hapusFirst();
        }
        return list.isEmpty();
    }

    public void tampilQueue() { // membuat method untuk menampilkan antrian
        System.out.println("Antrian Pasien : ");
        list.tampil();
    }
}

public class prak05_22537141014 {
    public static void main(String[] args) {
        LinkQueue antrian = new LinkQueue(); // membuat objek baru dari class LinkQueue
        System.out.print("Masukkan jumlah maksimal antrian : ");
        Scanner ui = new Scanner(System.in);
        int mk = ui.nextInt(); // membuat variabel mk bertipe integer dan diisi dengan inputan user
        int con = 0; // membuat variabel con bertipe integer dan diisi dengan 0
        int menu;
        while (true) {
            System.out.println("Pilih Menu");
            System.out.println("1. Tambah data pasien");
            System.out.println("2. Lihat antrian");
            System.out.println("3. Cari pasien");
            System.out.println("4. Hapus pasien paling awal");
            System.out.println("5. Kosongkan antrian");
            System.out.println("6. Keluar");
            System.out.print("Menu pilihan anda --> ");
            Scanner sken = new Scanner(System.in);
            menu = sken.nextInt();
            switch (menu) {
                case 1:
                    if (antrian.isFull(con, mk) == true) { // jika antrian penuh
                        System.out.println("Antrian penuh!!!");
                        System.out.println();
                    } else {
                        Scanner sken2 = new Scanner(System.in);
                        System.out.print("Masukkan nama pasien : ");
                        String nama = sken2.nextLine();
                        System.out.print("Masukkan keluhan pasien : ");
                        String keluhan = sken2.nextLine();
                        System.out.print("Masukkan alamat pasien : ");
                        String alamat = sken2.nextLine();
                        System.out.println("Pasien " + nama + " telah ditambahkan ke antrian!");
                        System.out.println();
                        antrian.insert(nama, keluhan, alamat); // memasukkan data ke antrian
                        con++; // menambahkan nilai con ketika data dimasukkan                               
                    }
                    break;
                case 2:
                    if (antrian.isEmpty()) { // jika antrian kosong
                        System.out.println("Antrian kosong");
                        System.out.println();
                    } else {
                        antrian.tampilQueue(); // menampilkan antrian
                    }
                    break;
                case 3:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong");
                        System.out.println();
                    } else {
                        Scanner sken3 = new Scanner(System.in);
                        System.out.print("Masukkan nama pasien yang ingin dicari : ");
                        String cari = sken3.nextLine();
                        NodePasien current = antrian.peek(); // membuat variabel current bertipe NodePasien dan diisi dengan data di awal antrian
                        int i = 1;
                        while (current != null) {
                            if (current.getNama().equals(cari)) { // jika nama pasien yang dicari sama dengan nama pasien yang ada di antrian
                                System.out.println("Pasien " + cari + " ditemukan pada antrian ke-" + i);
                                current.displayNode(); // menampilkan data pasien
                                break;
                            } else { // jika nama pasien yang dicari tidak sama dengan nama pasien yang ada di antrian
                                current = current.next; // maka current akan menunjuk data selanjutnya
                                i++; // menambahkan nilai i ketika data ditemukan
                            }
                        }
                        System.out.println();
                    }       
                    break;
                case 4:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong");
                    } else {
                        NodePasien hapus = antrian.hapus(); // membuat variabel hapus bertipe NodePasien dan diisi dengan data yang dihapus
                        System.out.println("Pasien " + hapus.getNama() + " telah dihapus dari antrian");
                        System.out.println();
                        con--; // mengurangi nilai con ketika data dihapus
                    }    
                    break;
                case 5:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong");
                        System.out.println();
                    } else {
                        antrian.clear(); // mengosongkan antrian
                        System.out.println("Antrian telah dikosongkan");
                        System.out.println();
                    }
                    break;
                case 6:
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    System.exit(0); // Keluar dari program
                    break;
                default: // Jika input tidak sesuai dengan menu
                    System.out.println("Menu tidak tersedia!");
                    System.out.println("Silahkan pilih menu yang tersedia!");
                    System.out.println();
                    break;
            }
        } 
    }
}