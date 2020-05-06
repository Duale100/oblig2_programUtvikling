package oblig2;

public class oppgave1_2 {

    static int pow(int base, int exponent){
        // returnerer base hvis exponent er 1 eks 2 ^ 1 = 2
        if(exponent == 1 ){
            return base;
        }
        // else returnener base exponent = base * base exponent-1
    return base * pow(base,exponent-1);

    }

    public static void main(String[] args) {
        // 2 ^ 5 = 32 osv..

        System.out.println(pow(2,5));
        System.out.println(pow(2,1));
        System.out.println(pow(2,6));
    }




}
