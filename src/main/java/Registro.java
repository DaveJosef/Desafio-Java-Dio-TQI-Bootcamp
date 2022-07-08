import java.util.Date;

public abstract class Registro implements IRegistro {

    private Date momento;
    private double valor;

    public Registro(Date momento, double valor) {
        this.momento = momento;
        this.valor = valor;
    }

    public void verDetalhesComuns() {
        System.out.println(String.format("Momento: %s", momento));
        System.out.println(String.format("Valor: %.2f", valor));
    }
}
