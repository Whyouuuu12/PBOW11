/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspbow11;

/**
 *
 * @author hp
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Pengarang
        Pengarang pengarang1 = new Pengarang("John Doe");
        Pengarang pengarang2 = new Pengarang("Jane Smith");

        // Membuat objek Buku
        Buku buku1 = new Buku("Pemrograman Java", pengarang1);
        Buku buku2 = new Buku("Struktur Data", pengarang2);
        Buku buku3 = new Buku("Algoritma Pemrograman", null); // Buku tanpa pengarang

        // Membuat objek Perpustakaan dan menambahkan buku
        Perpustakaan perpustakaan = new Perpustakaan();
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);

        // Menampilkan semua buku di perpustakaan
        perpustakaan.tampilkanInfoBuku();
    }
}
