package heranca01;

public class Main {

	 // Programa de teste Administrador
    public static void main(String[] args) {
        // Criando um objeto Administrador
        //Administrador administrador = new Administrador("Administrador A", "Rua teresa", "9999-9999", 1, 2000.0, 10.0, 300.0);

        /*/ Acessando os atributos herdados da classe Pessoa
        System.out.println("Nome do administrador: " + administrador.getNome());
        System.out.println("Endereço do administrador: " + administrador.getEndereco());
        System.out.println("Telefone do administrador: " + administrador.getTelefone());

        // Acessando os atributos da classe Empregado
        System.out.println("Código do Setor: " + administrador.getCodigoSetor());
        System.out.println("Salário Base: " + administrador.getSalarioBase());
        System.out.println("Imposto: " + administrador.getImposto() + "%");

        // Acessando o atributo da classe Administrador
        System.out.println("Ajuda de Custo: " + administrador.getAjudaDeCusto());

        // Calculando e exibindo o salário líquido
        double salarioLiquido = administrador.calcularSalario();
        System.out.println("Salário Líquido: " + salarioLiquido);
        
        
        
     /* Criando um objeto Empregado
        Empregado empregado = new Empregado("Empregado A", "Rua teresa", "9999-9999", 1, 2000.0, 10.0);

        // Acessando os atributos herdados da classe Pessoa
        System.out.println("Nome do empregado: " + empregado.getNome());
        System.out.println("Endereço do empregado: " + empregado.getEndereco());
        System.out.println("Telefone do empregado: " + empregado.getTelefone());

        // Acessando os atributos da classe Empregado
        System.out.println("Código do Setor: " + empregado.getCodigoSetor());
        System.out.println("Salário Base: " + empregado.getSalarioBase());
        System.out.println("Imposto: " + empregado.getImposto() + "%");

        // Calculando e exibindo o salário líquido
        double salarioLiquido = empregado.calcularSalario();
        System.out.println("Salário Líquido: " + salarioLiquido);
        
    
        // Criando um objeto Operario
        Operario operario = new Operario("Operario A", "Rua teresa", "99999-9999", 1, 1500.0, 8.0, 5000.0, 5.0);

        // Acessando os atributos herdados da classe Pessoa
        System.out.println("Nome do operario: " + operario.getNome());
        System.out.println("Endereço do operario: " + operario.getEndereco());
        System.out.println("Telefone do operario: " + operario.getTelefone());

        // Acessando os atributos da classe Empregado
        System.out.println("Código do Setor: " + operario.getCodigoSetor());
        System.out.println("Salário Base: " + operario.getSalarioBase());
        System.out.println("Imposto: " + operario.getImposto() + "%");

        // Acessando os atributos da classe Operario
        System.out.println("Valor de Produção: " + operario.getValorProducao());
        System.out.println("Comissão: " + operario.getComissao() + "%");

        // Calculando e exibindo o salário líquido
        double salarioLiquido = operario.calcularSalario();
        System.out.println("Salário Líquido: " + salarioLiquido);
*/
        
        // Criando um objeto Vendedor
        Vendedor vendedor = new Vendedor("Vendedor A", "Rua terese", "9999-9999", 1, 1500.0, 8.0, 10000.0, 5.0);

        // Acessando os atributos herdados da classe Pessoa
        System.out.println("Nome do vendedor: " + vendedor.getNome());
        System.out.println("Endereço do vendedor: " + vendedor.getEndereco());
        System.out.println("Telefone do vendedor: " + vendedor.getTelefone());

        // Acessando os atributos da classe Empregado
        System.out.println("Código do Setor: " + vendedor.getCodigoSetor());
        System.out.println("Salário Base: " + vendedor.getSalarioBase());
        System.out.println("Imposto: " + vendedor.getImposto() + "%");

        // Acessando os atributos da classe Vendedor
        System.out.println("Valor de Vendas: " + vendedor.getValorVendas());
        System.out.println("Comissão: " + vendedor.getComissao() + "%");

        // Calculando e exibindo o salário líquido
        double salarioLiquido = vendedor.calcularSalario();
        System.out.println("Salário Líquido: " + salarioLiquido);
    
    
    }
    
    

}
	
