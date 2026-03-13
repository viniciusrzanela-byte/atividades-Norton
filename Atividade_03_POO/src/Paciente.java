public class Paciente {

    private String nome;
    private String cpf;
    private String telefone;
    private boolean genero;
    private int idade;

    public Paciente(){
        try{
            nome = "Não informado";
            cpf = "000.000.000-00";
            telefone = "Não informado";
            genero = false;
            idade = 0;
        }catch(Exception e){
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
        }
    }

    public Paciente(String nome, String cpf, String telefone, boolean genero, int idade){
        try{
            this.nome = nome;
            this.cpf = cpf;
            this.telefone = telefone;
            this.genero = genero;
            this.idade = idade;
        }catch(Exception e){
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.nome = "Não informado";
            this.cpf = "000.000.000-00";
            this.telefone = "Não informado";
            this.genero = false;
            this.idade = 0;
        }
    }

    public void setNome(String nome){
        try{ this.nome = nome; }
        catch(Exception e){
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.nome = "Não informado";
        }
    }

    public void setCpf(String cpf){
        try{ this.cpf = cpf; }
        catch(Exception e){
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.cpf = "000.000.000-00";
        }
    }

    public void setTelefone(String telefone){
        try{ this.telefone = telefone; }
        catch(Exception e){
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.telefone = "Não informado";
        }
    }

    public void setGenero(boolean genero){
        try{ this.genero = genero; }
        catch(Exception e){
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.genero = false;
        }
    }

    public void setIdade(int idade){
        try{ this.idade = idade; }
        catch(Exception e){
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.idade = 0;
        }
    }

    public String getNome(){ return nome; }

    public void cadastrar(){
        System.out.println("Paciente cadastrado.");
    }

    public void consultar(){
        mostrar();
    }

    public void mostrar(){
        System.out.println("Paciente:");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
        System.out.println("Gênero: " + (genero ? "Masculino" : "Feminino"));
        System.out.println("Idade: " + idade);
    }
}