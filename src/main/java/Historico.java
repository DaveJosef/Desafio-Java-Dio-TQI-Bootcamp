import java.util.LinkedList;
import java.util.List;

public class Historico {

    List<String> registros;

    public Historico() {
        registros = new LinkedList<>();
    }

    public void registrar(String registro) {
        registros.add(registro);
    }

    public void visualizar() {
        registros.forEach(System.out::println);
    }
}
