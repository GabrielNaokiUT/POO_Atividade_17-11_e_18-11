/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriel
 */

public class arquivo {
     
    public static void escrever(String nomeArquivo, String texto) {  // Grava uma nova linha no final do arquivo
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivo, true))) {
            bw.write(texto);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Erro ao escrever: " + e.getMessage());
        }
    }

    public static List<String> ler(String nomeArquivo) {  // Lê todas as linhas do arquivo, tratando linhas em branco ou arquivo inexistente
        List<String> linhas = new ArrayList<>();
        File file = new File(nomeArquivo);        
        if (!file.exists()) { // Se arquivo não existe, cria um vazio para evitar erro e retorna lista vazia
            try { file.createNewFile(); } 
            catch (IOException e) {
            }
            return linhas;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) { // Adiciona apenas linhas com conteúdo          
                if(!linha.trim().isEmpty()){
                    linhas.add(linha);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler: " + e.getMessage());
        }
        return linhas;
    }

    public static void reescreverArquivo(String nomeArquivo, List<String> novasLinhas) { // Reescreve o arquivo inteiro
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivo, false))) { // 'false' no FileWriter indica que o arquivo será sobrescrito
            for (String linha : novasLinhas) {
                bw.write(linha);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao reescrever: " + e.getMessage());
        }
    }
}