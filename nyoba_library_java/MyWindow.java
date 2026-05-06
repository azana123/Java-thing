package nyoba_library_java;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class MyWindow {
    public static void main(String[] args) {
        // Menggunakan invokeLater untuk memastikan thread safety
        SwingUtilities.invokeLater(() -> {
            // 1. Membuat instance JFrame
            JFrame frame = new JFrame("Judul Jendela");

            // 2. Mengatur ukuran jendela (lebar, tinggi)
            frame.setSize(400, 300);

            // 3. Mengatur perilaku penutupan (exit saat tombol X diklik)
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // 4. Menambahkan konten (opsional)
            frame.add(new JLabel("Halo, ini jendela Java!", JLabel.CENTER));

            // 5. Menempatkan di tengah layar
            frame.setLocationRelativeTo(null);

            // 6. Menampilkan jendela
            frame.setVisible(true);
        });
    }
}
