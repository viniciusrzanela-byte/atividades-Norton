public class Recepcionista {

    private String nome;
    private String cpf;
    private String telefone;
    private String senha;

    public Recepcionista(){
        try{
            nome="Não informado";
            cpf="000.000.000-00";
            telefone="Não informado";
            senha="0000";
        }catch(Exception e){
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
        }
    }

    public Recepcionista(String nome,String cpf,String telefone,String senha){
        try{
            this.nome=nome;
            this.cpf=cpf;
            this.telefone=telefone;
            this.senha=senha;
        }catch(Exception e){
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.nome="Não informado";
            this.cpf="000.000.000-00";
            this.telefone="Não informado";
            this.senha="0000";
        }
    }

    public boolean acessar(String senha){
        if(this.senha.equals(senha)){
            mostrar();
            return true;
        }else{
            System.out.println("Acesso negado.");
            return false;
        }
    }

    public void mostrar(){
        System.out.println("Recepcionista:");
        System.out.println("Nome: "+nome);
        System.out.println("CPF: "+cpf);
        System.out.println("Telefone: "+telefone);
    }
}