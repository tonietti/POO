/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author curso
 */
public class Perfil {
    private Date emissaoCNH;
    private int multa;
    private int acidente;
    
    public Perfil(String data) {
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy"); //HH:mm:ss
        Date recebeDataFormatada = null; 
        
        try{
        recebeDataFormatada = dataFormatada.parse(data); 
        }catch(ParseException e) { 
           
        }
        
        this.emissaoCNH = recebeDataFormatada;
    }
    
    public Date getEmissaoCNH() {
        return this.emissaoCNH;
    }
    
    public void setEmissaoCNH(String data) {
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy"); //HH:mm:ss
        Date recebeDataFormatada = null; 
        
        try{
        recebeDataFormatada = dataFormatada.parse(data); 
        }catch(ParseException e) { 
           
        }
        
        this.emissaoCNH = recebeDataFormatada;
    }
    
    public int getMulta() {
        return this.multa;
    }
    
    public void setMulta(int multa) {
        this.multa = multa;
    }
    
    public int getAcidente() {
        return this.acidente;
    }
    
    public void setAcidente(int acidente) {
        this.acidente = acidente;
    }
    
}
