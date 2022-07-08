public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int numero;
    protected int agencia;
    protected double saldo;
    protected Cliente cliente;
    protected Historico historico;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.historico = new Historico();
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
        historico.registrar("Saque");
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        historico.registrar("Depósito");
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        historico.registrar("Transferência");
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    @Override
    public void visualizarHistorico() {
        System.out.println(this.numero);
        historico.visualizar();
    }
}
