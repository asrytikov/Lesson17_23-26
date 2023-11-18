package p9;

import p7.Client;

import java.util.Scanner;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        Predicate<Integer> isPos = x -> x>0;
        System.out.println(isPos.test(10));
        System.out.println(isPos.test(-5));

        BinaryOperator<Integer> operator = (x, y) -> x*y;
        System.out.println(operator.apply(3,5));

        UnaryOperator<Integer> unaryOperator = n -> n*n;
        System.out.println(unaryOperator.apply(5));

        Function<Integer, String> convert = x -> "Count: " + String.valueOf(x);
        System.out.println(convert.apply(10));

        Consumer<Integer> print = System.out::println;
        print.accept(100);

        Supplier<Client> clientFactory = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input name: ");
            String name = scanner.nextLine();
            return new Client(name);
        };

        Client client1 = clientFactory.get();
        Client client2 = clientFactory.get();

        System.out.println("Client1: " + client1.getName());
        System.out.println("Client2: " + client2.getName());
    }
}
