import javax.swing.*;
import java.awt.*;

public class RegistroComp extends BancoComp {

    private Registro registro;

    public RegistroComp(Registro registro) {
        this.registro = registro;
    }

    @Override
    public JComponent getComponente() {
        JComponent componente = new JPanel();
        componente.add(registro.getIconComponent());
        JLabel label = new JLabel(String.format("%.2f", registro.getValor()));
        label.setFont(new Font("Arial", Font.BOLD, 18));
        componente.add(label);
        return componente;
    }
}
