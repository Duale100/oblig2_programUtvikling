package oblig2;


public class oppgave1 {
    static int sum(int x) {
        // kontrollerer ikke mindre enn 0 verdier
    if(x < 1 ){
        return  x;
    }
    // recursive call
      return x + sum(x-1);
    }

     public static void main(String[] args) {
        System.out.println(sum(3)); // 3 + 2 + 1 = 6 osv
        System.out.println(sum(100));
        System.out.println(sum(10));

    }

}ewrwerwer