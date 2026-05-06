package batu_kertas_gunting;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean start = true;

        System.out.println("=== GAME BATU KERTAS GUNTING ===");

        do {
            int player;
            int bot = rand.nextInt(3) + 1;
            System.out.println("1 = Batu");
            System.out.println("2 = Kertas");
            System.out.println("3 = Gunting");
            System.out.println("4 = Keluar game");
            System.out.println("=====================================");
            System.out.print("Masukan pilihan anda: ");
            player = sc.nextInt();
            System.out.println("=====================================");
            String pilihanBot;
            if (bot == 1) {
                pilihanBot = "BATU";
            } else if (bot == 2) {
                pilihanBot = "KERTAS";
            } else {
                pilihanBot = "Gunting";
            }

            String pilihanPlayer;
            if (player == 1) {
                pilihanPlayer = "BATU";
            } else if (player == 2) {
                pilihanPlayer = "KERTAS";
            } else {
                pilihanPlayer = "Gunting";
            }

            switch (player) {
                case 1:
                    System.out.println("Pilihan kamu: " + pilihanPlayer);
                    System.out.println("Pilihan bot: " + pilihanBot);
                    if (bot == 1) {
                        System.out.println("waduh imbang bro");
                    } else if (bot == 2) {
                        System.out.println("Kamu kalah wkwkwk");
                    } else {
                        System.out.println("kamu menang yey");
                    }
                    System.out.println("=====================================");
                    break;
                case 2:
                    System.out.println("Pilihan kamu: " + pilihanPlayer);
                    System.out.println("Pilihan bot: " + pilihanBot);
                    if (bot == 1) {
                        System.out.println("kamu menang yey");
                    } else if (bot == 2) {
                        System.out.println("waduh imbang bro");
                    } else {
                        System.out.println("kamu kalah wkwkwk");
                    }
                    System.out.println("=====================================");
                    break;
                case 3:
                    System.out.println("Pilihan kamu: " + pilihanPlayer);
                    System.out.println("Pilihan bot: " + pilihanBot);
                    if (bot == 1) {
                        System.out.println("kamu  kalah wkwkwk");
                    } else if (bot == 2) {
                        System.out.println("kamu menang yey");
                    } else {
                        System.out.println("waduh imbang bro");
                    }
                    System.out.println("=====================================");
                    break;
                case 4:
                    System.out.println("keluar . . .");
                    start = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while(start);
    }
}