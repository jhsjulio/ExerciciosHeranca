package heranca01;

public class Operario extends Empregado {
    private double valorProducao;
    private double comissao;

    // Construtor padrão
    public Operario() {
    }

    // Construtor com todos os atributos da classe Operario, da classe Empregado e da classe Pessoa
    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    // Getter para o atributo 'valorProducao'
    public double getValorProducao() {
        return valorProducao;
    }

    // Setter para o atributo 'valorProducao'
    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
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
        double salarioLiquido = salarioBase - (salarioBase * (imposto / 100.0)) + (valorProducao * (comissao / 100.0));
        return salarioLiquido;
    }

    // Programa de teste
    public static void main(String[] args) {
       
    }
}

