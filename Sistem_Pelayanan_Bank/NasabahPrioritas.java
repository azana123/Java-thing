package Sistem_Pelayanan_Bank;

public class NasabahPrioritas extends Nasabah {
    public NasabahPrioritas(String nama, String noHP) {
        super(nama, noHP, true);
    }

    @Override
    public void infoLoket() {
        System.out.println("Silakan Meunju ke Loket Khusus (Lounge Prioritas)");
    }
}
