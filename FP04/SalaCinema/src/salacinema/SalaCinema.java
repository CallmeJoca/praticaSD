/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salacinema;

/**
 *
 * @author Asus
 */
public class SalaCinema {
    
    public String nomeFilme;
    public int bilhetesDisponiveis;
    public int bilhetesVendidos;
    
    public SalaCinema(String s, int b){
        this.nomeFilme = s;
        this.bilhetesDisponiveis = b;
        this.bilhetesVendidos = 0;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public int getBilhetesDisponiveis() {
        return bilhetesDisponiveis;
    }

    public void setBilhetesDisponiveis(int bilhetesDisponiveis) {
        this.bilhetesDisponiveis = bilhetesDisponiveis;
    }

    public int getBilhetesVendidos() {
        return bilhetesVendidos;
    }

    public void setBilhetesVendidos(int bilhetesVendidos) {
        this.bilhetesVendidos = bilhetesVendidos;
    }
    
    public int disponiveis(){
        return this.bilhetesDisponiveis - this.bilhetesVendidos;
    }
    
    public synchronized int vender(){
        if(disponiveis() > 0){
            bilhetesVendidos++;
            return bilhetesVendidos;
        }
        return 0;
    }
    
}
