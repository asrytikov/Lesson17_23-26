package p4;

public class Main {

    public static void main(String[] args) {

        Oper<Integer> oper = (x, y)->x+y;
        System.out.println(oper.calc(10,20));
        Oper<String> stringOper = ((x, y) -> x + y);
        System.out.println(stringOper.calc("20", "23"));

    }

}
