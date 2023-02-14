import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String valores = JOptionPane.showInputDialog("Informe 3 valores");
        String valoresArray[] = valores.split(";");

        valoresArray = valoresOrdemCrescente(valoresArray);

        System.out.println(valoresArray[0]);
        System.out.println(valoresArray[1]);
        System.out.println(valoresArray[2]);
    }

    public static String[] valoresOrdemCrescente(String[] valoresArray) {
        String aux;

        if(Integer.parseInt(valoresArray[0]) > Integer.parseInt(valoresArray[1])) {
            aux = valoresArray[1];
            valoresArray[1] = valoresArray[0];
            valoresArray[0] = aux;
        }

        if(Integer.parseInt(valoresArray[1]) > Integer.parseInt(valoresArray[2])) {
            aux = valoresArray[2];
            valoresArray[2] = valoresArray[1];
            valoresArray[1] = aux;
        }

        if(Integer.parseInt(valoresArray[0]) > Integer.parseInt(valoresArray[1])) {
            aux = valoresArray[1];
            valoresArray[1] = valoresArray[0];
            valoresArray[0] = aux;
        }

        return valoresArray;
    }
}

