public class Consulta 
{
    String data;
    String hora;
    Médico medico;
    Paciente paciente;
    String motivo;
    String historico;

    public void marcar()
    {
        System.out.println("Consulta marcada para " + data + " às " + hora + ".");
    }

    public void cancelar()
    {
        System.out.println("Consulta cancelada.");
    }

    public void consultar()
    {
        System.out.println("Consultando dados da consulta...");
        mostrar();
    }

    public void realizar()
    {
        System.out.println("Consulta realizada com sucesso.");
    }

    public void atualizar()
    {
        System.out.println("Consulta atualizada.");
    }

    public void mostrar()
    {
        System.out.println("Consulta:");
        System.out.println("Data: " + data);
        System.out.println("Hora: " + hora);
        System.out.println("Médico: " + (medico != null ? medico.nome : "Não informado"));
        System.out.println("Paciente: " + (paciente != null ? paciente.nome : "Não informado"));
        System.out.println("Motivo: " + motivo);
        System.out.println("Histórico: " + historico);
    }
}