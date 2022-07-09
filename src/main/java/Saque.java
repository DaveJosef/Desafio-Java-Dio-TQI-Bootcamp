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
    public String getStringIcon() {
        return " -> ";
    }
}
