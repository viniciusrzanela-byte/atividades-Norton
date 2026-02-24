public class Agenda 
{
    String data;
    String hora;
    Médico medico;
    Paciente paciente;

    public void consultar()
    {
        System.out.println("\nAgenda:\n");
        System.out.println("Data: " + data);
        System.out.println("Hora: " + hora);
        System.out.println("Médico: " + (medico != null ? medico.nome : "Não informado"));
        System.out.println("Paciente: " + (paciente != null ? paciente.nome : "Não informado"));
    }
    public void mostrar()
    {
        System.out.println("Agenda:");
        System.out.println("Data: " + data);
        System.out.println("Hora: " + hora);
        System.out.println("Médico: " + (medico != null ? medico.nome : "Não informado"));
        System.out.println("Paciente: " + (paciente != null ? paciente.nome : "Não informado\n\n"));
    }
}