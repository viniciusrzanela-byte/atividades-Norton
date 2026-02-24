public class Receita 
{
    Consulta consulta;
    String data;
    String descritivo;
    
    public void prescrever()
    {
        System.out.println("Receita prescrita na data: " + data);
        System.out.println("Descrição: " + descritivo);
    }

    public void consultar()
    {
        System.out.println("Receita:");
        System.out.println("Data: " + data);
        System.out.println("Descrição: " + descritivo);
        System.out.println("Consulta: " + (consulta != null ? consulta.data + " às " + consulta.hora : "Não informado"));
    }
    public void mostrar()
    {
        System.out.println("\nReceita:");
        System.out.println("Data: " + data);
        System.out.println("Descrição: " + descritivo);
        System.out.println("Consulta: " + (consulta != null ? consulta.data + " às " + consulta.hora : "Não informado\n\n"));
    }
}
