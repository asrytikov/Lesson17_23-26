package p8;

public class Main {

    public static void main(String[] args) {
        Executor executor = calculate(1);
        int x = executor.calc(10, 20);
        System.out.println(x);

        System.out.println(calculate(2).calc(5,2));


    }

    private static Executor calculate(int num){
        switch (num){
            case 1: return (x, y) -> x + y;
            case 2: return (x, y) -> x - y;
            case 3: return (x, y) -> x * y;
            default: return (x, y) -> 0;
        }
    }

}
