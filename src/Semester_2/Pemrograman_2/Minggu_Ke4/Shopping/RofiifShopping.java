package Semester_2.Pemrograman_2.Minggu_Ke4.Shopping;

/*
 * Muhammad Rofiif Syarof Nur Aufaa
 * 22537141014
 */

import java.util.*;

class Item {
    private String nama;
    private double harga;
    public Item (String n, double h) {
        nama = n;
        harga = h;
    }
    public String getName () {
        return nama;
    }
    public double getPrice () {
        return harga;
    }
}

class ItemOrder {
    private Item item;
    private int jumlah;
    boolean Discount = false;
    public ItemOrder (Item i, int j) {
        item = i;
        jumlah = j;
    }
    public Item getItem () {
        return item;
    }
    public int getQuantity () {
        return jumlah;
    }
    public double getPrice() {
        return item.getPrice() * jumlah;
    }
}

class Keranjang {
    ArrayList<ItemOrder> itemOrders;
    public Keranjang () {
        itemOrders = new ArrayList<ItemOrder>();
    }
    public void tambahItem (ItemOrder io) {
        itemOrders.add(io);
    }
    public void hapusItem (ItemOrder io) {
        itemOrders.remove(io);
    }
    public ItemOrder cariItem (String nama) {
        for(int i = 0; i < itemOrders.size(); i++) {
            ItemOrder itemOrder = itemOrders.get(i);
            if(itemOrder.getItem().getName().equals(nama)) {
                return itemOrder;
            }
        }
        return null;
    }
    public double totalDiskon(ItemOrder io) {
        int bundle = io.getQuantity() / 3;
        double discount = bundle * io.getItem().getPrice() * 0.5;
        return discount;
    }
    public double totalItemOrder () {
        double totalPrice = 0;
        for(int i = 0; i < itemOrders.size(); i++) {
            ItemOrder io = itemOrders.get(i);
            double itemPrice = io.getPrice();
            if(io.getQuantity() >= 3) {
                itemPrice -= totalDiskon(io);
            }
            totalPrice += itemPrice;
        }
        return totalPrice;
    }
}

public class RofiifShopping {
    public static void main(String[] args) {
        ArrayList<Item> ItemOrder = new ArrayList<Item>();
        Keranjang cart = new Keranjang();
        Scanner sken1 = new Scanner(System.in);
        boolean loop = true;
        while(loop) {
            System.out.println("1. Tambah Item");
            System.out.println("2. Hapus Item");
            System.out.println("3. Cari Item");
            System.out.println("4. Lihat Keranjang");
            System.out.println("5. Checkout");
            System.out.println("0. Exit");
            System.out.print("Pilih Menu: ");
            int choose = sken1.nextInt();
            switch(choose) {
                case 1:
                    System.out.print("Nama Item: ");
                    String nama = sken1.next();
                    System.out.print("Harga Item: ");
                    double harga = sken1.nextDouble();
                    System.out.print("Jumlah Item: ");
                    int jumlah = sken1.nextInt();
                    Item item = new Item(nama, harga);
                    ItemOrder itemOrder1 = new ItemOrder(item, jumlah);
                    cart.tambahItem(itemOrder1);
                    break;
                case 2:
                    System.out.print("Masukkan nama Item: ");
                    String name2 = sken1.next();
                    ItemOrder itemOrder2 = cart.cariItem(name2);
                    cart.hapusItem(itemOrder2);
                    break;
                case 3:
                    System.out.print("Item yang ingin dihapus: ");
                    String name3 = sken1.next();
                    ItemOrder itemOrder3 = cart.cariItem(name3);
                    break;
                case 4:
                    System.out.println("Item di Keranjang: ");
                    for(int i = 0; i < cart.itemOrders.size(); i++) {
                        ItemOrder ItemOrder4 = cart.itemOrders.get(i);
                        System.out.println(ItemOrder4.getItem().getName() + " " + ItemOrder4.getItem().getPrice() + " " + ItemOrder4.getQuantity());
                    }
                    break;
                case 5:
                    System.out.println("Total Harga: " + cart.totalItemOrder());
                    break;
                case 0:
                    System.out.println("Keluar dari program...");
                    loop = false;
                default:
                    System.out.println("Menu tidak tersedia, silahkan pilih menu yang tersedia!");
                    break;
            }
        }
    }
}
