import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class Recebimento extends Registro {

    private IConta contaOrigem;

    public Recebimento(Date momento, double valor, IConta contaOrigem) {
        super(momento, valor);
        this.contaOrigem = contaOrigem;
    }

    @Override
    public void verDetalhes() {
        System.out.println(" << Recebimento:");
        System.out.println(String.format("Conta origem: %s", contaOrigem.getNomeDoCliente()));
        super.verDetalhesComuns();
    }

    @Override
    public JComponent getIconComponent() {
        JLabel label = new JLabel(" << ");
        label.setFont(new Font("Arial", Font.BOLD, 18));
        return label;
    }
}
