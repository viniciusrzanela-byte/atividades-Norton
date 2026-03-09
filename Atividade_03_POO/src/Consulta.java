public class Consulta 
{
    private String data;
    private String hora;
    private Médico medico;
    private Paciente paciente;
    private String motivo;
    private String historico;

    public Consulta(){}

    public Consulta(String data, String hora, Médico medico, Paciente paciente, String motivo, String historico)
    {
        this.data = data;
        this.hora = hora;
        this.medico = medico;
        this.paciente = paciente;
        this.motivo = motivo;
        this.historico = historico;
    }

    public String getData(){ return data; }
    public void setData(String data){ this.data = data; }

    public String getHora(){ return hora; }
    public void setHora(String hora){ this.hora = hora; }

    public Médico getMedico(){ return medico; }
    public void setMedico(Médico medico){ this.medico = medico; }

    public Paciente getPaciente(){ return paciente; }
    public void setPaciente(Paciente paciente){ this.paciente = paciente; }

    public String getMotivo(){ return motivo; }
    public void setMotivo(String motivo){ this.motivo = motivo; }

    public String getHistorico(){ return historico; }
    public void setHistorico(String historico){ this.historico = historico; }

    public void marcar()
    {
        System.out.println("Consulta marcada.");
    }

    public void cancelar()
    {
        System.out.println("Consulta cancelada.");
    }

    public void consultar()
    {
        mostrar();
    }

    public void realizar()
    {
        System.out.println("Consulta realizada.");
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
        System.out.println("Médico: " + (medico != null ? medico.getNome() : "Não informado"));
        System.out.println("Paciente: " + (paciente != null ? paciente.getNome() : "Não informado"));
        System.out.println("Motivo: " + motivo);
        System.out.println("Histórico: " + historico);
    }
}