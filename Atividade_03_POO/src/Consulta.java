public class Consulta {

    private String data;
    private String hora;
    private Medico medico;
    private Paciente paciente;
    private String motivo;
    private String historico;

    public Consulta(){
        try{
            data="01/01/2000";
            hora="00:00";
            motivo="Não informado";
            historico="Não informado";
        }catch(Exception e){
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
        }
    }

    public Consulta(String data,String hora,Medico medico,Paciente paciente,String motivo,String historico){
        try{
            this.data=data;
            this.hora=hora;
            this.medico=medico;
            this.paciente=paciente;
            this.motivo=motivo;
            this.historico=historico;
        }catch(Exception e){
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.data="01/01/2000";
            this.hora="00:00";
            this.motivo="Não informado";
            this.historico="Não informado";
        }
    }

    public void setMotivo(String motivo){
        try{ this.motivo=motivo; }
        catch(Exception e){
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.motivo="Não informado";
        }
    }

    public void setHistorico(String historico){
        try{ this.historico=historico; }
        catch(Exception e){
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.historico="Não informado";
        }
    }

    public String getData(){ return data; }
    public String getHora(){ return hora; }

    public void marcar(){ System.out.println("Consulta marcada."); }
    public void cancelar(){ System.out.println("Consulta cancelada."); }
    public void realizar(){ System.out.println("Consulta realizada."); }
    public void atualizar(){ System.out.println("Consulta atualizada."); }

    public void consultar(){ mostrar(); }

    public void mostrar(){
        System.out.println("Consulta:");
        System.out.println("Data: "+data);
        System.out.println("Hora: "+hora);
        System.out.println("Motivo: "+motivo);
        System.out.println("Histórico: "+historico);
    }
}