import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String respostaUsuario = JOptionPane.showInputDialog("Informe números separados por vírgula");
        String valoresArray[] = respostaUsuario.split(",");

       List<String> arraySolucao = inverterValores(valoresArray);

        for (String s: arraySolucao) {
            System.out.println(s);
        }
    }

    public static List<String> inverterValores(String[] array) {
        List<String> arrayAux = new ArrayList<>();

        for (int i = array.length - 1; i >= 0; i--) {
            arrayAux.add(array[i]);
        }

        return arrayAux;
    }
}