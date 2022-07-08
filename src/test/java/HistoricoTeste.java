import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class HistoricoTeste {

    @Test
    public void testeRegistrar() {
        Historico historico = new Historico();
        historico.registrar("Saque");
        LinkedList<Object> expected = new LinkedList<>() {{
            add("Saque");
        }};
        Assert.assertArrayEquals(expected.toArray(), historico.registros.toArray());
    }
}
