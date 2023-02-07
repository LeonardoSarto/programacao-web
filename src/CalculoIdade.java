import javax.swing.*;
import java.util.Scanner;

public class CalculoIdade {
    public static void main(String[] args) {
        String respostaUsuario = JOptionPane.showInputDialog("Digite uma idade");
        Integer idade = Integer.parseInt(respostaUsuario);

        if(idade >= 0 && idade <= 10) {
            System.out.println("Então você é uma criança");
        } else if(idade <= 17) {
            System.out.println("Então você é um adolescente");
        } else if(idade <= 59) {
            System.out.println("Então você é um adulto");
        } else {
            System.out.println("Então você é um idoso");
        }

        Pessoa pessoa = new Pessoa();

        pessoa.setIdade(idade);

        System.out.println("Com " + pessoa.getIdade() + " anos");
    }
}