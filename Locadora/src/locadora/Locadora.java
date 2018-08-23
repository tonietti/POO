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
public class Locadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        Perfil p1 = new Perfil("01/02/2011");
        Perfil p2 = new Perfil("11/8/2018");
        Carro cr1 = new Carro();
        Carro cr2 = new Carro();
        Moto mt1 = new Moto();
        Moto mt2 = new Moto();
        
        c1.setNome("Joao");
        c1.setNascimento("01/02/1980");
        c1.setDesconto(30);
        c1.setPerfil(p1);
        
        p1.setAcidente(0);
        p1.setMulta(2);
        
        cr1.setAno(1990);
        cr1.setModelo("uno");
        cr1.setMarca("fiat");
        cr1.setQuilometragem(154000);
        cr1.setPlaca("itt-5565");
        cr1.setPorta(4);
        
        mt1.setAno(1990);
        mt1.setModelo("titan");
        mt1.setMarca("honda");
        mt1.setQuilometragem(169000);
        mt1.setPlaca("idf-5541");
        mt1.setCilindradas(150);
    }
}
