import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class Deposito extends Registro {

    public Deposito(Date momento, double valor) {
        super(momento, valor);
    }

    @Override
    public void verDetalhes() {
        System.out.println(" <- Depósito:");
        super.verDetalhesComuns();
    }

    @Override
    public JComponent getIconComponent() {
        JLabel label = new JLabel(" <- ");
        label.setFont(new Font("Arial", Font.BOLD, 18));
        return label;
    }
}
