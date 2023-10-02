package heranca01;

public class Administrador extends Empregado {
    private double ajudaDeCusto;

    // Construtor padrão
    public Administrador() {
    }

    // Construtor com todos os atributos da classe Administrador, da classe Empregado e da classe Pessoa
    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    // Getter para o atributo 'ajudaDeCusto'
    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    // Setter para o atributo 'ajudaDeCusto'
    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    // Redefinição do método calcularSalario para incluir a ajuda de custo
    @Override
    public double calcularSalario() {
        double salarioBase = getSalarioBase();
        double imposto = getImposto();
        double salarioLiquido = salarioBase - (salarioBase * (imposto / 100.0)) + ajudaDeCusto;
        return salarioLiquido;
    }

   
}

