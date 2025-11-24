/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package model;

/**
 *
 * @author Gabriel
 */

public class Livro {
    private final int id;
    private String titulo;
    private String autor;
    private final int idCategoria; 
    private int ano;
    private String status; 

    public Livro(int id, String titulo, String autor, int idCategoria, int ano, String status) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.idCategoria = idCategoria;
        this.ano = ano;
        this.status = status;
    }

    public int getId() { 
        return id; 
    }
    public String getTitulo() { 
        return titulo; 
    }
    public String getAutor() { 
        return autor; 
    }
    public int getIdCategoria() { 
        return idCategoria; 
    }
    public int getAno() { 
        return ano; 
    }
    public String getStatus() { 
        return status; 
    }
    
    public void setStatus(String status) { 
        this.status = status; 
    }
    public void setTitulo(String titulo) { 
        this.titulo = titulo; 
    }
    public void setAutor(String autor) { 
        this.autor = autor; 
    }
    public void setAno(int ano) { 
        this.ano = ano; 
    }

    public String toLinhaArquivo() {
        return id + ";" + titulo + ";" + autor + ";" + idCategoria + ";" + ano + ";" + status;
    }
}