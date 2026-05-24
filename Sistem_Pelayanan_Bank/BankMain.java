package Sistem_Pelayanan_Bank;
import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        ManajemenAntrian bank = new ManajemenAntrian();
        Scanner sc = new Scanner(System.in);
        int pilih;
        
        do {
            tampilMenu();
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukan Nama Nasabah\t: ");
                    String namaReg = sc.nextLine();
                    System.out.print("Masukan Nomor HP Aktif\t: ");
                    String noHPReg = sc.nextLine();
                    
                    Nasabah nasabahReg = new Nasabah(namaReg, noHPReg, false);
                    bank.tambahAntreanReguler(nasabahReg);
                    break;
                    
                case 2:
                    System.out.print("Masukan Nama Nasabah\t: ");
                    String namaPr = sc.nextLine();
                    System.out.print("Masukan Nomor HP Aktif\t: ");
                    String noHPPr = sc.nextLine();
                    
                    Nasabah nasabahPrior = new NasabahPrioritas(namaPr, noHPPr);
                    bank.tambahAntreanPrioritas(nasabahPrior);
                    break;
                    
                case 3:
                    bank.panggilAntrean();
                    break;
                    
                case 4:
                    System.out.print("Masukan Nama Nasabah yang Ingin Dihapus: ");
                    String nama = sc.nextLine();
                    bank.batalkanAntrean(nama);
                    break;
                    
                case 5:
                    bank.cetakAntrean();
                    break;
                    
                case 0:
                    System.out.println("Keluar...");
                    break;
                    
                default:
                    System.out.println("Masukan Menu yang Valid");
                    break;
            }
        } while (pilih != 0);
        
        sc.close();
    }

    public static void tampilMenu() {
        System.out.println("\n================================");
        System.out.println("Sistem Manajemen Antrean Bank");
        System.out.println("================================");
        System.out.println("1. Tambah Antrean Reguler");
        System.out.println("2. Tambah Antrean Prioritas");
        System.out.println("3. Panggil Antrean");
        System.out.println("4. Batalkan Antrean");
        System.out.println("5. Lihat Daftar Antrean");
        System.out.println("0. Keluar");
        System.out.print("Pilih: ");
    }
}
