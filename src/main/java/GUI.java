import javax.swing.*;
import java.awt.*;
import java.util.stream.Collectors;

public class GUI {

    public static void main(String[] args) {
        Frame frame = new JFrame("Hello, World Swing!");

        JPanel panel = new JPanel();

        Cliente maria = new Cliente();
        maria.setNome("Maria");

        Cliente joao = new Cliente();
        joao.setNome("Joao");

        Conta contaDeMaria = new ContaPoupanca(maria);
        Conta contaDeJoao = new ContaPoupanca(joao);

        contaDeMaria.depositar(1000D);
        contaDeMaria.depositar(1000D);
        contaDeMaria.depositar(1000D);
        contaDeMaria.depositar(1000D);
        contaDeMaria.sacar(1000D);
        contaDeMaria.transferir(1000D, contaDeJoao);

        Object[] registros = contaDeMaria.getHistorico().getRegistros()
                .stream()
                .map(registro -> registro.getStringIcon() + String.format("%.2f", registro.getValor()))
                .collect(Collectors.toList())
                .toArray();
        JList lista = new JList(registros);

        JPanel contaDeMariaComp = new JPanel();
        JLabel nomeClienteComp = new JLabel(contaDeMaria.getNomeDoCliente());
        nomeClienteComp.setFont(new Font("Arial", Font.BOLD, 22));
        JLabel saldoClienteComp = new JLabel(String.format("%.2f", contaDeMaria.getSaldo()));
        saldoClienteComp.setFont(new Font("Arial", Font.BOLD, 22));
        contaDeMariaComp.add(nomeClienteComp, BorderLayout.CENTER);
        contaDeMariaComp.add(saldoClienteComp, BorderLayout.CENTER);
        panel.add(contaDeMariaComp);
        panel.add(lista);

        frame.add(panel);
        frame.setSize(new Dimension(500, 500));
        frame.setVisible(true);

    }
}
