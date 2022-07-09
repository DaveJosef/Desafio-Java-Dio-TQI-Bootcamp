import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class Saque extends Registro {

    public Saque(Date momento, double valor) {
        super(momento, valor);
    }

    @Override
    public void verDetalhes() {
        System.out.println(" -> Saque:");
        super.verDetalhesComuns();
    }

    @Override
    public JComponent getIconComponent() {
        JLabel label = new JLabel(" -> ");
        label.setFont(new Font("Arial", Font.BOLD, 18));
        return label;
    }
}
