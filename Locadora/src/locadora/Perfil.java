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
    
    
    public Perfil() {
        this.emissaoCNH = new Date();
    }
    
    public Perfil (String data) {
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy"); //HH:mm:ss
        Date recebeDataFormatada = null; 
        
        try{
        recebeDataFormatada = dataFormatada.parse(data); 
        }catch(ParseException e) { 
        }
        
        this.emissaoCNH = recebeDataFormatada;
    }
    
    public Perfil(String data, int l_multa, int l_acidente) {
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy"); //HH:mm:ss
        Date recebeDataFormatada = null; 
        
        try{
        recebeDataFormatada = dataFormatada.parse(data); 
        }catch(ParseException e) { 
        }
        
        this.emissaoCNH = recebeDataFormatada;
        this.multa = l_multa;
        this.acidente = l_acidente;
    }
    
    public String getEmissaoCNH() {
        return new SimpleDateFormat("dd/MM/yyyy").format(this.emissaoCNH);
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
    
    public void setMulta(int l_multa) {
        this.multa = l_multa;
    }
    
    public int getAcidente() {
        return this.acidente;
    }
    
    public void setAcidente(int l_acidente) {
        this.acidente = l_acidente;
    }

    @Override
    public String toString() {
        String data = new SimpleDateFormat("dd/MM/yyyy").format(this.emissaoCNH);
        
        return "Perfil{" + "emissaoCNH=" + data + ", multa=" + this.multa + ", acidente=" + this.acidente + '}';
    }
    
}
