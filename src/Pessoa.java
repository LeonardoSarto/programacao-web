public class Pessoa {

    private String nome;

    private Integer idade;

    private Float valorHora;

    private Integer horasTrabalhadas;

    public Float getValorHora() {
        return this.valorHora;
    }

    public void setValorHora(Float valorHora) {
        this.valorHora = valorHora;
    }

    public Integer getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Integer getIdade() {
        return this.idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getNome() {return this.nome;}

    public void setNome(String nome) {this.nome = nome;}
}
