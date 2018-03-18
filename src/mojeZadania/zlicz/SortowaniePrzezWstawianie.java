package mojeZadania.zlicz;

import sorting.data.DataSet;

public class SortowaniePrzezWstawianie {

    public static void main(String[] args) {

        int[] tablicaIntow ={2,6,8,4,1,2,6,9,8,5,0,8,};
        Integer[] folder = DataSet.getData();   // przypisanie zewn. folderu do tablicy "folder"
        sorting(folder);
        DataSet.compare(folder);

    }

    public static void sorting (Integer[] tablicaIntow) {
        for (int i = 1; i < tablicaIntow.length; i++) { // iteracja od pierwszego elementu do końca tablicy
            int temp = tablicaIntow[i];                 // index zapisany zmiennej temp
            int j = i;                                  // index w posortowanej tablicy
            while((j > 0) && tablicaIntow[j-1] > temp) {  // robienie miejsca dla przesuwanej liczby w tablicy posortowanej
                tablicaIntow[j] = tablicaIntow[j-1];    // przesuwanie liczby do przodu tablicy
                j--;                                    // zmniejszanie indexu posortowanej tablicy o 1
            }
            tablicaIntow[j] = temp;                     // wstawinie liczby na odpowiednie miejsce
        }

        for(int el : tablicaIntow) {                    // wypisanie wszystkich elementów tablicy po kolei
            System.out.print(el + ", ");
        }
        System.out.println();
    }
}
