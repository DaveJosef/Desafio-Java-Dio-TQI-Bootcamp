import javax.swing.*;
import java.awt.*;

public class HistoricoComp extends BancoComp {

    private Historico historico;

    public HistoricoComp(Historico historico) {
        this.historico = historico;
    }

    @Override
    public JComponent getComponente() {
        JList componente = new JList(historico.getRegistros().toArray());
        componente.setCellRenderer(new ListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList jList, Object o, int i, boolean b, boolean b1) {
                return new RegistroComp((Registro) o).getComponente();
            }
        });
        return componente;
    }
}
