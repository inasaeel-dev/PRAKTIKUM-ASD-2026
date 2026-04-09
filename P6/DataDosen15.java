package P6;

public class DataDosen15 {
    Dosen15[] listDosen = new Dosen15[10];
    int idx;

    void tambah (Dosen15 d){
        if (idx < listDosen.length){
            listDosen[idx] = d;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }
    void tampil(){
        for (int i = 0; i < idx; i++) {
            listDosen[i].tampil();
            System.out.println("-----------------------");
        }
    }
    void sortingASC(){
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (listDosen[j].usia < listDosen[j -1].usia){
                    Dosen15 tmp = listDosen[j];
                    listDosen[j] = listDosen[j -1];
                    listDosen[j -1] =tmp;
                }
            }
        }
    }
void SortingDSC(){
    for (int i = 0; i < idx; i++) {
        for (int j = 1; j < idx - i; j++) {
            if (listDosen[j].usia > listDosen[j -1].usia){
                Dosen15 tmp = listDosen[j];
                listDosen[j] = listDosen[j -1];
                listDosen[j -1] =tmp;
            }
        }
    }
}
void insertionSort(){
    for (int i = 1; i < idx; i++) {
        Dosen15 temp = listDosen[i];
        int j = i;
        while ( (j > 0 && listDosen[j -1].usia < temp.usia)) {
            listDosen[j] = listDosen[j -1];
            j--;
            }
        listDosen[j] = temp;
        }
    }
}