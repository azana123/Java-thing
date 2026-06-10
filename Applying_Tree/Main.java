package Applying_Tree;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTreeSet bst = new BinaryTreeSet();

        bst.add(new Mahasiswa("001", "Risa  ", "MIPA", "Kimia"));
        bst.add(new Mahasiswa("002", "Rahma ", "MIPA", "Kimia"));
        bst.add(new Mahasiswa("003", "Najma ", "MIPA", "Kimia"));
        bst.add(new Mahasiswa("004", "Aulia ", "MIPA", "Kimia"));
        bst.add(new Mahasiswa("005", "Bening", "MIPA", "Kimia"));
        bst.add(new Mahasiswa("006", "Lupi  ", "MIPA", "Statistika"));
        bst.add(new Mahasiswa("007", "David ", "MIPA", "Kimia"));
        bst.add(new Mahasiswa("008", "Adel  ", "MIPA", "Fisika"));
        bst.add(new Mahasiswa("009", "Bela  ", "MIPA", "Statistika"));
        bst.add(new Mahasiswa("010", "Tiyas ", "MIPA", "Kimia"));
        bst.add(new Mahasiswa("011", "Egi   ", "MIPA", "Fisika"));
        bst.add(new Mahasiswa("012", "Ahlan ", "MIPA", "Fisika"));
        bst.add(new Mahasiswa("013", "Puyu  ", "MIPA", "Kimia"));
        bst.add(new Mahasiswa("014", "Novi  ", "MIPA", "Kimia"));
        bst.add(new Mahasiswa("015", "Shelom", "MIPA", "Kimia"));
        bst.add(new Mahasiswa("016", "Karin ", "MIPA", "Kimia"));
        bst.add(new Mahasiswa("017", "Gempur", "MIPA", "Kimia"));
        bst.add(new Mahasiswa("018", "Risky ", "MIPA", "Kimia"));
        bst.add(new Mahasiswa("019", "Peter ", "MIPA", "Kimia"));
        bst.add(new Mahasiswa("020", "Nabila", "MIPA", "Kimia"));
        
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            tampilMenu();
            System.out.print("Pilih Menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    bst.displayAll();
                    break;
                case 2:
                    System.out.println("=== Masukan Data Mahasiswa Baru ===");
                    System.out.print("NIM: ");
                    String nimBaru = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Fakultas: ");
                    String fakultas = sc.nextLine();
                    System.out.print("Program Strudi: ");
                    String prodi = sc.nextLine();

                    bst.add(new Mahasiswa(nimBaru, nama, fakultas, prodi));
                    break;
                case 3:
                    System.out.println("=== Masukan NIM Mahasiswa yang Ingin Dihapus ===");
                    System.out.print("NIM: ");
                    String hapusNim = sc.nextLine();
                    bst.remove(hapusNim);
                    break;
                case 4:
                    System.out.println("=== Masukan NIM Mahasiswa yang Ingin Dicari ===");
                    System.out.print("NIM: ");
                    String cariNim = sc.nextLine();
                    Mahasiswa mhsDicari = bst.search(cariNim);
                    if (mhsDicari != null) {
                        System.out.println("Hasil: " + mhsDicari);
                    } else {
                        System.out.println("Mahasiswa dengan NIM " + cariNim + " tidak ditemukan.");
                    }
                    break;
                case 0:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Masukan Menu yang Valid!");
                    break;
            }
        } while (pilih != 0);
    }

    public static void tampilMenu() {
        System.out.println("=== Manajemen Data Mahasiswa ===");
        System.out.println("1. Tampilkan Seluruh Mahasiswa");
        System.out.println("2. Tambah Data Mahasiswa");
        System.out.println("3. Hapus Data Mahasiswa");
        System.out.println("4. Cari Mahasiswa (berdasarkan NIM)");
        System.out.println("0. keluar");
    }
}
