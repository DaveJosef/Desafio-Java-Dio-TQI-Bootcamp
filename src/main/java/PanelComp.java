import javax.swing.*;
import java.awt.*;

public class PanelComp extends BancoComp {

    private ContaComp contaComp;
    private HistoricoComp historicoComp;

    public PanelComp(Conta conta) {
        this.contaComp = new ContaComp(conta);
        this.historicoComp = new HistoricoComp(conta.getHistorico());
    }

    @Override
    public JComponent getComponente() {
        JPanel componente = new JPanel();
        componente.add(contaComp.getComponente(), BorderLayout.WEST);
        componente.add(historicoComp.getComponente(), BorderLayout.EAST);
        return componente;
    }
}
