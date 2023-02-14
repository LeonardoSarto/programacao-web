public class FolhaPagamento {
    private Float salarioBruto;

    private Float ir;

    private Float inss;

    private Float fgts;

    private Float salarioLiquido;

    private Float totalDescontos;

    private Pessoa pessoa;

    public Float getSalarioBruto() {
        return this.salarioBruto;
    }


    public void setSalarioBruto(Float salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public Float getIr() {
        return this.ir;
    }

    public void setIr(Float ir) {
        this.ir = ir;
    }

    public Float getInss() {
        return this.inss;
    }


    public void setInss(Float inss) {
        this.inss = inss;
    }

    public Float getFgts() {
        return this.fgts;
    }


    public void setFgts(Float fgts) {
        this.fgts = fgts;
    }

    public Float getSalarioLiquido() {
        return this.salarioLiquido;
    }


    public void setSalarioLiquido(Float salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public Float getTotalDescontos() {
        return this.totalDescontos;
    }

    public void setTotalDescontos(Float totalDescontos) {
        this.totalDescontos = totalDescontos;
    }

    public Pessoa getPessoa() {return this.pessoa;}

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }


    public void calcularFolhaPagamento() {
        salarioBruto = pessoa.getValorHora() * pessoa.getHorasTrabalhadas();
        ir = (salarioBruto * 5) / 100;
        inss = (salarioBruto * 10) / 100;
        fgts = (salarioBruto * 11) / 100;
        totalDescontos = ir + inss;
        salarioLiquido = salarioBruto - totalDescontos;
    }

    @Override
    public String toString() {
        return "Salário bruto: " + salarioBruto + "\nIR: " + ir + "\nINSS: " + inss + "\nFGTS: " + fgts + "\nTotal de descontos: " + totalDescontos + "\nSalário líquido: " + salarioLiquido;
    }
}
