import java.util.*;

/*
 * Muhammad Rofiif Syarof Nur Aufaa
 * 22537141014
 */

class Node {
    public int Data1;
    public String Data2;
    public Node next;
    public Node previous;

    public Node(int dat1, String dat2) {
        Data1 = dat1;
        Data2 = dat2;
    }

    public void tampilNode() {
        System.out.print("{" + Data1 + ", " + Data2 + "} ");
    }
}

class DoubleLink {
    private Node first;
    private Node last;

    public DoubleLink() { //Memulai list kosong
        first = null; //pointer first digunakan untuk menunjukkan awal list
        last = null; //pointer last digunakan untuk menunjukkan akhir list
    }

    public boolean isEmpty() {
        return first==null; //jika first bernilai null, maka list kosong
    }

    public void insertFirst(int dat1, String dat2) { //memasukkan data di awal list
        Node newNode = new Node(dat1, dat2); //membuat node baru
        if(isEmpty()) { //jika list kosong
            last = newNode; //last menunjuk ke node baru
        } else { //jika list tidak kosong
            first.previous = newNode; //pointer previous dari first menunjuk ke node baru
        }
        newNode.next = first; //pointer next dari node baru menunjuk ke first
        first = newNode; //first menunjuk ke node baru
    }

    public void insertLast(int dat1, String dat2) { //memasukkan data di akhir list
        Node newNode = new Node(dat1,dat2); //membuat node baru
        if( isEmpty() ) { //jika list kosong
            first = newNode; //first menunjuk ke node baru
        } else { //jika list tidak kosong
            last.next = newNode; //pointer next dari last menunjuk ke node baru
            newNode.previous = last; //pointer previous dari node baru menunjuk ke last
        }
        last = newNode; //last menunjuk ke node baru 
    }

    public boolean insertAfter(int key, int dat1, String dat2) { //memasukkan data setelah data tertentu
        Node current = first; //membuat pointer current yang menunjuk ke first
        while(current.Data1 != key) { //mencari data yang dicari
            current = current.next; //pointer current menunjuk ke node selanjutnya
            if(current == null) { //jika data tidak ditemukan
                return false;
            }
        }
        Node newNode = new Node(dat1, dat2); //membuat node baru
        if(current==last) { //jika data yang dicari berada di akhir list
            newNode.next = null; //pointer next dari node baru menunjuk ke null
            last = newNode; //last menunjuk ke node baru
        } else { //jika data yang dicari tidak berada di akhir list
            newNode.next = current.next; //pointer next dari node baru menunjuk ke node setelah data yang dicari
            current.next.previous = newNode; //pointer previous dari node setelah data yang dicari menunjuk ke node baru
        }
        newNode.previous = current; //pointer previous dari node baru menunjuk ke data yang dicari
        current.next = newNode; //pointer next dari data yang dicari menunjuk ke node baru
        return true;
    }

    public Node deleteFirst() { //menghapus data pertama
        Node temp = first; //membuat node temp yang menunjuk ke first
        if(first.next == null) { //jika list hanya memiliki satu data
            last = null; //last menunjuk ke null
        } else { //jika list memiliki lebih dari satu data
            first.next.previous = null; //pointer previous dari node kedua menunjuk ke null
        }
        first = first.next; //first menunjuk ke node kedua
        return temp; //mengembalikan nilai temp
    }

    public Node deleteLast() { //menghapus data terakhir
        Node temp = last; //membuat node temp yang menunjuk ke last
        if(first.next == null) { //jika list hanya memiliki satu data
            first = null; //first menunjuk ke null
        } else { //jika list memiliki lebih dari satu data
            last.previous.next = null; //pointer next dari node sebelum last menunjuk ke null
        }
        last = last.previous; //last menunjuk ke node sebelum last
        return temp; //mengembalikan nilai temp
    }

    public Node hapus (int key) { //menghapus data tertentu
        Node current = first; //membuat pointer current yang menunjuk ke first
        while(current.Data1 != key) { //mencari data yang dicari
            current = current.next; 
            if(current == null) { //jika data tidak ditemukan
                return null; //mengembalikan nilai null
            }
        }
        if(current==first) { //jika data yang dicari berada di awal list
            first = current.next; //first menunjuk ke node kedua
        } else { //jika data yang dicari tidak berada di awal list
            current.previous.next = current.next; //pointer next dari node sebelum data yang dicari menunjuk ke node setelah data yang dicari
        } if(current==last) { //jika data yang dicari berada di akhir list
            last = current.previous; //last menunjuk ke node sebelum data yang dicari
        } else { //jika data yang dicari tidak berada di akhir list
            current.next.previous = current.previous; //pointer previous dari node setelah data yang dicari menunjuk ke node sebelum data yang dicari
        }
        return current; //mengembalikan nilai current
    }

    public void tampilMaju() { //menampilkan list dari awal
        System.out.print("List (first-->last): "); 
        Node current = first; //membuat pointer current yang menunjuk ke first
        while(current != null) { //mencetak data sampai pointer current menunjuk ke null
            current.tampilNode(); //memanggil method tampilNode
            current = current.next; //pointer current menunjuk ke node selanjutnya
        }
        System.out.println("");
    }

    public void tampilMundur() { //menampilkan list dari akhir
        System.out.print("List (last-->first): ");
        Node current = last; //membuat pointer current yang menunjuk ke last
        while(current != null) { //mencetak data sampai pointer current menunjuk ke null
            current.tampilNode(); //memanggil method tampilNode
            current = current.previous; //pointer current menunjuk ke node sebelumnya
        }
        System.out.println("");
    }
}

public class prak06_22537141014 {
    public static void main(String[] args) {
        DoubleLink theList = new DoubleLink(); //membuat objek theList
        Scanner sken1 = new Scanner(System.in);
        while(true) {
            System.out.println("Pilih menu: ");
            System.out.println("1. Masukkan data di awal");
            System.out.println("2. Masukkan data di akhir");
            System.out.println("3. Masukkan data setelah data tertentu");
            System.out.println("4. Hapus data pertama");
            System.out.println("5. Hapus data terakhir");
            System.out.println("6. Hapus data tertentu");
            System.out.println("7. Tampilkan data dari awal");
            System.out.println("8. Tampilkan data dari akhir");
            System.out.println("9. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = sken1.nextInt();
            switch (pilihan) {
                case 1:
                    Scanner sken2 = new Scanner(System.in);
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    int data1 = sken2.nextInt();
                    System.out.print("Masukkan nama Mahasiswa: ");
                    String data2 = sken2.next();
                    theList.insertFirst(data1, data2); //memanggil method insertFirst
                    break;
                case 2:
                    Scanner sken3 = new Scanner(System.in);
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    data1 = sken3.nextInt();
                    System.out.print("Masukkan nama Mahasiswa: ");
                    data2 = sken3.next();
                    theList.insertLast(data1, data2); //memanggil method insertLast
                    break;
                case 3:
                    Scanner sken4 = new Scanner(System.in);
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    data1 = sken4.nextInt();
                    System.out.print("Masukkan nama Mahasiswa: ");
                    data2 = sken4.next();
                    System.out.print("Masukkan data tersebut setelah data Mahasiswa dengan NIM: ");
                    int key = sken4.nextInt();
                    theList.insertAfter(key, data1, data2); //memanggil method insertAfter
                    if (theList.insertAfter(key, data1, data2) == false) { //jika data tidak ditemukan
                        System.out.println("Data tidak ditemukan");
                    } else {
                        System.out.println("Data berhasil dimasukkan");
                    }
                    break;
                case 4:
                    Node a = theList.deleteFirst(); //memanggil method deleteFirst
                    System.out.println("Data " + a.Data1 + " berhasil dihapus");
                    break;
                case 5:
                    Node b = theList.deleteLast(); //memanggil method deleteLast
                    System.out.println("Data " + b.Data1 + " berhasil dihapus");
                    break;
                case 6:
                    Scanner sken5 = new Scanner(System.in);
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    data1 = sken5.nextInt();
                    Node c = theList.hapus (data1); //memanggil method hapus
                    if (c == null) { //jika data tidak ditemukan
                        System.out.println("Data tidak ditemukan");
                    } else {
                        System.out.println("Data " + c.Data1 + " berhasil dihapus");
                    }
                    break;
                case 7:
                    theList.tampilMaju();
                    break;
                case 8:
                    theList.tampilMundur();
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan salah");
                    break;
            }
        }
    }
}
