import dominio.Agendamento;
import dominio.Cliente;
import excecoes.AcabouASenhaExcecao;
import servico.Agendar;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        Agendar agendar = new Agendar();
        System.out.println("Bem-vindo ao sistema de agendamento!");
        Integer opcao =0;
        do {
            System.out.println("\nSelecione a opção desejada:");
            System.out.println(" 1 - Realizar agendamento \n 2 - Listar agendamentos do dia");

            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:

                    Cliente cliente = new Cliente();
                    System.out.println("Informe o CPF:");
                    cliente.setCpf(scanner.next());
                    System.out.println("Informe o nome completo:");
                    cliente.setNome(scanner.next());


                    try {
                        Agendamento agendamento = agendar.realizarAgendamento(cliente);
                        System.out.printf("%nAgendamento realizado com sucesso!%nResumo do agendamento: %s %s%n",
                                agendamento.getIdentificador() , DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm")
                                        .format(agendamento.getHorario()));
                    } catch (AcabouASenhaExcecao e) {
                        System.err.println(e.getMessage());

                        e.printStackTrace();
                    }

                    break;
                case 2:
                    // TODO listar agendamentos
                    System.out.println(agendar.imprimirAgenda());
                    break;
                default:
                    System.out.println("Opção inválida, selecione outro serviço!");

            }
        }while (opcao!=0);

    }
}
