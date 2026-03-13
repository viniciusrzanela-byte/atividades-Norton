public class Agenda {

    private String data;
    private String hora;
    private Medico medico;
    private Paciente paciente;

    public Agenda(){
        try{
            data = "01/01/2000";
            hora = "00:00";
        }catch(Exception e){
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
        }
    }

    public Agenda(String data,String hora,Medico medico,Paciente paciente){
        try{
            this.data=data;
            this.hora=hora;
            this.medico=medico;
            this.paciente=paciente;
        }catch(Exception e){
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.data="01/01/2000";
            this.hora="00:00";
        }
    }

    public void setData(String data){
        try{ this.data=data; }
        catch(Exception e){
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.data="01/01/2000";
        }
    }

    public void setHora(String hora){
        try{ this.hora=hora; }
        catch(Exception e){
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.hora="00:00";
        }
    }

    public void consultar(){
        mostrar();
    }

    public void mostrar(){
        System.out.println("Agenda:");
        System.out.println("Data: "+data);
        System.out.println("Hora: "+hora);
        System.out.println("Médico: "+(medico!=null?medico.getNome():"Não informado"));
        System.out.println("Paciente: "+(paciente!=null?paciente.getNome():"Não informado"));
    }
}