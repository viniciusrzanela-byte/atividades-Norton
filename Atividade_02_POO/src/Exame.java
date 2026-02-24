public class Exame 
{
    Consulta consulta;
    String data;
    String descritivo;
    
    public void solicitar() 
    {
        System.out.println("Exame solicitado para a data: " + data);
    }

    public void consultar() 
    {
        System.out.println("\nExame: " + descritivo);
        System.out.println("Data: " + data);
        System.out.println("Descrição: " + descritivo);
        System.out.println("Consulta: " + (consulta != null ? consulta.data + " às " + consulta.hora : "Não informado\n\n"));
    }
}