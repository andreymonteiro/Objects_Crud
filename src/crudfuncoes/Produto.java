/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudfuncoes;

/**
 *
 * @author tarde.cetafaju
 */
public class Produto {
    private int id;
    private String nome;
    private String desc;
    private double valor;

    
    public Produto() {
    }

    public Produto(String nome, String desc, double valor) {
        this.nome = nome;
        this.desc = desc;
        this.valor = valor;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
