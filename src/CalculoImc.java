import java.util.Objects;

public class CalculoImc {

    public static Float calcularImc(Pessoa pessoa) {
        return pessoa.getPeso() / (pessoa.getAltura() * pessoa.getAltura());
    }

}
