import org.junit.Assert;
import org.junit.Test;

public class ContaTeste {

    @Test
    public void testeSacar() {
        Conta conta = new ContaCorrente(new Cliente());
        conta.sacar(100D);
        Assert.assertEquals(conta.getSaldo(), -100D, 0);
    }

    @Test
    public void testeDepositar() {
        Conta conta = new ContaCorrente(new Cliente());
        conta.depositar(100D);
        Assert.assertEquals(conta.getSaldo(), 100D, 0);
    }

    @Test
    public void testeTransferir() {
        Conta contaDeMaria = new ContaPoupanca(new Cliente());
        Conta contaDeJoao = new ContaCorrente(new Cliente());

        contaDeMaria.depositar(100D);
        contaDeMaria.transferir(100D, contaDeJoao);

        Assert.assertEquals(contaDeMaria.getSaldo(), 0, 0);
        Assert.assertEquals(contaDeJoao.getSaldo(), 100D, 0);
    }
}
