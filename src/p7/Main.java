package p7;

public class Main {

    public static void main(String[] args) {
        ClientBuilder clientBuilder = Client::new;
        Client client = clientBuilder.create("Alex");
        System.out.println(client.getName());
    }

}
