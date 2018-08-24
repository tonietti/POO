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
public class Moto extends Veiculo {
    private int cilindradas;
    
    public Moto() {
    }
    
    public Moto(int l_ano, String l_modelo, String l_marca, int l_quilometragem, String l_placa, int l_cilindradas) {
        super(l_ano,l_modelo,l_marca,l_quilometragem,l_placa);
        this.cilindradas = l_cilindradas;
    }
           
    public int getCilindradas() {
        return this.cilindradas;
    }
    
    public void setCilindradas(int l_cilindradas) {
        this.cilindradas = l_cilindradas;
    }   

    @Override
    public String toString() {
        return super.toString() + ", cilindradas=" + this.cilindradas + '}';        
    }        
    
}
