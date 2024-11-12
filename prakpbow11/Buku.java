/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package prakpbow11;

/**
 *
 * @author hp
 */
import java.util.ArrayList;
import java.util.List;

class Buku {
    private String judul;

    public Buku(String judul) {
        this.judul = judul;
    }

    public void infoBuku() {
        System.out.println("Judul Buku: " + judul);
    }
}

class Perpustakaan {
    private List<Buku> bukuList;

    public Perpustakaan() {
        this.bukuList = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        bukuList.add(buku);
    }

    public void infoPerpustakaan() {
        if (bukuList.isEmpty()) {
            System.out.println("Perpustakaan kosong.");
        } else {
            System.out.println("Daftar Buku di Perpustakaan:");
            for (Buku buku : bukuList) {
                buku.infoBuku();
            }
        }
    }
}

