import java.util.Scanner;

public class App 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        Médico medicoA = new Médico();
        medicoA.nome = "João";
        medicoA.CRM = "CRM/SP 000001";
        medicoA.telefone = "+55 11 00000-0001";
        medicoA.especialidade = "Fisioterapia";
        medicoA.senha = "12345";

        Paciente pacienteA = new Paciente();
        pacienteA.nome = "Jonas";
        pacienteA.cpf = "123.456.789-44";
        pacienteA.telefone = "+55 11 00000-0002";
        pacienteA.genero = true;
        pacienteA.idade = 24;

        Recepcionista recepcionistaA = new Recepcionista();
        recepcionistaA.nome = "Manuel";
        recepcionistaA.cpf = "987.654.321-44";
        recepcionistaA.telefone = "+55 11 00000-0003";
        recepcionistaA.senha = "67890";

        Agenda agendaA = new Agenda();
        agendaA.data = "30/02/2026";
        agendaA.hora = "18:00";
        agendaA.medico = medicoA;
        agendaA.paciente = pacienteA;

        Consulta consultaA = new Consulta();
        consultaA.data = "30/02/2026";
        consultaA.hora = "18:00";
        consultaA.medico = medicoA;
        consultaA.paciente = pacienteA;
        consultaA.motivo = "Recuperação de perna quebrada";
        consultaA.historico = "Primeira sessão";

        Receita receitaA = new Receita();
        receitaA.consulta = consultaA;
        receitaA.data = "30/02/2026";
        receitaA.descritivo = "Relaxante muscular";

        Exame exameA = new Exame();
        exameA.consulta = consultaA;
        exameA.data = "05/03/2026";
        exameA.descritivo = "Raio-X da perna";

        System.out.print("Digite a senha da recepcionista: ");
        String senhaRecep = scanner.nextLine();

        if(recepcionistaA.acessar(senhaRecep))
        {
            pacienteA.cadastrar();
            pacienteA.consultar();
            agendaA.consultar();
        }

        System.out.print("\nDigite a senha do médico: ");
        String senhaMedico = scanner.nextLine();

        if(medicoA.acessar(senhaMedico))
        {
            consultaA.marcar();
            consultaA.consultar();
            consultaA.realizar();
            consultaA.atualizar();

            receitaA.prescrever();
            receitaA.consultar();

            exameA.solicitar();
            exameA.consultar();
        }

        scanner.close();
    }
}