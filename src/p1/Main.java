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
    }
}

interface Summa{
    int calc(int x, int y);
}