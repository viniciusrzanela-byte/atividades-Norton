public class Paciente 
{
    String nome;
    String cpf;
    String telefone;
    boolean genero;
    int idade;

    public void cadastrar()
    {
        System.out.println("\nPaciente cadastrado com sucesso.\n");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
        System.out.println("Gênero: " + (genero ? "Masculino" : "Feminino"));
        System.out.println("Idade: " + idade);
    }
    public void consultar()
    {
        System.out.println("Dados do Paciente:");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
        System.out.println("Gênero: " + (genero ? "Masculino" : "Feminino"));
        System.out.println("Idade: " + idade);
    }
}