/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugaspbow11;

/**
 *
 * @author hp
 */
public class Buku {
    private String judul;
    private Pengarang pengarang;

    public Buku(String judul, Pengarang pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public void infoBuku() {
        System.out.println("Judul Buku: " + judul);
        if (pengarang != null) {
            pengarang.infoPengarang();
        }
    }
}

