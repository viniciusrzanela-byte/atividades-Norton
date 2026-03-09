public class Médico 
{
    private String nome;
    private String CRM;
    private String telefone;
    private String especialidade;
    private String senha;

    public Médico(){}

    public Médico(String nome, String CRM, String telefone, String especialidade, String senha)
    {
        this.nome = nome;
        this.CRM = CRM;
        this.telefone = telefone;
        this.especialidade = especialidade;
        this.senha = senha;
    }

    public String getNome(){ return nome; }
    public void setNome(String nome){ this.nome = nome; }

    public String getCRM(){ return CRM; }
    public void setCRM(String CRM){ this.CRM = CRM; }

    public String getTelefone(){ return telefone; }
    public void setTelefone(String telefone){ this.telefone = telefone; }

    public String getEspecialidade(){ return especialidade; }
    public void setEspecialidade(String especialidade){ this.especialidade = especialidade; }

    public String getSenha(){ return senha; }
    public void setSenha(String senha){ this.senha = senha; }

    public boolean acessar(String senha)
    {
        if(this.senha.equals(senha))
        {
            mostrar();
            return true;
        }
        else
        {
            System.out.println("Acesso negado.");
            return false;
        }
    }

    public void mostrar()
    {
        System.out.println("Médico:");
        System.out.println("Nome: " + nome);
        System.out.println("CRM: " + CRM);
        System.out.println("Telefone: " + telefone);
        System.out.println("Especialidade: " + especialidade);
    }
}