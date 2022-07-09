import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class Transferencia extends Registro {

    private IConta contaDestino;

    public Transferencia(Date momento, double valor, IConta contaDestino) {
        super(momento, valor);
        this.contaDestino = contaDestino;
    }

    @Override
    public void verDetalhes() {
        System.out.println(" >> Transferência:");
        System.out.println(String.format("Conta destino: %s", contaDestino.getNomeDoCliente()));
        super.verDetalhesComuns();
    }

    @Override
    public JComponent getIconComponent() {
        JLabel label = new JLabel(" >> ");
        label.setFont(new Font("Arial", Font.BOLD, 18));
        return label;
    }
}
