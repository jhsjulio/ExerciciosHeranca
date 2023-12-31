package heranca01;

public class Empregado extends Pessoa {
    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    // Construtor padrão
    public Empregado() {
    }

    // Construtor com todos os atributos da classe Empregado e da classe Pessoa
    public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    // Getter para o atributo 'codigoSetor'
    public int getCodigoSetor() {
        return codigoSetor;
    }

    // Setter para o atributo 'codigoSetor'
    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    // Getter para o atributo 'salarioBase'
    public double getSalarioBase() {
        return salarioBase;
    }

    // Setter para o atributo 'salarioBase'
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    // Getter para o atributo 'imposto'
    public double getImposto() {
        return imposto;
    }

    // Setter para o atributo 'imposto'
    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    // Método para calcular o salário líquido após desconto de impostos
    public double calcularSalario() {
        double salarioLiquido = salarioBase - (salarioBase * (imposto / 100.0));
        return salarioLiquido;
    }

   
    
}

