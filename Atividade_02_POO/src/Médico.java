public class Médico 
{
    String nome;
    String CRM;
    String telefone;
    String especialidade;
    String senha;

    boolean acessar(String senha)
    {
        if(this.senha.equals(senha))
        {
            System.out.format("Médico %s\nCRM: %s\ntelefone: %s\nespecialidade: %s\n\n",nome, CRM, telefone, especialidade);
            return true;
        }
        else
        {
            System.out.format("\nAcesso negado.\n\n");
        }
        return false;
    }
}