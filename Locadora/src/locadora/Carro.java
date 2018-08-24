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
public class Carro extends Veiculo {
    private int porta;
    
    public Carro() {
    }
 
    public Carro(int l_ano, String l_modelo, String l_marca, int l_quilometragem, String l_placa, int l_porta) {
        super(l_ano,l_modelo,l_marca,l_quilometragem,l_placa);
        this.porta = l_porta;
    }
        
    public int getPorta() {
        return this.porta;
    }
    
    public void setPorta(int l_placa) {
        this.porta = l_placa;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", porta=" + this.porta + '}';        
    }  

}

