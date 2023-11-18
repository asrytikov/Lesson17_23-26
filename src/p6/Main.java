package p6;

import p5.Expr;

public class Main {

    public static void main(String[] args) {
        int[] mas = {1, 10, 11, 15, 22, 23};
        System.out.println(sum(mas, ExprWorker::isEven));

        Expr expr = ExprWorker::isPos;
        System.out.println(sum(mas, expr));

        ExprWorker exprWorker = new ExprWorker();
        System.out.println(sum(mas, exprWorker::isFive));

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
