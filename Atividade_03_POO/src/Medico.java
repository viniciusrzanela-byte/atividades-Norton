public class Medico {

    private String nome;
    private String CRM;
    private String telefone;
    private String especialidade;
    private String senha;

    public Medico(){
        try{
            nome = "Não informado";
            CRM = "000000";
            telefone = "Não informado";
            especialidade = "Clínico geral";
            senha = "0000";
        }catch(Exception e){
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
        }
    }

    public Medico(String nome, String CRM, String telefone, String especialidade, String senha){
        try{
            this.nome = nome;
            this.CRM = CRM;
            this.telefone = telefone;
            this.especialidade = especialidade;
            this.senha = senha;
        }catch(Exception e){
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.nome = "Não informado";
            this.CRM = "000000";
            this.telefone = "Não informado";
            this.especialidade = "Clínico geral";
            this.senha = "0000";
        }
    }

    public void setNome(String nome){
        try{
            this.nome = nome;
        }catch(Exception e){
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.nome = "Não informado";
        }
    }

    public void setCRM(String CRM){
        try{
            this.CRM = CRM;
        }catch(Exception e){
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.CRM = "000000";
        }
    }

    public void setTelefone(String telefone){
        try{
            this.telefone = telefone;
        }catch(Exception e){
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.telefone = "Não informado";
        }
    }

    public void setEspecialidade(String especialidade){
        try{
            this.especialidade = especialidade;
        }catch(Exception e){
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.especialidade = "Clínico geral";
        }
    }

    public void setSenha(String senha){
        try{
            this.senha = senha;
        }catch(Exception e){
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.senha = "0000";
        }
    }

    public String getNome(){ return nome; }

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
        System.out.println("Médico:");
        System.out.println("Nome: " + nome);
        System.out.println("CRM: " + CRM);
        System.out.println("Telefone: " + telefone);
        System.out.println("Especialidade: " + especialidade);
    }
}