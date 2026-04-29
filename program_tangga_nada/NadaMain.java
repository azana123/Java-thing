package program_tangga_nada;
import java.util.Scanner;

public class NadaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Nada n = new Nada();
        boolean start = true;
        while (start) {
            String nadaDasar;
            System.out.println("=== Program Mencari Tangga Nada ===");
            System.out.print("Masukan Nada Dasar (A Bb B C Db D Eb E F Gb G Ab): ");
            nadaDasar = sc.nextLine();
            if (nadaDasar.equalsIgnoreCase("exit")) {
                System.out.println("Keluar ...");
                start =false;
            } else {
                n.tampilTanggaNadaMayor(nadaDasar);
            }
        }
        sc.close();
    }
}