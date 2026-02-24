public class Recepcionista 
{
    String nome;
    String cpf;
    String telefone;
    String senha;
    
    public boolean acessar(String senha)
    {
        if(this.senha.equals(senha))
        {
            System.out.println("Acesso permitido.\n");
            System.out.println("Recepcionista: " + nome);
            System.out.println("CPF: " + cpf);
            System.out.println("Telefone: " + telefone);
            return true;
        }
        else
        {
            System.out.println("\nAcesso negado.\n");
            return false;
        }
    }
}