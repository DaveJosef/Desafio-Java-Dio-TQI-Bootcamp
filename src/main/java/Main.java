import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>(){{
            add(new Conta());
            add(new Conta());
        }};

        Banco banco = new Banco();
        banco.setContas(contas);

        System.out.println(banco.getContas());
    }
}
