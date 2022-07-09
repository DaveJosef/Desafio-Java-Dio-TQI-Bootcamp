import javax.swing.*;
import java.awt.*;

public class ContaComp extends BancoComp {

    private Conta conta;

    public ContaComp(Conta conta) {
        this.conta = conta;
    }

    @Override
    public JComponent getComponente() {
        JPanel componente = new JPanel();
        JLabel nomeClienteComp = new JLabel(String.format("%s", conta.getNomeDoCliente()));
        nomeClienteComp.setFont(new Font("Arial", Font.BOLD, 27));
        JLabel saldoClienteComp = new JLabel(String.format("%.2f", conta.getSaldo()));
        saldoClienteComp.setFont(new Font("Arial", Font.BOLD, 22));
        componente.add(nomeClienteComp, BorderLayout.CENTER);
        componente.add(saldoClienteComp, BorderLayout.CENTER);
        componente.setSize(250, 600);
        return componente;
    }
}
