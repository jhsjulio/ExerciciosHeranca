package heranca01;

public class Vendedor extends Empregado {
    private double valorVendas;
    private double comissao;

    // Construtor padrão
    public Vendedor() {
    }

    // Construtor com todos os atributos da classe Vendedor, da classe Empregado e da classe Pessoa
    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    // Getter para o atributo 'valorVendas'
    public double getValorVendas() {
        return valorVendas;
    }

    // Setter para o atributo 'valorVendas'
    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    // Getter para o atributo 'comissao'
    public double getComissao() {
        return comissao;
    }

    // Setter para o atributo 'comissao'
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    // Redefinição do método calcularSalario para incluir a comissão
    @Override
    public double calcularSalario() {
        double salarioBase = getSalarioBase();
        double imposto = getImposto();
        double comissao = getComissao();
        double salarioLiquido = salarioBase - (salarioBase * (imposto / 100.0)) + (valorVendas * (comissao / 100.0));
        return salarioLiquido;
    }

    // Programa de teste
    public static void main(String[] args) {
      
    }
}
