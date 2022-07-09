import javax.swing.*;
import java.awt.*;

public class RegistroComp extends BancoComp {

    private Registro registro;

    public RegistroComp(Registro registro) {
        this.registro = registro;
    }

    @Override
    public JComponent getComponente() {
        JLabel componente = new JLabel(registro.getStringIcon() + String.format("%.2f", registro.getValor()));
        componente.setFont(new Font("Arial", Font.BOLD, 18));
        return componente;
    }
}
