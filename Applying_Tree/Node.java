package Applying_Tree;

public class Node {
    Mahasiswa data;
    Node left;
    Node right;

    public Node(Mahasiswa mahasiswa) {
        this.data = mahasiswa;
        this.left = null;
        this.right = null;
    }
}
