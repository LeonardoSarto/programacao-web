import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        FolhaPagamento folhaPagamento = new FolhaPagamento();
        pessoa.setNome(JOptionPane.showInputDialog("Informe seu nome"));
        pessoa.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade")));
        pessoa.setHorasTrabalhadas(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de horas trabalhadas")));
        pessoa.setValorHora(Float.parseFloat(JOptionPane.showInputDialog("Informe a quantidade de valor que você recebe por hora")));
        folhaPagamento.setPessoa(pessoa);
        folhaPagamento.calcularFolhaPagamento();

        System.out.println(folhaPagamento);
    }
}