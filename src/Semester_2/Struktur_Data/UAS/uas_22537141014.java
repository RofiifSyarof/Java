package Semester_2.Struktur_Data.UAS;

/*
 * Muhammad Rofiif Syarof Nur Aufaa
 * 22537141014
 */

/*
 * Metode yang memiliki nama rekursif digunakan untuk melakukan transversal pada Tree
 * Metode yang tidak ada nama rekursif digunakan untuk memanggil metode rekursif
 * Pemisahan dilakukan untuk mempermudah penggunaan metode
 */

import java.util.*;

class Node { // membuat class Node
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data; // mengisi data
        left = right = null; // membuat node kiri dan kanan
    }
}

class BinaryTree { // membuat class BinaryTree
    private Node root;

    public BinaryTree() {
        root = null; // membuat root
    }

    public void insert(int data) {
        root = insertRekursif(root, data);  // memanggil method insertRekursif
    }

    private Node insertRekursif(Node root, int data) { // membuat node baru
        if (root == null) { // jika root kosong
            root = new Node(data); // membuat node baru
            return root; // mengembalikan nilai root
        }

        if (data < root.data) // jika data lebih kecil dari root
            root.left = insertRekursif(root.left, data); // membuat node baru di kiri
        else if (data > root.data) // jika data lebih besar dari root
            root.right = insertRekursif(root.right, data); // membuat node baru di kanan

        return root;
    }

    public void hapus(int data) {
        root = hapusRekursif(root, data); // memanggil method hapusRekursif
    }

    private Node hapusRekursif(Node root, int data) { // membuat metode untuk menghapus node
        if (root == null) // jika root kosong
            return root; // mengembalikan nilai root

        if (data < root.data) // jika data lebih kecil dari root
            root.left = hapusRekursif(root.left, data); // membuat node baru di kiri
        else if (data > root.data) // jika data lebih besar dari root
            root.right = hapusRekursif(root.right, data); // membuat node baru di kanan
        else { // jika data sama dengan root
            if (root.left == null) // jika node kiri kosong
                return root.right; // mengembalikan nilai node kanan
            else if (root.right == null) // jika node kanan kosong
                return root.left; // mengembalikan nilai node kiri

            root.data = cariTerendah(root.right); // mencari nilai terendah
            root.right = hapusRekursif(root.right, root.data); // menghapus node terendah
        }

        return root; // mengembalikan nilai root
    }

    private int cariTerendah(Node root) { // membuat metode untuk mencari nilai terendah
        int min = root.data; // mengisi nilai min dengan data root
        while (root.left != null) { // jika node kiri tidak kosong
            min = root.left.data; // mengisi nilai min dengan data node kiri
            root = root.left; // mengisi nilai root dengan node kiri
        }
        return min; // mengembalikan nilai min
    }

    public void preOrder() {
        preOrderRekursif(root); // memanggil method preOrderRekursif
        System.out.println();
    }

    private void preOrderRekursif(Node root) { // membuat metode untuk menampilkan data secara preOrder
        if (root != null) { // jika root tidak kosong
            System.out.print(root.data + " "); // menampilkan root
            preOrderRekursif(root.left); // menampilkan data di kiri
            preOrderRekursif(root.right); // menampilkan data di kanan
        }
    }

    public void inOrder() {
        inOrderRekursif(root); // memanggil method inOrderRekursif
        System.out.println();
    }

    private void inOrderRekursif(Node root) { // membuat metode untuk menampilkan data secara inOrder
        if (root != null) { // jika root tidak kosong
            inOrderRekursif(root.left); // menampilkan data di kiri
            System.out.print(root.data + " "); // menampilkan root
            inOrderRekursif(root.right); // menampilkan data di kanan
        }
    }

    public void postOrder() {
        postOrderRekursif(root); // memanggil method postOrderRekursif
        System.out.println();
    }

    private void postOrderRekursif(Node root) { // membuat metode untuk menampilkan data secara postOrder
        if (root != null) { // jika root tidak kosong
            postOrderRekursif(root.left); // menampilkan data di kiri
            postOrderRekursif(root.right); // menampilkan data di kanan
            System.out.print(root.data + " "); // menampilkan root
        }
    }

    public List<Integer> getNodeLeaf() { // membuat metode untuk menampilkan node leaf
        List<Integer> nodeLeaf = new ArrayList<>(); // membuat list baru
        getNodeLeafRekursif(root, nodeLeaf); // memanggil method getNodeLeafRekursif
        return nodeLeaf; // mengembalikan nilai nodeLeaf
    }

    private void getNodeLeafRekursif(Node root, List<Integer> nodeLeaf) { // membuat metode untuk menampilkan node leaf
        if (root == null) // jika root kosong
            return; // mengembalikan nilai

        if (root.left == null && root.right == null) // jika node kiri dan kanan kosong
            nodeLeaf.add(root.data); // menambahkan data ke nodeLeaf

        getNodeLeafRekursif(root.left, nodeLeaf); // menampilkan data di kiri
        getNodeLeafRekursif(root.right, nodeLeaf); // menampilkan data di kanan
    }

    public int getDataTerendah() { // membuat metode untuk menampilkan data terendah
        if (root == null) // jika root kosong
            return -1; // untuk menandakan bahwa tree kosong

        Node current = root; // mengisi nilai current dengan root
        while (current.left != null) { // jika node kiri tidak kosong
            current = current.left; // mengisi nilai current dengan node kiri
        }
        return current.data; // mengembalikan nilai current
    }

    public int getDataTertinggi() { // membuat metode untuk menampilkan data tertinggi
        if (root == null) // jika root kosong
            return -1; // untuk menandakan bahwa tree kosong

        Node current = root; // mengisi nilai current dengan root
        while (current.right != null) { // jika node kanan tidak kosong
            current = current.right; // mengisi nilai current dengan node kanan
        }
        return current.data; // mengembalikan nilai current
    }
}

public class uas_22537141014 {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        Scanner sken1 = new Scanner(System.in);
        int menu;

        while (true) {
            System.out.println("Binary Tree Menu:");
            System.out.println("1. Masukkan data");
            System.out.println("2. Hapus data");
            System.out.println("3. Tampilkan data");
            System.out.println("4. Print node leaf");
            System.out.println("5. Print minimum and maximum values");
            System.out.println("0. Exit");
            System.out.print("Enter your menu: ");
            menu = sken1.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Data otomatis adalah 25,87,17,6,43,9");
                    System.out.print("Apakah Anda ingin memasukkan data secara otomatis? (y/n) ");
                    Scanner sken2 = new Scanner(System.in);
                    String jawaban = sken2.nextLine();
                    if (jawaban.equals("y")) { // jika jawaban y
                        tree.insert(25);
                        tree.insert(87);
                        tree.insert(17);
                        tree.insert(6);
                        tree.insert(43);
                        tree.insert(9);
                        System.out.println("Data otomatis berhasil dimasukkan.");
                    } else if (jawaban.equals("n")) { // jika jawaban n
                        System.out.print("Berapa total data yang ingin Anda masukkan? ");
                        Scanner sken3 = new Scanner(System.in);
                        int jumlahData = sken3.nextInt();
                        for (int i = 0; i < jumlahData; i++) {
                            System.out.print("Masukkan data ke-" + (i + 1) + ": ");
                            Scanner sken4 = new Scanner(System.in);
                            int data = sken4.nextInt();
                            tree.insert(data);
                        }
                        System.out.println("Data berhasil dimasukkan.");
                    } else {
                        System.out.println("Input tidak valid.");
                    }
                    break;
                case 2:
                    System.out.print("Data berapa yang ingin Anda hapus? ");
                    Scanner sken5 = new Scanner(System.in);
                    int data = sken5.nextInt();
                    tree.hapus(data);
                    break;
                case 3:
                    System.out.println("Pilih metode untuk menampilkan data!");
                    System.out.println("1. Pre-order traversal");
                    System.out.println("2. In-order traversal");
                    System.out.println("3. Post-order traversal");
                    System.out.print("Pilihan Anda: ");
                    Scanner sken6 = new Scanner(System.in);
                    int pilihan = sken6.nextInt();
                    switch (pilihan) {
                        case 1:
                            System.out.print("Pre-order traversal: ");
                            tree.preOrder();
                            System.out.println();
                            break;
                        case 2:
                            System.out.print("In-order traversal: ");
                            tree.inOrder();
                            System.out.println();
                            break;
                        case 3:
                            System.out.print("Post-order traversal: ");
                            tree.postOrder();
                            System.out.println();
                            break;
                        default:
                            System.out.println("Input tidak valid.");
                    }
                    break;
                case 4:
                    List<Integer> nodeLeaf = tree.getNodeLeaf();
                    System.out.print("Leaf nodes: ");
                    for (int leafNode : nodeLeaf) {
                        System.out.print(leafNode + " ");
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Data terendah: " + tree.getDataTerendah());
                    System.out.println("Data tertinggi: " + tree.getDataTertinggi());
                    break;
                case 0:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Input tidak valid. Silakan pilih Menu yang ada.");
            }
            System.out.println();
        }
    }
}
