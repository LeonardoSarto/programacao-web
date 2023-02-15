import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String sexo = JOptionPane.showInputDialog("Digite o seu sexo");
        Float peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o seu peso"));
        Float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a sua altura"));
        Pessoa pessoa = new Pessoa(sexo, peso, altura);

        System.out.println(pessoa.getCondicaoImc());
    }
}