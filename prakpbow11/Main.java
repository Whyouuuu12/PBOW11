/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prakpbow11;

/**
 *
 * @author hp
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Perpustakaan
        Perpustakaan perpustakaan = new Perpustakaan();

        // Membuat objek Buku dan menambahkannya ke Perpustakaan
        Buku buku1 = new Buku("Pemrograman Java");
        Buku buku2 = new Buku("Struktur Data");
        Buku buku3 = new Buku("Algoritma dan Pemrograman");

        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);

        // Menampilkan informasi semua buku di perpustakaan
        perpustakaan.infoPerpustakaan();
    }
}

