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
}
