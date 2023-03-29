package Semester_2.Struktur_Data.Pertemuan_6;

import java.util.*;

class NodeMhs {
    public String nama;
    public String nim;
    public String kota;
    public NodeMhs next;
    
    public NodeMhs(String nimMhs, String namaMhs, String kotaMhs) {
        nim = nimMhs;
        nama = namaMhs;
        kota = kotaMhs;
    }

    public String getNama() { // method untuk mengambil data nama
        return nama;
    }

    public String getNim() { // method untuk mengambil data nim
        return nim;
    }

    public String getKota() { // method untuk mengambil data kota
        return kota;
    }
    
    public void displayNode() { // method untuk menampilkan data mahasiswa
        System.out.println("NIM: " + nim + ", Nama: " + nama + ", Kota Asal: " + kota);
    }
}

class LinkList {
    private NodeMhs first; // referensi ke item pertama
    
    public LinkList() { 
        first = null; // data belum ada
    }
    
    public boolean isEmpty() { // jika list kosong makan akan bernilai true
        return (first == null);
    }
    
    public void insertFirst(String nimMhs, String namaMhs, String kotaMhs) { // method untuk memasukkan data mahasiswa
        NodeMhs newNode = new NodeMhs(nimMhs, namaMhs, kotaMhs); // membuat node baru
        newNode.next = first; // newNode akan menunjuk old first
        first = newNode; // first sekarang merujuk pada node baru
    }

    public void addMhs(LinkList theList) { // method untuk memasukkan data mahasiswa
        Scanner sken3 = new Scanner(System.in);
        System.out.println("NIM: ");
        String namaMhs = sken3.nextLine();
        System.out.println("Nama: ");
        String nimMhs = sken3.nextLine();
        System.out.println("Kota: ");
        String kotaMhs = sken3.nextLine();
        theList.insertFirst(nimMhs, namaMhs, kotaMhs); // memasukkan data mahasiswa
    }

    public NodeMhs hapusAkhir(LinkList theList) { // method untuk menghapus data mahasiswa yang terakhir ditambahkan
        NodeMhs current = first; // current akan merujuk pada first
        NodeMhs previous = first; // previous akan merujuk pada first
        while (current.next != null) { // jika current.next tidak sama dengan null
            previous = current; // previous akan merujuk pada current
            current = current.next; // current akan merujuk pada current.next
        }
        previous.next = null; // previous.next akan merujuk pada null
        return current; // mengembalikan nilai current
    } 
    
    public void displayList() { // method untuk menampilkan data mahasiswa
        System.out.println("Tampilan data Mahasiswa dari yang terbaru: ");
        NodeMhs current = first; // current akan merujuk pada first
        while(current != null) { // jika current tidak sama dengan null
            current.displayNode(); // menampilkan data mahasiswa saat ini
            current = current.next; // current akan merujuk pada current.next untuk menampilkan data selanjutnya
        }
        System.out.println(""); // memberi jarak
    }

    public boolean checkNim(String nimMhs) { // method untuk mengecek apakah nim sudah ada atau belum
        NodeMhs current = first; // current akan merujuk pada first
        while (current != null) { // jika current tidak sama dengan null
            if (current.getNim().equals(nimMhs)) { // jika nim yang dimasukkan sama dengan nim yang ada
                return true; // Terdapat nim yang sama
            } else {  // jika nim yang dimasukkan tidak sama dengan nim yang ada
            current = current.next;
            }
        }
        return false;
    }

    public void cariNim(String nim) { // method untuk mencari data mahasiswa berdasarkan nim
        NodeMhs current = first;
        while (current != null) {
            if (current.getNim().equals(nim)) { // jika nim yang dimasukkan sama dengan nim yang ada
                System.out.println("Data mahasiswa dengan NIM " + nim + " ditemukan"); 
                current.displayNode(); // menampilkan data mahasiswa saat ini
                break;
            } else { // jika nim yang dimasukkan tidak sama dengan nim yang ada
                current = current.next; // current akan merujuk pada current.next untuk mencari data selanjutnya
            }
        }
    }

    public void cariNama(String nama) { // method untuk mencari data mahasiswa berdasarkan nama
        NodeMhs current = first;
        while (current != null) {
            if (current.getNama().equals(nama)) { // jika nama yang dimasukkan sama dengan nama yang ada
                System.out.println("Data mahasiswa dengan Nama " + nama + " ditemukan");
                current.displayNode(); // menampilkan data mahasiswa saat ini
                break;
            } else { // jika nama yang dimasukkan tidak sama dengan nama yang ada
                current = current.next;  // current akan merujuk pada current.next untuk mencari data selanjutnya
            }
        }
    }

    public void cariKota(String kota) { // method untuk mencari data mahasiswa berdasarkan kota
        NodeMhs current = first;
        while (current != null) {
            if (current.getKota().equals(kota)) { // jika kota yang dimasukkan sama dengan kota yang ada
                System.out.println("Data mahasiswa dengan Kota " + kota + " ditemukan");
                current.displayNode(); // menampilkan data mahasiswa saat ini
                break;
            } else { // jika kota yang dimasukkan tidak sama dengan kota yang ada
                current = current.next; // current akan merujuk pada current.next untuk mencari data selanjutnya
            }
        }
    }
} // end class LinkList

public class prak04_22537141014 {
    public static void main(String[] args) { // method main
        Scanner sken = new Scanner(System.in);
        LinkList theList = new LinkList(); // membuat objek theList
        while (true) {
            System.out.println("Pilih Menu");
            System.out.println("1. Tambah data mahasiswa");
            System.out.println("2. Lihat data mahasiswa");
            System.out.println("3. Cari data mahasiswa");
            System.out.println("4. Hapus data mahasiswa yang terakhir ditambahkan");
            System.out.println("5. Keluar");
            System.out.print("Menu pilihan anda --> ");
            int menu = sken.nextInt();
            switch (menu) {
                case 1: // menambah data mahasiswa
                    Scanner sken2 = new Scanner(System.in);
                    System.out.println("Berapa banyak data yang ingin anda masukkan?");
                    int banyakData = sken2.nextInt();
                    for (int i = 0; i < banyakData; i++) {
                        Scanner sken4 = new Scanner(System.in);
                        System.out.println("Masukkan data ke-" + (i + 1));
                        System.out.print("NIM: ");
                        String nimMhs = sken4.nextLine();
                        System.out.print("Nama: ");
                        String namaMhs = sken4.nextLine();
                        System.out.print("Kota: ");
                        String kotaMhs = sken4.nextLine();
                        if (theList.checkNim(nimMhs)) { // jika nim sudah ada
                            System.out.println("Data mahasiswa dengan NIM " + nimMhs + " sudah ada!");
                            i--; // mengurangi i agar data yang dimasukkan tidak berkurang
                        } else { // jika nim belum ada
                            theList.insertFirst(nimMhs, namaMhs, kotaMhs); // memasukkan data mahasiswa ke dalam linked list
                        }
                    }
                    break;

                case 2: // menampilkan data mahasiswa
                    theList.displayList(); // memanggil method displayList
                    break;

                case 3: // mencari data mahasiswa
                    Scanner sken5 = new Scanner(System.in);
                    System.out.println("Cari berdasarkan");
                    System.out.println("1. NIM");
                    System.out.println("2. Nama");
                    System.out.println("3. Kota");
                    System.out.print("Pilihan anda --> ");
                    int pilihan = sken5.nextInt();
                    switch (pilihan) {
                        case 1: // mencari data mahasiswa berdasarkan nim
                            Scanner sken6 = new Scanner(System.in);
                            System.out.print("Masukkan NIM yang ingin dicari: ");
                            String nim = sken6.nextLine();
                            theList.cariNim(nim); // memanggil method cariNim
                            break;

                        case 2: // mencari data mahasiswa berdasarkan nama
                            Scanner sken7 = new Scanner(System.in);
                            System.out.print("Masukkan Nama yang ingin dicari: ");
                            String nama = sken7.nextLine();
                            theList.cariNama(nama); // memanggil method cariNama
                            break;

                        case 3: // mencari data mahasiswa berdasarkan kota
                            Scanner sken8 = new Scanner(System.in);
                            System.out.print("Masukkan Kota yang ingin dicari: ");
                            String kota = sken8.nextLine();
                            theList.cariKota(kota); // memanggil method cariKota
                            break;

                        default: // jika pilihan tidak tersedia
                            System.out.println("Pilihan tidak tersedia!");
                            break;
                    }
                    break;
                case 4: // menghapus data mahasiswa yang terakhir ditambahkan
                    theList.hapusAkhir(theList); // memanggil method hapusAkhir
                    System.out.println("Data mahasiswa yang terakhir ditambahkan berhasil dihapus");
                    break;

                case 5: // keluar
                    System.exit(0); // keluar dari program
                    break;

                default: // jika menu tidak tersedia
                    System.out.println("Menu tidak tersedia");
                    System.out.println("Silakan pilih menu yang tersedia");
                    break;
            }
        }
    } // end method main
}
