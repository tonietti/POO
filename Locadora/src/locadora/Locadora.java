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
        
        Perfil p1 = new Perfil("01/02/2011",0,2);
        Perfil p2 = new Perfil("11/8/2018");
                        
        Cliente c1 = new Cliente("Joao","01/02/1980",30,p1);
        Cliente c2 = new Cliente();  

        Carro cr1 = new Carro(1990,"uno","fiat",154000,"itt-5565",4);
        Carro cr2 = new Carro();
        
        Moto mt1 = new Moto(1990,"titan","honda",169000,"idf-5541",150);
        Moto mt2 = new Moto();
            
              
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());   
       
        System.out.println(cr1.toString());
        System.out.println(cr2.toString());
        
        System.out.println(mt1.toString());
        System.out.println(mt2.toString());
    }
}
