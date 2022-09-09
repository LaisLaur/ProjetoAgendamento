package org.example;


import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class BufferWriter {
    public static void main(String[] args) {
        Path caminho = Paths.get
                ("C:\\Users\\laisl\\OneDrive\\Área de Trabalho\\1. Cursos Diversos\\Let.s Code\\Módulo 5 - Java\\atendimentos_ddMMyyy.csv");
        try (BufferedWriter writer = Files.newBufferedWriter(caminho, StandardOpenOption.)){
            writer.write("Escrevendo o conteúdo do arquivo...");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
