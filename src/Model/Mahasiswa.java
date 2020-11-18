/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author 1119038 Elangel Neilea Shaday
 */
public class Mahasiswa {
    private String NIM, Nama, kode_jurusan;
    private int angkatan;

    public Mahasiswa(String NIM, String Nama, String kode_jurusan, int angkatan) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.kode_jurusan = kode_jurusan;
        this.angkatan = angkatan;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getKode_jurusan() {
        return kode_jurusan;
    }

    public void setKode_jurusan(String kode_jurusan) {
        this.kode_jurusan = kode_jurusan;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "NIM=" + NIM + ", Nama=" + Nama + ", kode_jurusan=" + kode_jurusan + ", angkatan=" + angkatan + '}';
    }
}
