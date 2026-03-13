public class Receita {

    private Consulta consulta;
    private String data;
    private String descritivo;

    public Receita(){
        try{
            data="01/01/2000";
            descritivo="Não informado";
        }catch(Exception e){
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
        }
    }

    public Receita(Consulta consulta,String data,String descritivo){
        try{
            this.consulta=consulta;
            this.data=data;
            this.descritivo=descritivo;
        }catch(Exception e){
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.data="01/01/2000";
            this.descritivo="Não informado";
        }
    }

    public void prescrever(){
        System.out.println("Receita prescrita.");
    }

    public void consultar(){
        mostrar();
    }

    public void mostrar(){
        System.out.println("Receita:");
        System.out.println("Data: "+data);
        System.out.println("Descrição: "+descritivo);
    }
}