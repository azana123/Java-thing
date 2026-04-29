package program_tangga_nada;

public class Nada {

    private static final int[] intervalMayor = {2, 2, 1, 2, 2, 2, 1};
    private static final String[] chromaticScale = {
        "A", "Bb", "B", "C", "Db", "D", "Eb", "E", "F", "Gb", "G", "Ab"
    };

    public Nada() {}

    public int cariIndex(String nada) {
        for (int i = 0; i < chromaticScale.length; i++) {
            if (chromaticScale[i].equalsIgnoreCase(nada)) {
                return i;
            }
        }
        return -1;
    }

    public String[] tanggaNadaMayor(String nadaDasar) {
        int index = cariIndex(nadaDasar);
        if (index == -1) {
            return null;
        }
        String[] hasil = new String[8];
        hasil[0] = chromaticScale[index];
        for (int i = 1; i < hasil.length; i++) {
            index = (index + intervalMayor[i - 1]) % chromaticScale.length;
            hasil[i] = chromaticScale[index];
        }
        return hasil;
    }

    public void tampilTanggaNadaMayor(String nadaDasar) {
        String[] tanggaNada = tanggaNadaMayor(nadaDasar);
        System.out.println("===================================");
        if (tanggaNada == null) {
            System.out.println("Nada tidak ditemukan");
            return;
        }
        System.out.print("Tangga nada mayor " + nadaDasar + ": ");
        for (int i = 0; i < tanggaNada.length; i++) {
            if (i == 1 || i == 2 || i == 5) {
                System.out.print(tanggaNada[i] + "m" + " ");
            } else {
            System.out.print(tanggaNada [i] + " ");
            }
        }
        System.out.println();
    }
}