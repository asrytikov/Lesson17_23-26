package p1;

public class Main {
    public static void main(String[] args) {
        Summa summa;
        summa = (x, y) -> x+y;

        int res = summa.calc(10, 11);
        System.out.println(res);

        Summa s = new Summa() {
            @Override
            public int calc(int x, int y) {
                return x + y;
            }
        };

        Summa summa1 = (int x, int y) -> x - y;
        System.out.println(summa1.calc(20, 0));


    }
}

interface Summa{
    int calc(int x, int y);
}