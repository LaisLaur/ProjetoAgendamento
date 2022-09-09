package org.example;

import dominio.Agendamento;
import servico.Agendar;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.format.DateTimeFormatter;

public class AgendamentoArquivo {

    private static Path caminho = Paths.get
            ("C:\\Users\\laisl\\OneDrive\\Área de Trabalho\\1. Cursos Diversos\\Let.s Code\\Módulo 5 - Java\\atendimentos_ddMMyyy.csv");

    public static void main(String[] args) {

        Agendar agendar = new Agendar();

    public static void agendarCSV (Agendar agendar) throws IOException{
        if (!caminho.toFile().exists()){
            caminho.toFile().createNewFile();
        }
        try (BufferedWriter writer = Files.newBufferedWriter(caminho, StandardOpenOption.APPEND)){
            String agendamentoTexto = String.format("%s, %s, %s", agendamento.getIdentificador(), cliente.getCliente(),
                    DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm").format(agendamento.getHorario()));
            writer.write(agendamentoTexto);
        }

    }
    }
}
