import java.util.*;

class pasien {
    private String nama;
    private String keluhan;
    private String alamat;

    public pasien(String nama, String keluhan, String alamat) {
        this.nama = nama;
        this.keluhan = keluhan;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getKeluhan() {
        return keluhan;
    }

    public String getAlamat() {
        return alamat;
    }
}

public class prak03_22537141014 {
    static Queue<pasien> antrian = new LinkedList<pasien>(); // membuat queue baru
    public static void main(String[] args) {
        int menu;
        while (true) {
            System.out.println("Pilih Menu");
            System.out.println("1. Tambah data pasien");
            System.out.println("2. Lihat antrian");
            System.out.println("3. Cari pasien");
            System.out.println("4. Hapus pasien");
            System.out.println("5. Keluar");
            System.out.print("Menu pilihan anda --> ");
            Scanner sken = new Scanner(System.in);
            menu = sken.nextInt();

            switch (menu) {
                case 1:
                    tambahPasien(); // Memanggil method tambahPasien
                    break;
                case 2:
                    printAntrian(); // Memanggil method printAntrian
                    break;
                case 3:
                    cariPasien(); // Memanggil method cariPasien
                    break;
                case 4:
                    hapusPasien(); // Memanggil method hapusPasien
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program ini");
                    System.exit(0); // Keluar dari program
                    break;
                default: // Jika input tidak sesuai dengan menu
                    System.out.println("Menu tidak tersedia");
                    System.out.println("Silahkan pilih menu yang tersedia");
                    System.out.println();
                    break;
            }
        } 
    }

    public static void tambahPasien() { // Method untuk menambahkan pasien
        System.out.print("Masukkan jumlah pasien yang ingin ditambahkan: ");
        Scanner ui = new Scanner(System.in);
        int jumlah = ui.nextInt();
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Pasien ke-" + (i + 1));
            Scanner sken = new Scanner(System.in);
            System.out.print("Masukkan nama pasien: ");
            String nama = sken.nextLine();
            System.out.print("Masukkan keluhan pasien: ");
            String keluhan = sken.nextLine();
            System.out.print("Masukkan alamat pasien: ");
            String alamat = sken.nextLine();
            System.out.println();
            pasien pasienBaru = new pasien(nama, keluhan, alamat); // Membuat objek pasien baru
            antrian.add(pasienBaru); // Menambahkan pasien baru ke queue
        }
    }

    public static void printAntrian() { // Method untuk menampilkan antrian
        System.out.println("Antrian Pasien:");
        for (pasien pasienBaru : antrian) { // Looping untuk menampilkan antrian
            System.out.println(pasienBaru.getNama() + ", " + pasienBaru.getKeluhan() + ", " + pasienBaru.getAlamat());
        }
        System.out.println();
    }

    public static void cariPasien() { // Method untuk mencari pasien
        Scanner sken = new Scanner(System.in);
        System.out.print("Masukkan nama pasien yang ingin dicari: ");
        String nama = sken.nextLine();
        System.out.println("Hasil pencarian:");
        for (pasien pasienBaru : antrian) { // Looping untuk mencari pasien
            if (pasienBaru.getNama().equals(nama)) { // Jika nama pasien ditemukan
                System.out.println(pasienBaru.getNama() + " " + pasienBaru.getKeluhan() + " " + pasienBaru.getAlamat());
            } else { // Jika nama pasien tidak ditemukan
                System.out.println("Pasien tidak ditemukan");
            }  
        }
        System.out.println();
    }

    public static void hapusPasien() {
        Scanner sken = new Scanner(System.in);
        System.out.print("Masukkan nama pasien yang ingin dihapus: ");
        String nama = sken.nextLine();
        for (pasien pasienBaru : antrian) {
            if (pasienBaru.getNama().equals(nama)) { // Jika nama pasien ditemukan
                antrian.remove(pasienBaru);
                System.out.println("Pasien berhasil dihapus");
            } else { // Jika nama pasien tidak ditemukan
                System.out.println("Pasien tidak ditemukan");
            }
        }
        System.out.println();
    }
}