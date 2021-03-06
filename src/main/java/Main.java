import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente maria = new Cliente();
        maria.setNome("Maria");
        Cliente joao = new Cliente();
        joao.setNome("Joao");

        Conta contaDeMaria = new ContaPoupanca(maria);
        Conta contaDeJoao = new ContaCorrente(joao);

        List<Conta> contas = new ArrayList<>(){{
            add(contaDeMaria);
            add(contaDeJoao);
        }};

        Banco banco = new Banco();
        banco.setContas(contas);

        System.out.println("Antes das operações:");
        banco.getContas().forEach(Conta::imprimirExtrato);

        contaDeMaria.depositar(1000D);
        contaDeMaria.transferir(1000D, contaDeJoao);

        System.out.println("Depois das operações:");
        banco.getContas().forEach(Conta::imprimirExtrato);
    }
}
