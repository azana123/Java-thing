# 🚀 Project Gabut Selama Kuliah

Repositori ini berisi kumpulan proyek mini (*learning outcomes*) yang saya buat secara mandiri di sela-sela waktu kuliah. Proyek-proyek ini berfungsi sebagai wadah eksperimen untuk menerapkan konsep logika pemrograman, algoritma dasar, struktur data, dan arsitektur Pemrograman Berorientasi Objek (OOP) menggunakan bahasa **Java**.

---

## 📂 Daftar Proyek & Penerapan Ilmu

### 1. 🧮 Kalkulator Ekspresi Matematika (Stack-Based Calculator)
Program kalkulator tingkat lanjut yang mampu mengevaluasi dan menghitung satu baris ekspresi matematika utuh secara langsung (contoh input: `3 + 5 * (2 - 8) / 2`), bukan diinput satu per satu lewat variabel terpisah.
*   **Algoritma & Struktur Data:** Menerapkan algoritma **Shunting-Yard** untuk mengubah ekspresi dari bentuk *Infix* menjadi *Postfix* (*Reverse Polish Notation* / RPN), dilanjutkan dengan evaluasi ekspresi menggunakan struktur data **Stack**.
*   **Penerapan Ilmu:** Parsing String, manajemen prioritas operator matematika (hirarki tanda kurung, perkalian, pembagian, penjumlahan, pengurangan), dan penanganan error ekspresi (*Invalid Expression Handling*).

### 2. 🎵 Pencari Tangga Nada (Musical Scale Finder)
Program utilitas musik yang dapat mengidentifikasi dan menghasilkan urutan nada dalam suatu tangga nada (misalnya tangga nada mayor atau minor) secara otomatis berdasarkan nada dasar yang diinput oleh pengguna.
*   **Algoritma & Struktur Data:** Menerapkan pola interval jarak nada (contoh untuk Mayor: *Whole-Whole-Half-Whole-Whole-Whole-Half*) yang diaplikasikan di atas array atau list berisi kromatik 12 nada dasar.
*   **Penerapan Ilmu:** Manipulasi Array/List melingkar (*circular indexing* menggunakan operator Modulo `%`) untuk menangani perputaran nada setelah nada B kembali ke C.

### 3. ✊✌️✋ Game Batu, Kertas, Gunting (Rock, Paper, Scissors)
Game interaktif klasik berbasis teks antara pengguna melawan komputer dengan penentuan skor secara *real-time*.
*   **Algoritma & Struktur Data:** Penggunaan fungsi acak (*Random Number Generator*) untuk mensimulasikan pilihan komputer secara adil.
*   **Penerapan Ilmu:** Logika kondisi bercabang (*if-else* kompleks atau matriks keputusan), perulangan game (*game loop*), dan manajemen state untuk melacak skor kemenangan.

### 4. 🏦 Sistem Manajemen Pelayanan Bank (OOP & Double Linked List)
Aplikasi simulasi antrean bank cerdas yang memisahkan jalur nasabah menjadi dua kategori: **Nasabah Reguler** dan **Nasabah Prioritas**. Nasabah prioritas akan otomatis disisipkan di barisan depan setelah kelompok prioritas lainnya, namun tetap berada di depan kelompok nasabah reguler.
*   **Algoritma & Struktur Data:** Implementasi struktur data **Double Linked List (DLL)** secara manual dari nol (membuat objek `Node` bertipe *self-referential* dengan pointer `next` dan `prev`), lengkap dengan penanganan kondisi batas (*edge cases*) saat pembatalan antrean.
*   **Penerapan Pilar OOP Java:**
    *   **Encapsulation:** Mengamankan data sensitif nasabah menggunakan hak akses `private`/`protected` dan memediasi aksesnya lewat method *Getter*.
    *   **Inheritance:** Membuat hubungan hierarki di mana class `NasabahPrioritas` mengekstensi (`extends`) class induk `Nasabah`.
    *   **Polymorphism:** Menerapkan *Method Overriding* pada fungsi pemanggilan loket (`infoLoket()`), sehingga Java secara dinamis mengarahkan nasabah ke loket yang tepat (Umum vs Khusus) saat antrean dipanggil tanpa percabangan `if-else` manual di dalam kelas manajemen antrean.

---

## 🛠️ Tech Stack & Alat yang Digunakan
*   **Bahasa Pemrograman:** Java (JDK 17+)
*   **IDE / Text Editor:** IntelliJ IDEA / Eclipse / VS Code
*   **Struktur Data Manual:** Stack, Double Linked List, Circular Array Logic

## 💻 Cara Menjalankan Project
1. Clone repositori ini ke komputer lokal kamu:
   ```bash
   https://github.com/azana123/Java-thing.git
   ```
2. Buka folder proyek menggunakan IDE pilihanmu.
3. Jalankan file `Main` atau file yang berisi method `public static void main(String[] args)` pada masing-masing folder proyek.
