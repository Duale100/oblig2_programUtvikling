package oblig2;

public class oppgave1_3 {
    static int tabell(int[] array, int index) {
        // returnerer hvis arrar.length er mindre enn 0
        if (array.length < 1) {
            return index;

        }
        //printer hver verdi
        System.out.println(array[index] );

        //kaller rekursivt til metoden


        return tabell(array, index - 1);

    }

    public static void main(String[] args) {
        //lager liste
        int[] liste = {1,2,3,4,5};
        //kaller rekursive metode
        System.out.println(tabell(liste,4));
    }
}