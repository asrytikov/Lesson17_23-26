package p2;

public class Main {

    public static void main(String[] args) {
        PrintWord printWord = s -> System.out.println(s);
        printWord.print("Hello all");
    }

}

interface PrintWord{
    void print(String s);
}
