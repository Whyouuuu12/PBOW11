/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspbow11;

/**
 *
 * @author hp
 */
import java.util.ArrayList;

public class Perpustakaan {
    private ArrayList<Buku> daftarBuku;

    public Perpustakaan() {
        this.daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void tampilkanInfoBuku() {
        if (daftarBuku.isEmpty()) {
            System.out.println("Perpustakaan kosong.");
        } else {
            for (Buku buku : daftarBuku) {
                buku.infoBuku();
                System.out.println("-------------------");
            }
        }
    }
}

