import java.util.Date;

public class Transferencia extends Registro {

    private IConta contaOrigem;
    private IConta contaDestino;

    public Transferencia(Date momento, double valor, IConta contaOrigem, IConta contaDestino) {
        super(momento, valor);
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
    }

    @Override
    public void verDetalhes() {
        System.out.println(" >> Transferência:");
        System.out.println(String.format("Conta origem: %s", contaOrigem.getNomeDoCliente()));
        System.out.println(String.format("Conta destino: %s", contaDestino.getNomeDoCliente()));
        super.verDetalhesComuns();
    }
}
