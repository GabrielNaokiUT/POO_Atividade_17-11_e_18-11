/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Gabriel
 */

public class Categoria {
    private final int id;
    private String descricao;

    public Categoria(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public int getId() { 
        return id;
    } 
    public String getDescricao() { 
        return descricao; 
    }
    
    public void setDescricao(String descricao) { 
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return id + ";" + descricao;
    }
}