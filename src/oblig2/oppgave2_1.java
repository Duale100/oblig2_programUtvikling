package oblig2;

public class oppgave2_1 {
    public static <T> void arrayer(T[] liste){
        for( T x : liste){

            System.out.println(x);
        }
    }
    public <E extends G> E get(E index) {

    }


    public static void main(String[] args) {
        Double list1[] = {1.2,1.1,22.2,};
        Integer list2[] = {1,2,3,4,5,6};
        String liste3[] = {"a","b","c"};

        System.out.print("Double:");
        arrayer(list1);
        System.out.println("Integer:");
        arrayer(list2);
        System.out.println("String:");
        arrayer(liste3);
    }
}
