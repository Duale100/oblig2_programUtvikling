package oblig2;

pu class oppgave2_2 {
    public static <T> void reverseArr(T[] array) {
        // returnerer hvis arrar.length er mindre enn 0
        if (array.length < 1) {
            return;

        }
        //printer hver verdi

        //kaller rekursivt til metoden

        for (int x = array.length - 1; x >= 0; x--) {
            System.out.println(array[x]);
        }

    }

    class ofef {


        public static void main(String[] args) {
            Double g1[] = {1.2, 1.1, 22.2,};
            Integer g2[] = {1, 2, 3, 4, 5, 6};
            String g3[] = {"a", "b", "c"};

            System.out.println("Double:");
            reverseArr(g1);
            System.out.println("Integer:");
            reverseArr(g2);
            System.out.println("String:");
            reverseArr(g3);
        }
    }

}