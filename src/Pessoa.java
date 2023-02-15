import java.util.Objects;

public class Pessoa {
    private String sexo;

    private Float peso;

    private Float altura;

    private Float imc;

    public Pessoa(String sexo, Float peso, Float altura) {
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.imc = CalculoImc.calcularImc(this);
    }

    private String condicaoImc() {
        if(Objects.equals(sexo, "feminino")) {
            if(imc <= 19.1) {
                return "Abaixo do peso";
            } else if(imc <= 25.8) {
                return "Peso normal";
            } else if(imc <= 27.3) {
                return "Marginalmente acima do peso";
            } else if(imc <= 32.3) {
                return "Acima do peso ideal";
            } else if(imc > 32.3) {
                return "Obeso";
            }
        } else if(Objects.equals(sexo, "masculino")) {
            if(imc <= 20.7) {
                return "Abaixo do peso";
            } else if(imc <= 26.4) {
                return "Peso normal";
            } else if(imc <= 27.8) {
                return "Marginalmente acima do peso";
            } else if(imc <= 31.1) {
                return "Acima do peso ideal";
            } else if(imc > 31.1) {
                return "Obeso";
            }
        }
        return "Imc fora do padrão";
    }

    public String getCondicaoImc() {
        return condicaoImc();
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }
}
