package heranca01;

public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;

    // Construtor padrão
    public Fornecedor() {
    }

    // Construtor com todos os atributos da classe Fornecedor e da classe Pessoa
    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    // Getter para o atributo 'valorCredito'
    public double getValorCredito() {
        return valorCredito;
    }

    // Setter para o atributo 'valorCredito'
    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    // Getter para o atributo 'valorDivida'
    public double getValorDivida() {
        return valorDivida;
    }

    // Setter para o atributo 'valorDivida'
    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    // Método para obter o saldo (diferença entre valorCredito e valorDivida)
    public double obterSaldo() {
        return valorCredito - valorDivida;
    }

    // Programa de teste
    public static void main(String[] args) {
        // Criando um objeto Fornecedor
        Fornecedor fornecedor = new Fornecedor("Fornecedor A", "Rua ABC", "123-456-789", 1000.0, 500.0);

        // Acessando os atributos herdados da classe Pessoa
        System.out.println("Nome do fornecedor: " + fornecedor.getNome());
        System.out.println("Endereço do fornecedor: " + fornecedor.getEndereco());
        System.out.println("Telefone do fornecedor: " + fornecedor.getTelefone());

        // Acessando os atributos da classe Fornecedor
        System.out.println("Valor de Crédito: " + fornecedor.getValorCredito());
        System.out.println("Valor de Dívida: " + fornecedor.getValorDivida());

        // Calculando e exibindo o saldo
        double saldo = fornecedor.obterSaldo();
        System.out.println("Saldo: " + saldo);
    }
}

