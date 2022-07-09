import lombok.Getter;

import java.time.Instant;
import java.util.Date;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    @Getter
    protected int numero;
    @Getter
    protected int agencia;
    @Getter
    protected double saldo;
    protected Cliente cliente;
    @Getter
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
        Registro registro = new Saque(Date.from(Instant.now()), valor);
        historico.registrar(registro);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        Registro registro = new Deposito(Date.from(Instant.now()), valor);
        historico.registrar(registro);
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.diminuirSaldo(valor);
        contaDestino.receber(valor, this);
        Registro registro = new Transferencia(Date.from(Instant.now()), valor, contaDestino);
        historico.registrar(registro);
    }

    @Override
    public void receber(double valor, IConta contaOrigem) {
        this.aumentarSaldo(valor);
        Registro registro = new Recebimento(Date.from(Instant.now()), valor, contaOrigem);
        historico.registrar(registro);
    }

    private void aumentarSaldo(double valor) {
        this.saldo += valor;
    }

    private void diminuirSaldo(double valor) {
        this.saldo -= valor;
    }

    @Override
    public String getNomeDoCliente() {
        return cliente.getNome();
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.getNomeDoCliente()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        historico.visualizar();
    }

    @Override
    public void visualizarHistorico() {
        System.out.println(this.numero);
        historico.visualizar();
    }
}
