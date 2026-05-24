package Sistem_Pelayanan_Bank;

public class Nasabah {
    private String nama;
    private String noHP;
    private boolean Prioritas;

    Nasabah(String nama, String noHP, boolean Prioritas) {
        this.nama = nama;
        this.noHP = noHP;
        this.Prioritas = Prioritas;
    }

    public String getNama() { return nama; }
    public String getNoHP() { return noHP; }
    public boolean getPrioritas() { return Prioritas; }

    public void infoLoket() {
        System.out.println("Silakan Menuju ke Loket Umum");
    }
}