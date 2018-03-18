package mojeZadania.zlicz;

public class SortowaniePrzezZliczanie {
    public static void main(String[] args) {
        int[]przyklad={1,2,1,0,4,8,6,9};

        int[]wynik=sort(przyklad);
        System.out.println("Tablica początkowa: ");
        for(int i:przyklad){
            System.out.print(i+" ");
        }
        System.out.println("\nTablica posortowana: ");
        for(int i:wynik){
            System.out.print(i+" ");
        }
    }

    public static int[] sort(int[] tab) {
        int n=10;
        //tworzymytablicępomocniczą
        int [] pomocnicza = new int[n];
        for (int i = 0; i <n ; i++) {
            pomocnicza[i]=0;
        }
        //zliczanie
        for (int i = 0; i < tab.length; i++) {
            pomocnicza[tab[i]]++;
        }
        //sumowanie
        for (int i = 1; i < pomocnicza.length; i++) {
//            pomocnicza[i] = pomocnicza[i] + pomocnicza[i-1];
            pomocnicza[i]+=pomocnicza[i-1];
        }
        //sortowanie
        int[] wynik = new int[tab.length];
        for (int i = tab.length-1; i >= 0; i--) {
            wynik[pomocnicza[tab[i]]-1] = tab[i];
            pomocnicza[tab[i]]--;
        }


        return wynik;
    }
}
