package parking_system;
import java.util.Scanner;

public class ParkirMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bigSlots;
        int mediumSlots;
        int smallSlots;
        int pilih;

        System.out.print("Masukkan slot parkir besar: ");
        bigSlots = sc.nextInt();
        System.out.print("Masukkan slot parkir sedang: ");
        mediumSlots = sc.nextInt();
        System.out.print("Masukkan slot parkir kecil: ");
        smallSlots = sc.nextInt();

        ParkingSystem slot = new ParkingSystem(bigSlots, mediumSlots, smallSlots);


        do {
            System.out.println("1. Isi Slot Parkir Besar");
            System.out.println("2. Isi Slot Parkir Sedang");
            System.out.println("3. Isi Slot Parkir Kecil");
            System.out.println("0. Keluar");
            System.out.print("Masukan menu: ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                case 2:   //Fall Through
                case 3:
                    if (slot.addCar(pilih)) {
                        System.out.println("Berhasil mengisi slot");
                    } else {
                        System.out.println("Slot penuh!");
                    }
                    break;
                case 0:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilih menu yang valid");
                    break;
            }
        } while (pilih != 0);
    }
}
