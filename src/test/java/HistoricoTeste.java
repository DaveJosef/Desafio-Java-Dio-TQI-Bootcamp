import org.junit.Assert;
import org.junit.Test;

import java.time.Instant;
import java.util.Date;
import java.util.LinkedList;

public class HistoricoTeste {

    @Test
    public void testeRegistrar() {
        Historico historico = new Historico();
        Saque saque = new Saque(Date.from(Instant.now()), 100D);
        historico.registrar(saque);
        LinkedList<Object> expected = new LinkedList<>() {{
            add(saque);
        }};
        Assert.assertArrayEquals(expected.toArray(), historico.getRegistros().toArray());
    }
}
