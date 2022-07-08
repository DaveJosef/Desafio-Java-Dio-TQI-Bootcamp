import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>(){{
            add(new ContaCorrente());
            add(new ContaPoupanca());
        }};

        Banco banco = new Banco();
        banco.setContas(contas);

        banco.getContas().forEach(System.out::println);
    }
}
