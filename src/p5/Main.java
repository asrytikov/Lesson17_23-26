package p5;

import p6.ExprWorker;

public class Main {

    public static void main(String[] args) {

        Expr func = (n) -> n%5==0;
        int[] mas = {1, 10, 11, 15, 22, 23};
        System.out.println(sum(mas, func));
        Expr expr = (n) -> n%2==0;
        System.out.println(sum(mas, expr));



    }

    private static int sum(int[] num, Expr func){
        int res = 0;
        for (int i : num){
            if (func.isEq(i)){
                res += i;
            }
        }
        return res;
    }

}
