import java.util.LinkedList;
import java.util.List;

public class Historico {

    List<Registro> registros;

    public Historico() {
        registros = new LinkedList<>();
    }

    public void registrar(Registro registro) {
        registros.add(registro);
    }

    public void visualizar() {
        registros.forEach(IRegistro::verDetalhes);
    }
}
