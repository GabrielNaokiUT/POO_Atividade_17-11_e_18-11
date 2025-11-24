/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Gabriel
 */

public class Movimentacao {
    private final int id;
    private final int idLivro; 
    private final String tipo; 
    private final String responsavel;
    private final String data; 
    private final String observacao;

    public Movimentacao(int id, int idLivro, String tipo, String responsavel, String data, String observacao) {
        this.id = id;
        this.idLivro = idLivro;
        this.tipo = tipo;
        this.responsavel = responsavel;
        this.data = data;
        this.observacao = observacao;
    }

    public int getId() { 
        return id; 
    }
    public int getIdLivro() { 
        return idLivro; 
    }
    public String getTipo() { 
        return tipo; 
    }
    public String getData() { 
        return data; 
    }
    public String getResponsavel() { 
        return responsavel; 
    }

    public String toLinhaArquivo() {
        return id + ";" + idLivro + ";" + tipo + ";" + responsavel + ";" + data + ";" + observacao;
    }
}