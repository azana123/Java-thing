package Applying_Tree;

public class BinaryTreeSet {
    private Node root;

    public  BinaryTreeSet() {
        this.root = null;
    }

    public void add(Mahasiswa mhs) {
        root = addRecursive(root, mhs);
    }

    private Node addRecursive(Node current, Mahasiswa mhs) {
        if (current == null) {
            System.out.println("=== Berhasil Memasukan Data Mahasiswa ===");
            return new Node(mhs);
        }

        int compareResult = mhs.nim.compareTo(current.data.nim);

        if (compareResult < 0) {
            current.left = addRecursive(current.left, mhs);
        } else if (compareResult > 0 ) {
            current.right = addRecursive(current.right, mhs);
        } else {
            System.out.println("=== Gagal memasukan mahasiswa dengan NIM " + mhs.nim + " Data sudah ada ===");
        }
        return current;
    }

    public Mahasiswa search(String nim) {
        Node result = searchRecursive(root, nim);
        return (result != null) ? result.data : null;
    }

    private Node searchRecursive(Node current, String nim) {
        if (current == null || current.data.nim.equals(nim)) {
            return current;
        }
        
        if (nim.compareTo(current.data.nim) < 0) {
            return searchRecursive(current.left, nim);
        }

        return searchRecursive(current.right, nim);
    }

    public void displayAll() {
        if (root == null) {
            System.out.println("Data masih kosong");
            return;
        }
        inOrderRecursive(root);
    }

    private void inOrderRecursive(Node current) {
        if (current != null) {
            inOrderRecursive(current.left);
            System.out.println(current.data);
            inOrderRecursive(current.right);
        }
    }

    public void remove(String nim) {
        if (search(nim) != null) {
        root = removeRecursive(root, nim);

            System.out.println("=== Berhasil Menghapus Data Mahasiswa ===");
        } else {
            System.out.println("Data dengan NIM " + nim + " tidak ditemukan");
        }
    }

    private Node removeRecursive(Node current, String nim) {
        if (current == null) {
            return null;
        }

        int compareResult = nim.compareTo(current.data.nim);

        if (compareResult < 0 ) {
            current.left = removeRecursive(current.left, nim);
        } else if (compareResult > 0) {
            current.right = removeRecursive(current.right, nim);
        } else {
            if (current.left == null) {
                return current.right;
            } else if (current.right == null) {
                return current.left;
            }

            current.data = findMinValue(current.right);

            current.right = removeRecursive(current.right, current.data.nim);
        }
        return current;
    }

    private Mahasiswa findMinValue(Node root) {
        Mahasiswa minVal = root.data;
        while (root.left != null) {
            minVal = root.left.data;
            root = root.left;
        }
        return minVal;
    }
}
