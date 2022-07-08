import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> clientes = new ArrayList<>(){{
            add("Maria");
            add("João");
        }};

        System.out.println(clientes);
    }
}
