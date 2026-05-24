package Sistem_Pelayanan_Bank;

public class Node {
    Nasabah data;
    Node next;
    Node prev;

    public Node(Nasabah data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}