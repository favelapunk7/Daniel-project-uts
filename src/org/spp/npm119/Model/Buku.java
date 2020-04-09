/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.spp.npm119.Model;

/**
 *
 * @author User
 */
public class Buku {
    private String IdBuku;
    private String Judul;
    private String Pengarang;
    private String Penerbit;
    private String Tahun;
    
    public Buku() {
        
    }

    public Buku(String IdBuku, String Judul, String Pengarang, String Penerbit, String Tahun) {
        this.IdBuku = IdBuku;
        this.Judul = Judul;
        this.Pengarang = Pengarang;
        this.Penerbit = Penerbit;
        this.Tahun = Tahun;
    }

    public String getIdBuku() {
        return IdBuku;
    }

    public void setIdBuku(String IdBuku) {
        this.IdBuku = IdBuku;
    }

    public String getJudul() {
        return Judul;
    }

    public void setJudul(String Judul) {
        this.Judul = Judul;
    }

    public String getPengarang() {
        return Pengarang;
    }

    public void setPengarang(String Pengarang) {
        this.Pengarang = Pengarang;
    }

    public String getPenerbit() {
        return Penerbit;
    }

    public void setPenerbit(String Penerbit) {
        this.Penerbit = Penerbit;
    }

    public String getTahun() {
        return Tahun;
    }

    public void setTahun(String Tahun) {
        this.Tahun = Tahun;
    }

  

   
    
}
