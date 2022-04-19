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
public class posto extends Thread {
    private SalaCinema sala;
    private String nomePosto;
    
    public posto(SalaCinema sala, String nomePosto){
        super();
        this.sala = sala;
        this.nomePosto = nomePosto;
        this.start();
    }
    
    @Override
    public void run(){
        int pausa;
        while (true){
            try {
                pausa = 2; //(int)(Math.random()* 2000);
                sleep(pausa);
                System.out.println( this.nomePosto+" vendeu o bilhete " + sala.vender() + " para o filme " + sala.nomeFilme);
                if (sala.disponiveis() == 0){
                    System.out.println(this.nomePosto + " fim");
                    break;
                }
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }  
        }
    }
    
}
