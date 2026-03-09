public class Paciente 
{
    private String nome;
    private String cpf;
    private String telefone;
    private boolean genero;
    private int idade;

    public Paciente(){}

    public Paciente(String nome, String cpf, String telefone, boolean genero, int idade)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.genero = genero;
        this.idade = idade;
    }

    public String getNome(){ return nome; }
    public void setNome(String nome){ this.nome = nome; }

    public String getCpf(){ return cpf; }
    public void setCpf(String cpf){ this.cpf = cpf; }

    public String getTelefone(){ return telefone; }
    public void setTelefone(String telefone){ this.telefone = telefone; }

    public boolean isGenero(){ return genero; }
    public void setGenero(boolean genero){ this.genero = genero; }

    public int getIdade(){ return idade; }
    public void setIdade(int idade){ this.idade = idade; }

    public void cadastrar()
    {
        System.out.println("Paciente cadastrado.");
    }

    public void consultar()
    {
        mostrar();
    }

    public void mostrar()
    {
        System.out.println("Paciente:");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
        System.out.println("Gênero: " + (genero ? "Masculino" : "Feminino"));
        System.out.println("Idade: " + idade);
    }
}