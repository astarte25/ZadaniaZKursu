package mojeZadania.zlicz;

import sorting.data.DataSet;

import java.util.Arrays;

public class SortowaniePrzezWybieranie {

    public static void main(String[] args) {

        int[] tablica = {1,5,6,9,2,7,5,9,3,4,2,0,1,0};
//        sorting(tablica);
        Integer[] folder = DataSet.getData();
        sorting(folder);
        System.out.println(Arrays.toString(folder));

    }

    public static void sorting(Integer[] tablica) {

        int min, i, j, temp;

        for (i = 0; i < tablica.length; i++) {
            min = i;                            // przypisanie do min wartości indexu
            for(j = i + 1; j < tablica.length; j++) {
                if(tablica[j] < tablica[min]) {
                    min = j;    // wartość przypisujemy do lewej strony
                }

            }
            temp = tablica[min];    //
            tablica[min] = tablica[i];
            tablica[i] = temp;
        }
    }
}
