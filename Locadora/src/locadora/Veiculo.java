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
public class Veiculo {
    private int ano;
    private String modelo;
    private String marca;
    private int quilometragem;
    private String placa;
    
    public Veiculo() {
    }
    
    public Veiculo(int l_ano, String l_modelo, String l_marca, int l_quilometragem, String l_placa) {
        this.ano = l_ano;
        this.modelo = l_modelo;
        this.marca = l_marca;
        this.quilometragem = l_quilometragem;
        this.placa = l_placa;
    }
    
    public int getAno() {
        return this.ano;
    }
    
    public void setAno(int l_ano) {
        this.ano = l_ano;
    }
    
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String l_modelo) {
        this.modelo = l_modelo;
    }
    
    public String getMarca() {
        return this.marca;
    }
    
    public void setMarca(String l_marca) {
        this.marca = l_marca;
    }
    
    public int getQuilometragem() {
        return this.quilometragem;
    }
    
    public void setQuilometragem(int l_quilometragem) {
        this.quilometragem = l_quilometragem;
    }
    
    public String getPlaca() {
        return this.placa;
    }
    
    public void setPlaca(String l_placa) {
        this.placa = l_placa;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "ano=" + ano + ", modelo=" + modelo + ", marca=" + marca + ", quilometragem=" + quilometragem + ", placa=" + placa + '}';
    }   
    
}
