public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, IConta contaDestino);

    void receber(double valor, IConta contaOrigem);

    void imprimirExtrato();

    void visualizarHistorico();

    String getNomeDoCliente();
}
