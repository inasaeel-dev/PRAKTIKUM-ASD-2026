package P14;

public class BinaryTreeArray15 {
    Mahasiswa15[] dataMahasiswa15;
    int idxLast;

    public BinaryTreeArray15(){
        this.dataMahasiswa15 = new Mahasiswa15[10];
    }
    void populateData (Mahasiswa15 dataMhs[], int idxLast){
        this.dataMahasiswa15 = dataMhs;
        this.idxLast = idxLast;
    }
    void traverseInOrder(int idxStart){
        if (idxStart <= idxLast){
            if(dataMahasiswa15[idxStart] != null){
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa15[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }
    public void add(Mahasiswa15 data) {
        if (idxLast < dataMahasiswa15.length - 1) {
            dataMahasiswa15[++idxLast] = data;
        } else {
            System.out.println("Array penuh!");
        }
    }
    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa15[idxStart] != null) {
                dataMahasiswa15[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}