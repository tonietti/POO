/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora;

/**
 *
 * @author curso
 */
public class Carro {
    private int ano;
    private String modelo;
    private String marca;
    private int quilometragem;
    private String placa;
    private int porta;
    
    public int getAno() {
        return this.ano;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getMarca() {
        return this.marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public int getQuilometragem() {
        return this.quilometragem;
    }
    
    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }
    
    public String getPlaca() {
        return this.placa;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public int getPorta() {
        return this.porta;
    }
    
    public void setPorta(int porta) {
        this.porta = porta;
    }
}
