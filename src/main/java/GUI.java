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
        contaDeMaria.receber(1000D, contaDeJoao);

        panel.add(new PanelComp(contaDeMaria).getComponente());

        frame.add(panel);
        frame.setSize(new Dimension(1280, 720));
        frame.setVisible(true);

    }
}
