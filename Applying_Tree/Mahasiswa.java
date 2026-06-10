package Applying_Tree;

public class Mahasiswa {
    String nim;
    String nama;
    String fakultas;
    String prodi;

    public Mahasiswa(String nim, String nama, String fakultas, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.fakultas = fakultas;
        this.prodi = prodi;
    }

    @Override
    public String toString() {
        return "NIM\t: " + nim + "| NAMA\t: " + nama + "| FAKULTAS\t: " + fakultas + "| PROGRAM STUDI\t: " + prodi;
    }
}
