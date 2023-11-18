package p3;

public class Main {

    static int x = 5;
    static int y = 10;

    public static void main(String[] args) {
        int n = 55;
        int k = 15;

        Oper operq = ()->{
            return n+k;
        };

        operq.calc();

        Oper oper = ()->{
          x=30;
          return x+y;
        };

        System.out.println(oper.calc());
        System.out.println(x);
    }

}


