package batu_kertas_gunting;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean start = true;
        while (start) {
            String pilihanPlayer = input();
            int valuePilihanPlayer;
            boolean valid = false;
            if (pilihanPlayer.equalsIgnoreCase("batu")) {
                valuePilihanPlayer = 1;
                valid = true;
            } else if (pilihanPlayer.equalsIgnoreCase("kertas")) {
                valuePilihanPlayer = 2;
                valid = true;
            } else if (pilihanPlayer.equalsIgnoreCase("gunting")) {
                valuePilihanPlayer = 3;
                valid = true;
            } else {
                System.out.println("pilihan tidak valid! pilih salah satu (batu gunting kertas");
            }
            
            if (valid) {
                Random random = new Random();
                int pilihanKomputer = random.nextInt(3);
            }
        }
    }
    static String input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("GAME BATU KERTAS GUNTING");
        System.out.print("Masukan pilihan (batu, gunting, kertas): ");
        String pilihanPlayer = sc.nextLine();
        return pilihanPlayer;
    }
}
