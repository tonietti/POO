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
public class Cliente {
    private String nome;
    private Date nascimento;
    private int desconto;
    private Perfil perfil;
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Date getNascimento() {
        return this.nascimento;
    }
    
    public void setNascimento(String data) {
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy"); //HH:mm:ss
        Date recebeDataFormatada = null; 
        
        try{
        recebeDataFormatada = dataFormatada.parse(data); 
        }catch(ParseException e) { 
           
        }
        this.nascimento = recebeDataFormatada;
    }
    
    public int getDesconto() {
        return this.desconto;
    }
    
    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }
    
    public Perfil getPerfil() {
        return this.perfil;
    }
    
    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    boolean getPerfil(Date emissaoCNH) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
