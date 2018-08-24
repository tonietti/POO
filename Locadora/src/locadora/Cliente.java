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

    public Cliente() {
        this.nascimento = new Date();
    }
    
    public Cliente(String l_nome, String data, int l_desconto, Perfil l_perfil) {
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy"); //HH:mm:ss
        Date recebeDataFormatada = null; 
        
        try{
        recebeDataFormatada = dataFormatada.parse(data); 
        }catch(ParseException e) { 
           
        }
        
        this.nome = l_nome;
        this.nascimento = recebeDataFormatada;
        this.desconto = l_desconto;
        this.perfil = l_perfil;
    }
    
    
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String l_nome) {
        this.nome = l_nome;
    }
    
    public String getNascimento() {
        return new SimpleDateFormat("dd/MM/yyyy").format(this.nascimento);
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
    
    public void setDesconto(int l_desconto) {
        this.desconto = l_desconto;
    }
    
    public Perfil getPerfil() {
        return this.perfil;
    }
    
    public void setPerfil(Perfil l_perfil) {
        this.perfil = l_perfil;
    }

    @Override
    public String toString() {       
        String data = new SimpleDateFormat("dd/MM/yyyy").format(this.nascimento);
            
        return "Cliente{" + "nome=" + this.nome + ", nascimento=" + data + ", desconto=" + this.desconto + ", perfil=" + this.perfil + '}';
    }
      
}
