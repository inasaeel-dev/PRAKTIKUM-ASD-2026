package P14;

public class BinaryTree15 {
    Node15 root;

    public BinaryTree15(){
        root = null;
    }
    public boolean isEmpty(){
        return root == null;
    }
    public void add(Mahasiswa15 mahasiswa){
        Node15 newNode15 = new Node15(mahasiswa);
        if (isEmpty()){
            root = newNode15;
        } else {
            Node15 current = root;
            Node15 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk){
                    current = current.left;
                    if (current == null){
                        parent.left = newNode15;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null){
                        parent.right = newNode15;
                        return;
                    }
                }
            }
        }
    }
    boolean find(double ipk){
        boolean result = false;
        Node15 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk){
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk){
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }
    
}