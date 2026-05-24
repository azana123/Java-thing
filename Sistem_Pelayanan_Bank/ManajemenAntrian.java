package Sistem_Pelayanan_Bank;

public class ManajemenAntrian {
    private Node head;
    private Node tail;

    boolean isEmpty() { return head == null; }

    public void tambahAntreanReguler(Nasabah nasabah) {
        Node newNode = new Node(nasabah);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println(nasabah.getNama() + " Berhasil Masuk ke Antrean Reguler");
    }

    public void tambahAntreanPrioritas(Nasabah nasabah) {
        Node newNode = new Node(nasabah);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            if (!head.data.getPrioritas()) {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            } 
            else {
                Node current = head;
                while (current.next != null && current.next.data.getPrioritas()) {
                    current = current.next;
                }

                newNode.next = current.next;
                newNode.prev = current;

                if (current.next != null) {
                    current.next.prev = newNode;
                } else {
                    tail = newNode;
                }
                current.next = newNode;
            }
        }
        System.out.println("Berhasil Masuk Ke Antrean Prioritas");
    }

    public void panggilAntrean() {
        if (isEmpty()) {
            System.out.println("Tidak ada antrean untuk dipanggil");
            return;
        }

        Node dipanggil = head;
        System.out.println("=============================================================");
        System.out.println("MOHON PERHATIAN");
        System.out.println("Memanggil Nasabah: " + dipanggil.data.getNama());
        dipanggil.data.infoLoket();
        System.out.println("=============================================================");

        if (head.next == null) {
            head = tail = null;
        } else {
            head = dipanggil.next;
            head.prev = null;
        }
        System.out.println("Berhasil Melayani " + dipanggil.data.getNama());
    }

    public void batalkanAntrean(String nama) {        
        if (isEmpty()) {
            System.out.println("Antrean Masih Kosong!");
            return;
        }
        
        Node current = head;
        boolean found = false;

        while (current != null) {
            if (current.data.getNama().equalsIgnoreCase(nama)) {
                found = true;
                
                // Data Tengah
                if (current.next != null && current.prev != null) {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                } else {
                    // Data Tail
                    if (current.next == null && current.prev != null) {
                        tail = current.prev;
                        tail.next = null;
                    } 
                    // Data Head dengan data di belakangnya masih banyak
                    else if (current.prev == null && current.next != null) {
                        head = current.next;
                        head.prev = null;
                    } 
                    // Hanya Ada 1 Data
                    else { 
                        head = tail = null;
                    }
                }
                System.out.println("Berhasil Menghapus Antrean");
                return;
            }
            current = current.next;
        }
        
        if (!found) {
            System.out.println("Data Tidak Ditemukan");
        }
    }

    public void cetakAntrean() {
        if (isEmpty()) {
            System.out.println("Antrean Masih Kosong");
            return;
        }

        Node current = head;
        System.out.println("Daftar Antrian: ");
        while (current != null) {
            String tipe = current.data.getPrioritas() ? "[Prioritas]" : "[Reguler]";
            System.out.print(current.data.getNama() + tipe + " <-> ");
            current = current.next;
        }
        System.out.println("Done...");
    }
}
